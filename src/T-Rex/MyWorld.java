import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private CurrentScore scoreBoard;
    private ILevelStrategy currentStrategy;
    private LifeBar lifebar;
    private static int life;
    private Mediator mediator;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = new GreenfootImage("background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        lifebar = new LifeBar();
        scoreBoard = new CurrentScore(120,120);
        mediator = new Mediator();

        addObject(scoreBoard,898,73);
        addObject(lifebar,75,20);
        setStrategy(1);
        createLevel();
    }

    public void setStrategy(int level){
        if(level==1)
            this.currentStrategy = new FirstLevelStratergy();
        else if(level == 2)
            this.currentStrategy = new SecondLevelStrategy();
    }

    public ILevelStrategy getStrategy(){
        return currentStrategy;
    }
    
    public void createLevel(){
        addObject((Actor)mediator,0,0);
        addObject((Actor) currentStrategy, 67,25);
        currentStrategy.gameDisplay();
    }

    public CurrentScore getScoreBoard()
    {
        return scoreBoard;
    }

    public LifeBar getLifeBar()
    {
        return lifebar;
    }
}
