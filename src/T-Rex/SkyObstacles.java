import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkyObstacles extends Composite
{
    private int y;
    private int i;
    private int x;
    int time_counter =0;
    long pauseTime = 0;
    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        display();
    }
    
    public void display() {
        int x1 = 1200;
        for(i=0;i<components.size();i++){
            Actor current = (Actor)components.get(i);
            y = 280;
            getWorld().addObject((Actor)components.get(i),x1,y);
            if(i >= 2) {
                x1+= 250;
            } else {
                x1+= 750;
            }
        
    }
        
    }
    public void removeall(LandObstacles obstacles){
        MyWorld world = getWorldOfType(MyWorld.class);
       
        for (Object obj : world.getObjects(Cactus.class)){ 
            getWorld().removeObject((Actor)obj);
        }
        
        components.clear();
    }
}
