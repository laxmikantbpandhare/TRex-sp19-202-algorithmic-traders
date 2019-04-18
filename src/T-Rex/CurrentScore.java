import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CurrentScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrentScore extends Actor implements ITRexObserver
{
    private static final Color MAIN_COLOR = new Color(0x60, 0x60, 0x60); // dark grey
    
    private static final int CURRENT_SCORE_TEXT_HEIGHT = 60;
    
    private static final int RECORD_TEXT_HEIGHT = 25;
    
    private static final int RECORD_SCORE_TEXT_HEIGHT = 25;
    
    private int score;
    
    /**
     * Constructor for objects of class ScoreBoard.
     * <p>
     * You can specify the width and height that the score board should be, but
     * a minimum width of 600 will be enforced.
     */
    public CurrentScore(int width, int height)
    {    
        setImage(new GreenfootImage(width, height)); 
        score=0;
        drawScores();
    }
    /**
     * Act - do whatever the CurrentScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }
    
    
    private void drawString(String text, int x, int y, Color color, int height)
    {
        GreenfootImage scoreImage=getImage();
        if(this.score==0){
        scoreImage.drawImage(new GreenfootImage(text, height, color, new Color (0,0,0,0)), x, y);
    }
    else
    {
        scoreImage.clear();
        scoreImage.drawImage(new GreenfootImage(text, height, color, new Color (0,0,0,0)), x, y);
    }
    
    }
    
    private void drawScores()
    {
        String currentScore=Integer.toString(this.score);
        drawString(currentScore, 0, 0, MAIN_COLOR, CURRENT_SCORE_TEXT_HEIGHT);
        
    }
    public void updateScore(String type)
    {
       if(type.equals("Coin"))
       {
           this.score=this.score+5;
           drawScores();
        }
    }
}