import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rewards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rewards extends Composite
{
    //public int x;
    int i;
    /**
     * Act - do whatever the Rewards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        display();
    }    

    public void display() {
        int x = 400;
        int y;
        
        for(i=0;i<components.size();i++){
            Actor current = (Actor)components.get(i);
            y = 290;
            if(current.getClass().getName().equals("Food"))
                y = 320;
            getWorld().addObject((Actor)components.get(i),x,y);
            x+= 350;            
        }

    }
}
