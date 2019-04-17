import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Leaf implements Cloneable
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    public Food() {
        getImage().scale(getImage().getWidth()*70/100, getImage().getHeight()*70/100);
    }
    public void act() 
    {
        // Add your action code here.
        move(-2);
        x = getX();
        y = getY();
        if (x==0) {
            setLocation(999,y);
        }
    }    
    
    @Override 
    public Food clone() throws CloneNotSupportedException {
          getImage().scale(getImage().getWidth()*70/100, getImage().getHeight()*70/100);
          return (Food) super.clone();
    }
}
