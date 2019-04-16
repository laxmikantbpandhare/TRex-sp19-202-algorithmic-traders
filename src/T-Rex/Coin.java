import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Leaf implements Cloneable
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    public Coin() {
        getImage().scale(getImage().getWidth()*5/100, getImage().getHeight()*5/100);   
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
    public Coin clone() throws CloneNotSupportedException {
      return (Coin) super.clone();
    }
}

