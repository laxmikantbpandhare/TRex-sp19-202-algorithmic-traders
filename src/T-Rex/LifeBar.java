import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class LifeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeBar extends Actor implements IGameObserver,IGameSubject
{
    int life = 6;
    int lifeBarWidth = 120; 
    int lifeBarHeight = 15;
    int pixelsPerLifePoint = (int)lifeBarWidth / life;
    IGameObserver gameOver;

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
        if(life==0)
            notifyObservers();
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
        if(type.equals("Bird") ||type.equals("Cactus")||type.equals("Stones"))
        looseLife();  
    }
    public void notifyObservers()
    {
        GameInfo endGame=new GameInfo();
        MyWorld world=(MyWorld)getWorld();
        CurrentScore scoreBoard=world.getScoreBoard();
        int score=scoreBoard.getScore();
        //endGame.makeImage(score);
        world.addObject(endGame,world.getWidth()/2,world.getHeight()/2);
    }
}
