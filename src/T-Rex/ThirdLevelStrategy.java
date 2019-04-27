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
        //addLandObstacles();
        addSkyObstacles();
        addRewards();
    };
    
    public void addSkyObstacles(){
        try{
            skyObstacles = new SkyObstacles();
            Bird bird1 = new Bird();
            Bird bird2 = bird1.clone();
            Bird bird3 = bird1.clone();
            skyObstacles.addChild(bird1);
            skyObstacles.addChild(bird2);
            skyObstacles.addChild(bird3);
            //addObject(bird1,100,231);
            //addObject(bird2,234,231);
            //addObject(bird3,500,231);
            getWorld().addObject(skyObstacles,1100,0);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
    public void addLandObstacles(){
        try{
            landObstacles = new LandObstacles(1500);
            Cactus cactus1 = new Cactus(-8);
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
            
            Food food1 = new Food();
            Food food2 = food1.clone();
            //addObject(food1,195,290);
            //addObject(food2,557,290);
            Coin coin1 = new Coin();
            Coin coin2 = coin1.clone();
            
            rewards.addChild(food1);
            rewards.addChild(coin1);
            rewards.addChild(food2);
            rewards.addChild(coin2);
            
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        MyWorld world = getWorldOfType(MyWorld.class);
        world.addObject(rewards,1100,0);
    }
}
