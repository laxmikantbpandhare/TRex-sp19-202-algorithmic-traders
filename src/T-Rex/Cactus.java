import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Leaf implements Cloneable
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    private int speed;
    
    public Cactus(int speed) {
        this.speed = speed;
        GreenfootImage image = getImage();
        image.scale(50,50);
    }
    
    public void act() 
    {
        move(speed);
        x = getX();
        y = getY();
        if (x==0) {
            setLocation(999,y);
        }
    }    
    
    @Override 
    public Cactus clone() throws CloneNotSupportedException {
          return (Cactus) super.clone();
    }
    
    
}
