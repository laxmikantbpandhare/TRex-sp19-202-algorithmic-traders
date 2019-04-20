import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private LandObstacles landObstacles;
    private SkyObstacles skyObstacles;
    private Rewards rewards;
    private CurrentScore scoreBoard;
    private ILevelStrategy currentStrategy;
    private LifeBar lifebar = new LifeBar();
    private int life = 5;
    private Actor lifeBarDecorator;
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
        landObstacles = new LandObstacles();
        skyObstacles = new SkyObstacles();
        rewards = new Rewards();
        scoreBoard = new CurrentScore(120,120);
        currentStrategy = new FirstLevelStratergy();
        addObject((Actor) currentStrategy, 67,25);
        currentStrategy.gameDisplay();
        prepare();
        life = 4;
        lifeBarDecorator = new LifeBarDecorator((ILifeBar) lifebar);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        try{
            //Cactus cactus1 = new Cactus();
            //Cactus cactus2 = cactus1.clone();
            //Cactus cactus3 = cactus1.clone();
            //addObject(cactus1,300,432);
            //addObject(cactus2,662,432);
            //addObject(cactus3,705,432);
            //Bird bird1 = new Bird();
            //Bird bird2 = bird1.clone();
            //Bird bird3 = bird1.clone();
            //addObject(bird1,100,231);
            //addObject(bird2,234,231);
            //addObject(bird3,500,231);
            Stones stones1 = new Stones();
            Stones stones2 = stones1.clone();
            addObject(stones1,499,443);
            addObject(stones2,930,443);
            Clouds clouds1 = new Clouds();
            Clouds clouds2 = clouds1.clone();
            Clouds clouds3 = clouds1.clone();
            Clouds clouds4 = clouds1.clone();
            addObject(clouds1,156,82);
            addObject(clouds2,315,89);
            addObject(clouds3,884,172);
            addObject(clouds4,740,106);
            //Food food1 = new Food();
            //Food food2 = food1.clone();
            //addObject(food1,195,290);
            //addObject(food2,557,290);
            //Coin coin1 = new Coin();
            //Coin coin2 = coin1.clone();
            //addObject(coin1,400,290);
            //addObject(coin2,807,290);
            
            //rewards.addChild(food1);
            //rewards.addChild(coin1);
            //rewards.addChild(food2);
            //rewards.addChild(coin2);
            
            //addObject(rewards,1100,0);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        addObject(scoreBoard,898,73);
        
        Dinosaur dinosaur = new Dinosaur();
        addObject(dinosaur,74,442);
    }

    public void act ()
    {
        addObject((Actor)lifeBarDecorator,75,20);
        ((LifeBarDecorator)lifeBarDecorator).display();
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
