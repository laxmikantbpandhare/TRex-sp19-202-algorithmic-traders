import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInfo extends Actor
{

    private GreenfootImage image;
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  

    public GameInfo()
    {
        //image = new GreenfootImage(500, 500);
        image = new GreenfootImage("startscreen.png");
        image.scale(1000,600);
        //image.setColor(new Color(0, 0, 0, 160));
        //image.fillRect(0, 0, 1000, 500);
        //image.setColor(new Color(255, 255, 255, 100));
        //image.fillRect(5, 5, 1000-10, 500-10); 
        Font font = image.getFont();
        font = font.deriveFont(30);
        image.setFont(font);
        image.setColor(Color.BLACK);
    }

    public void showGameInfo(int score, int life)
    {
        if(life == 0){
            image.drawString("Game Over", 300, 150);
            image.drawString("Score:" + score, 300, 200);
        }
        else{
            if(score == 60){
                image.drawString("Level 1 Completed!!!", 300, 150);
                image.drawString("Score:" + score, 300, 200);
                image.drawString("Remaining Life:" + life, 300, 250);
            }
            else if (score == 120){
                image.drawString("Level 2 Completed!!!", 300, 150);
                image.drawString("Game Completed!!!", 300, 200);
                image.drawString("Total Score:" + score, 300, 250);
            }
        }
        setImage(image);
    }

}
