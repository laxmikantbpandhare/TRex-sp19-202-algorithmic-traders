import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor implements Cloneable
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    public void act() 
    {
        // Add your action code here.
        move(-1);
        x = getX();
        y = getY();
        if (x==0) {
            setLocation(599,y);
        }
    }    
    
    @Override 
    public Cactus clone() throws CloneNotSupportedException {
          return (Cactus) super.clone();
    }
}
