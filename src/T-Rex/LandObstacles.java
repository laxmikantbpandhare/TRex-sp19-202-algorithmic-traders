import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    private int x;
    int time_counter =0;
    long pauseTime = 0;

    public LandObstacles(int x) {
        this.x = x;
    }

    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if(time_counter%60==0)
        display();
        //time_counter++;
    }    

    public void display() {
        int x1 = 1500;
        for(i=0;i<components.size();i++){

            System.out.println("x1 = "+x1);
            System.out.println("Current Actor ="+ (Actor)components.get(i));
            Actor current = (Actor)components.get(i);
            if(current.getClass().getName().equals("Stones"))
                y = 440;
            else
                y = 432;
            //System.out.println("x= "+x+",y= "+y);
            //if(time_counter%60==0)
            getWorld().addObject((Actor)components.get(i),x1,y);
            if(i==2){
                x1+= 300;
                System.out.println("x1 = "+x1);
                System.out.println("x = "+x);
            }

            //else
               // x1+= 25;
               //pause(1000);
        
    }
        
    }
    public void removeall(LandObstacles obstacles){
        //getWorld.remove();
        System.out.println("Removing here");
        //MyWorld world = getWorldOfType(MyWorld.class);
        System.out.println("Printing objects");
        //List<Actor> actors = new ArrayList<Actor>();
        //getWorld().getObjects(Clouds.class);
        for (Object obj : getWorld().getObjects(Clouds.class)){ 
            System.out.println(obj);
        }
        //for (int i=0; i<actors.size(); i++){
        //    System.out.println(actors.get(i));
        //}
        //world.removeObject(world.getObjects());
        //for (int i = 0; i<obstacles.components.size(); i++){
        //    world.removeObject((Actor)obstacles.components.get(i));
        //}
        
        
        components.clear();
    }
    
}
