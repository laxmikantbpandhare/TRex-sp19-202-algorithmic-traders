import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor implements Cloneable
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
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
    public Bird clone() throws CloneNotSupportedException {
          GreenfootImage image = getImage();
          image.scale(50,50);
          return (Bird) super.clone();
    }
}
