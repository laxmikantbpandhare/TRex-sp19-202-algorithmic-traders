import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandObstacles extends Composite
{
    private int y;
    //private int x = 300;
    private int i;
    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        display();
    }    

    public void display() {
        int x = 300;
        for(i=0;i<components.size();i++){
            Actor current = (Actor)components.get(i);
            if(current.getClass().getName().equals("Stones"))
                y = 440;
            else
                y = 432;
            //System.out.println("x= "+x+",y= "+y);
            getWorld().addObject((Actor)components.get(i),x,y);
            if(i==2)
                x+= 25;
            else
                x+= 300;
        }

    }
}
