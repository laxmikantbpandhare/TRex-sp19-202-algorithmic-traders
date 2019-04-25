/**
 * Write a description of class ILevelStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ILevelStrategy  
{
    void gameDisplay();
    void addLandObstacles();
    void addSkyObstacles();
    void addRewards();
    void setObstacleSpeed();
    void setRewardsSpeed();
    void setRewardsScoreValue();
    LandObstacles getLandObstacles();
}
