import greenfoot.*;  
import java.util.ArrayList;

/**
 * Composite class for all the objects in the world -
 * Rewards - food and coins
 * Obstacles - land obstacles like Cactus, Rocks and Sky obstacles like birds
 * Clouds - background sky object
 */
public class Composite extends Actor implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Composite ()
    {
       
    }
    
    public Composite ( String d )
    {
       
        
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void remove(Component c) {
        components.remove(c) ;
    }
    
    public void removeall(){
        components.clear();
        //getWorld.remove();
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
    public void display(){
       
         for (Component obj  : components)
         {
             obj.display();
         }
    }  
}