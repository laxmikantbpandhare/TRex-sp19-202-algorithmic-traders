import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TRex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosaur extends Actor
{
    //GifImage dino = new GifImage("dinosaur.gif");
    private int delayTimer;
    private int page;
    public Dinosaur() {
        getImage().scale(getImage().getWidth()*40/100, getImage().getHeight()*40/100);
    }
    
    /**
     * Act - do whatever the TRex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        delayTimer = (delayTimer+1)%16; // the last number is total frame delay
        if (delayTimer == 0) // if time to change image, do so
        {
            page = (page+1)%16; // the last number is total images in animation
            setImage("dinosaur"+(page+1)+".gif");
            getImage(). scale(getImage().getWidth()*40/100, getImage().getHeight()*40/100);
        }
    }    
}
