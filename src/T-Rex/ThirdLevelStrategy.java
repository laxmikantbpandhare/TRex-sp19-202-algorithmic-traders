import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdLevelStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevelStrategy extends LevelStrategy
{
    private Rewards rewards;
    private SkyObstacles skyObstacles;
    private LandObstacles landObstacles;
    /**
     * Act - do whatever the ThirdLevelStrategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void gameDisplay(){
        addDino();
        addClouds();
        addLandObstacles();
        addSkyObstacles();
        addRewards();
    };
    
    public void addSkyObstacles(){
        try {
            skyObstacles = new SkyObstacles();
            Bird bird1 = new Bird(-12);
            Bird bird2 = bird1.clone();
            skyObstacles.addChild(bird1);
            
            getWorld().addObject(skyObstacles,1200,0);
            } 
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }   
    }
    
    public void addLandObstacles(){
        try{
            landObstacles = new LandObstacles(1500);
            Cactus cactus1 = new Cactus(-12);
            Cactus cactus2 = cactus1.clone();
            Cactus cactus3 = cactus1.clone();
            landObstacles.addChild(cactus1);
            landObstacles.addChild(cactus2);
            landObstacles.addChild(cactus3);
            getWorld().addObject(landObstacles,1100,0);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
    public void addRewards(){
        rewards = new Rewards();
        try{
            Coin coin1 = new Coin();
            Coin coin2 = coin1.clone();
            Coin coin3 = coin1.clone();
            rewards.addChild(coin1);
            rewards.addChild(coin2);
            rewards.addChild(coin3);
            
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        MyWorld world = getWorldOfType(MyWorld.class);
        world.addObject(rewards,1100,0);
    }
}
