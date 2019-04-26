import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelStratergy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevelStratergy extends LevelStrategy
{
    private Rewards rewards;
    private LandObstacles landObstacles;
    int timer = 0;
    Cactus cactus1;
    Cactus cactus2;
    Cactus cactus3;
    /**
     * Act - do whatever the FirstLevelStratergy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //timer++;
        //if(timer==60)
            //addLandChilds(cactus1);
        //else if(timer==120)
            //addLandChilds(cactus2);
        //else if(timer==180)
            //addLandChilds(cactus3);
    }
    
    public void gameDisplay(){
        addLandObstacles();
        addRewards();
    };
    
    public void addSkyObstacles(){
        
    }
    
    public void addLandObstacles(){
        try{
            landObstacles = new LandObstacles(1500);
            cactus1 = new Cactus(-8);
            cactus2 = cactus1.clone();
            cactus3 = cactus1.clone();
            landObstacles.addChild(cactus1);
            //landObstacles.addChild(cactus2);
            //landObstacles.addChild(cactus3);
            getWorld().addObject(landObstacles,1100,0);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    public LandObstacles getLandObstacles(){
        return landObstacles;
    }
    public void addLandChilds(Cactus cactus){
        landObstacles.addChild(cactus);
    }
    
    public void addRewards(){
        rewards = new Rewards();
        try{
            //addObject(food1,195,290);
            //addObject(food2,557,290);
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
