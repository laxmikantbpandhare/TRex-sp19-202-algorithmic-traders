import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stones extends Leaf implements Cloneable
{
    /**
     * Act - do whatever the Stones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    private int speed;
    public void act() 
    {
        // Add your action code here.
        move(speed);
        x = getX();
        y = getY();
        if (x==0) {
            setLocation(999,y);
        }
    }  
    
    @Override 
    public Stones clone() throws CloneNotSupportedException {
          return (Stones) super.clone();
    }
    
    public Stones(int speed) {
        this.speed = speed;
        GreenfootImage image = getImage();
        image.scale(40,40);
    }
}
