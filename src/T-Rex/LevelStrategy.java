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

    public void addClouds()
    {
        try{
            Clouds clouds1 = new Clouds();
            Clouds clouds2 = clouds1.clone();
            Clouds clouds3 = clouds1.clone();
            Clouds clouds4 = clouds1.clone();
            getWorld().addObject(clouds1,156,82);
            getWorld().addObject(clouds2,315,89);
            getWorld().addObject(clouds3,884,172);
            getWorld().addObject(clouds4,740,106);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    public void addDino()
    {
        Dinosaur dinosaur = new Dinosaur();
        getWorld().addObject(dinosaur,74,442);
    }
}
