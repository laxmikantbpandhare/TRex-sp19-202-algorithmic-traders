import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LevelStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelStrategy extends Actor implements ILevelStrategy
{
    /**
     * Act - do whatever the LevelStrategy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void gameDisplay(){
        
    };
    public void addLandObstacles(){};
    public void addSkyObstacles(){};
    public void addRewards(){};
    public void setObstacleSpeed(){};
    public void setRewardsSpeed(){};
    public void setRewardsScoreValue(){};
    public LandObstacles getLandObstacles(){
        return null;
    }
}
