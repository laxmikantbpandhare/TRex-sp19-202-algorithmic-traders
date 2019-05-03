import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LifeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeBar extends Actor implements IGameObserver
{
    int life = 6;
    int lifeBarWidth = 120; 
    int lifeBarHeight = 15;
    int pixelsPerLifePoint = (int)lifeBarWidth / life;
    private Mediator mediator = null;

    /**
     * Act - do whatever the LifeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public LifeBar()
    {
    }

    public void act() 
    {
        display();
    } 

    public void display()
    {
        setImage(new GreenfootImage(lifeBarWidth + 2, lifeBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0,lifeBarWidth + 1, lifeBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, life*pixelsPerLifePoint,lifeBarHeight);
    }

    public void looseLife()
    {
        life--;
    }

    public void update(String type)
    {
        if(type.equals("Bird") ||type.equals("Cactus")||type.equals("Stones")){
            looseLife();
            if(life==0){
                if (mediator == null){
                    World myWorld = getWorld();
                    List<Mediator> objects = myWorld.getObjects(Mediator.class);
                    mediator = objects.get(0);
                    mediator.endGame();
                }
            }
        }

    }

    public int getLife(){
        return this.life;
    }
}
