import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public GameOver()
    {
        
    }
    
    public void makeImage(int score)
    {
        GreenfootImage image = new GreenfootImage(1000, 500);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, 1000, 500);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, 1000-10, 500-10); 
        Font font = image.getFont();
        font = font.deriveFont(50);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString("GameOver", 100, 150);
        image.drawString("Score:" + score, 100, 200);
        setImage(image);
        Greenfoot.stop();
    }
}
