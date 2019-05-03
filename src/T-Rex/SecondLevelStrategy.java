import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevelStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevelStrategy extends LevelStrategy
{
    private Rewards rewards;
    private LandObstacles landObstacles;
    private SkyObstacles skyObstacles;
    /**
     * Act - do whatever the SecondLevelStrategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void gameDisplay(){
        addDino();
        addClouds();
        addSkyObstacles();
        addLandObstacles();
        addRewards();
    };
    
    public void addSkyObstacles(){
        try {
            skyObstacles = new SkyObstacles();
            Bird bird1 = new Bird(-8);
            Bird bird2 = bird1.clone();
            skyObstacles.addChild(bird1);
            
            getWorld().addObject(skyObstacles,1100,0);
            } 
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    public LandObstacles getLandObstacles(){
        return landObstacles;
    }
    public void addLandObstacles(){
        try{
            landObstacles = new LandObstacles(1500);
            Cactus cactus1 = new Cactus(-8);
            Cactus cactus2 = cactus1.clone();
            getWorld().addObject(landObstacles,1100,0);
            landObstacles.removeall(landObstacles);
            landObstacles.addChild(new Stones(-8));
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
            
            rewards.addChild(coin1);
            rewards.addChild(coin2);
            
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        MyWorld world = getWorldOfType(MyWorld.class);
        world.addObject(rewards,1100,0);
    }    
}
