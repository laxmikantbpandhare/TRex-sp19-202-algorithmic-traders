import java.util.*;
import greenfoot.*; 
/**
 * Write a description of class Mediator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mediator extends Actor implements IMediator
{
    private HashMap<String, Actor> actors = new HashMap<>();
    private GameInfo endGame = null;
    private GameInfo changeLevel = null;
    private GameInfo completeGame = null;
    private MyWorld world = null;
    private CurrentScore scoreBoard = null;
    private LifeBar lifeBar = null;

    public Mediator(){
    }

    public void createLevel(){
        if(world == null)
            world=(MyWorld)getWorld();
        List<Actor> actors = world.getObjects(null);
        actors.removeAll(world.getObjects(CurrentScore.class));
        actors.removeAll(world.getObjects(LifeBar.class));
        world.removeObjects(actors);
        world.setStrategy(2);
        world.createLevel();
    }

    public void endGame(){
        if(endGame == null)
            endGame=new GameInfo();
        if(world == null)
            world=(MyWorld)getWorld();
        if(scoreBoard == null)
            scoreBoard=world.getScoreBoard();
        if(lifeBar == null)
            lifeBar=world.getLifeBar();
        int score=scoreBoard.getScore();
        int life = lifeBar.getLife();
        endGame.showGameInfo(score, life);
        world.addObject(endGame,world.getWidth()/2,world.getHeight()/2);
        Greenfoot.delay(170);
        StartScreen overallPerformance = new StartScreen();
        Greenfoot.setWorld(overallPerformance);
    }

    public void changeLevel(){
        if(changeLevel == null)
            changeLevel=new GameInfo();
        if(world == null)
            world=(MyWorld)getWorld();
        if(scoreBoard == null)
            scoreBoard=world.getScoreBoard();
        if(lifeBar == null)
            lifeBar=world.getLifeBar();
        int score=scoreBoard.getScore();
        int life = lifeBar.getLife();
        changeLevel.showGameInfo(score, life);
        world.addObject(changeLevel,world.getWidth()/2,world.getHeight()/2);
        Greenfoot.delay(170);
        world.removeObject(changeLevel);
        createLevel();
    }

    public void completeGame(){
        if(completeGame == null)
            completeGame=new GameInfo();
        if(world == null)
            world=(MyWorld)getWorld();
        if(lifeBar == null)
            lifeBar=world.getLifeBar();
        int score=scoreBoard.getScore();
        int life = lifeBar.getLife();   
        completeGame.showGameInfo(score, life);
        world.addObject(completeGame,world.getWidth()/2,world.getHeight()/2);
        Greenfoot.delay(170);
        StartScreen overallPerformance = new StartScreen();
        Greenfoot.setWorld(overallPerformance);
    }

}
