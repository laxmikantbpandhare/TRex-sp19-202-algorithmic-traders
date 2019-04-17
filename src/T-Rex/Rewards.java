import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rewards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rewards extends Composite
{
    public final int Y = 290;
    public int x = 400;
    /**
     * Act - do whatever the Rewards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        display();
    }    
    
    public void display() {
        for(Component c : components){
            getWorld().addObject((Actor)c,x,Y);
            x+= 400;

        }
    }
}
