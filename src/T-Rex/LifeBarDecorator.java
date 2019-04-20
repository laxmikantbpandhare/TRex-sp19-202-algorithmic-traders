import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeBarDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeBarDecorator extends Actor implements ILifeBar
{
    int life = 6;
    int lifeBarWidth = 120; 
    int lifeBarHeight = 15;
    int pixelsPerLifePoint = (int)lifeBarWidth / life;
    private ILifeBar lifebar;

    public LifeBarDecorator(ILifeBar lifebar)
    {
        this.lifebar = lifebar;
        this.setImage(((LifeBar) lifebar).getImage());
    }

    public GreenfootImage display()
    {   
        GreenfootImage myImage = ((LifeBar)lifebar).display();
        setImage(myImage);
        myImage.setColor(Color.RED);
        decorateLifeBar(myImage);
        return myImage;
    }

    public void decorateLifeBar(GreenfootImage myImage)
    {
        int life1 = ((LifeBar)lifebar).getLife();
        myImage.fillRect(1, 1, life1*pixelsPerLifePoint,lifeBarHeight);
        if(life1==0){
            Greenfoot.stop();
        }
    }
    
}
