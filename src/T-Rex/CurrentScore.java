import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CurrentScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrentScore extends Actor
{
    private static final Color MAIN_COLOR = new Color(0x60, 0x60, 0x60); // dark grey
    
    private static final int CURRENT_SCORE_TEXT_HEIGHT = 60;
    
    private static final int RECORD_TEXT_HEIGHT = 25;
    
    private static final int RECORD_SCORE_TEXT_HEIGHT = 25;
    
    /**
     * Constructor for objects of class ScoreBoard.
     * <p>
     * You can specify the width and height that the score board should be, but
     * a minimum width of 600 will be enforced.
     */
    public CurrentScore(int width, int height)
    {    
        setImage(new GreenfootImage(width, height)); 
        
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
        getImage().drawImage(new GreenfootImage(text, height, color, new Color (0,0,0,0)), x, y);
    }
    
    private void drawScores()
    {
        drawString("0029", 0, 0, MAIN_COLOR, CURRENT_SCORE_TEXT_HEIGHT);
        drawString("Record", 16, CURRENT_SCORE_TEXT_HEIGHT+2, MAIN_COLOR, RECORD_TEXT_HEIGHT);
        drawString("--------------", 6, CURRENT_SCORE_TEXT_HEIGHT+10, MAIN_COLOR, RECORD_TEXT_HEIGHT);
        drawString("0512",25, CURRENT_SCORE_TEXT_HEIGHT+22, MAIN_COLOR ,RECORD_SCORE_TEXT_HEIGHT);
    }
}
