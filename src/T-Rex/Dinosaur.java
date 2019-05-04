import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class TRex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosaur extends Actor implements IGameSubject
{

    private final int GRAVITY = 1;
    private int velocity;
    private int delayTimer;
    private int page;
    private IGameObserver trexObserverReward;
    private IGameObserver trexObserverObstacle;
    private String touchedClassName;
    int x = 40;
    int y = 40;
    int delay;
    int moveOffset;
    public Dinosaur() {
        getImage().scale(getImage().getWidth()*40/100, getImage().getHeight()*40/100);
        velocity=0;
        delay = 0;
        moveOffset = 30;
    }

    /**
     * Act - do whatever the TRex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        delayTimer = (delayTimer+1)%16; // the last number is total frame delay
        if (delayTimer == 0) // if time to change image, do so
        {
            page = (page+1)%16; // the last number is total images in animation
            setImage("dinosaur"+(page+1)+".gif");
            getImage(). scale(getImage().getWidth()*x/100, getImage().getHeight()*y/100);
        }
        fall();
        if (Greenfoot.isKeyDown("space") && getY() > 442) jump();

        checkCollision();

        if(delay>0){
            turn(moveOffset);
            moveOffset *= -1;
            delay--;
        }

    }

    public void checkCollision() {
        if(isTouching(Coin.class) || isTouching(Food.class) || isTouching(Bird.class)
        || isTouching(Cactus.class) || isTouching(Stones.class)){
            Actor touched = getOneIntersectingObject(Actor.class);
            getWorld().removeObject(touched);
            this.touchedClassName = touched.getClass().getName();

            if(touchedClassName.equals("Cactus") || touchedClassName.equals("Stones") || touchedClassName.equals("Bird"))
            {
                Greenfoot.playSound("obstacles.wav");
                if(delay==0)
                    delay = 40;
            }
            else{
                Greenfoot.playSound("rewards.wav");
            }

            notifyObservers();
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if(getY() > 442){
            velocity = 0;
        }
        else{
            velocity = velocity + GRAVITY;
        }
    }

    public void jump()
    {
        velocity = velocity - 18;
    }

    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("space") && getY() > 442)
            jump();
    }  

    public void notifyObservers()
    {
        MyWorld world=(MyWorld)getWorld();
        trexObserverReward=(IGameObserver)world.getScoreBoard();
        trexObserverObstacle=(IGameObserver)world.getLifeBar();
        this.trexObserverReward.update(this.touchedClassName);
        this.trexObserverObstacle.update(this.touchedClassName);
    }
}
