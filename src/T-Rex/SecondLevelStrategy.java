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
    /**
     * Act - do whatever the SecondLevelStrategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void gameDisplay(){
        addLandObstacles();
        addSkyObstacles();
        addRewards();
    };
    
    public void addSkyObstacles(){
        
    }
    public LandObstacles getLandObstacles(){
        return landObstacles;
    }
    public void addLandObstacles(){
        try{
            landObstacles = new LandObstacles(1500);
            Cactus cactus1 = new Cactus(-8);
            Cactus cactus2 = cactus1.clone();
            //Cactus cactus3 = cactus1.clone();
            
            //landObstacles.addChild(cactus2);
            //landObstacles.addChild(cactus3);
            getWorld().addObject(landObstacles,1100,0);
            landObstacles.removeall(landObstacles);
            
            landObstacles.addChild(cactus1);
            landObstacles.addChild(cactus2);
            landObstacles.addChild(new Stones(-8));
            //getWorld().addObject(landObstacles,1100,0);
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
