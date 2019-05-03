import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class TRex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosaur extends Leaf implements IGameSubject
{
    //GifImage dino = new GifImage("dinosaur.gif");
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
        if(touch(Coin.class) || touch(Food.class) || touch(Bird.class)
        || touch(Cactus.class) || touch(Stones.class)) {
            Actor touched = getOneIntersectingObject(Actor.class);

            this.touchedClassName = touched.getClass().getName();
            notifyObservers();
            getWorld().removeObject(touched);
            
            if(touchedClassName.equals("Cactus") || touchedClassName.equals("Stones") || touchedClassName.equals("Bird"))
            {
                //Greenfoot.playSound("obstacles.wav");
                if(delay==0)
                    delay = 40;
            }
            else{
                //Greenfoot.playSound("rewards.wav");
            }
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

    /** This method is a pixel perfect collision detection. 
     * Return, if it intersects an actor of the given class */
    public boolean touch(Class c)
    {
        List<Actor> list =
            getWorld().getObjects(c),
        list2 = new ArrayList();
        for(Actor A : list)
            if(A!=this && intersects(A) && touch(A))
                return true;
        return false;
    }  

    /** This method is a pixel perfect collision detection. 
     * Returns true, if the object touchs the given Actor */
    public boolean touch(Actor a_big)
    {
        Actor a_small;
        if(getImage().getWidth()*getImage().getHeight()>a_big.getImage().getHeight()*a_big.getImage().getWidth())
        {
            a_small=a_big;
            a_big=this;
        }
        else
            a_small=this;

        int i_hypot=(int)Math.hypot(a_small.getImage().getWidth(),a_small.getImage().getHeight());

        GreenfootImage i=new GreenfootImage(i_hypot,i_hypot);
        i.drawImage(a_small.getImage(),i_hypot/2-a_small.getImage().getWidth()/2,i_hypot/2-a_small.getImage().getHeight()/2);
        i.rotate(a_small.getRotation());
        int w=i_hypot;

        GreenfootImage Ai = a_big.getImage(),
        i2=new GreenfootImage(i_hypot=(int)Math.hypot(Ai.getWidth(),Ai.getHeight()),i_hypot);
        i2.drawImage(Ai,i2.getWidth()/2-Ai.getWidth()/2,i2.getHeight()/2-Ai.getHeight()/2);
        i2.rotate(a_big.getRotation());
        Ai=i2;

        int
        x_Offset=a_big.getX()-a_small.getX()-(Ai.getWidth()/2-w/2),
        y_Offset=a_big.getY()-a_small.getY()-(Ai.getHeight()/2-w/2);

        boolean b = true;
        for(int yi =Math.max(0,y_Offset); yi<w && yi<i_hypot+y_Offset && b; yi++)
            for(int xi =Math.max(0,x_Offset); xi<w && xi<i_hypot+x_Offset && b; xi++)
                if(Ai.getColorAt(xi-x_Offset,yi-y_Offset).getAlpha()>0 && i.getColorAt(xi,yi).getAlpha()>0)
                    b=false;
        return !b;
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
