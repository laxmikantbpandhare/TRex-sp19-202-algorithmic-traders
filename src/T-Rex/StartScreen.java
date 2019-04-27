import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = new GreenfootImage("startscreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        IOptionInvoker playbutton = new PlayButton();
        IOptionInvoker quitbutton = new QuitButton();

        addObject((PlayButton)playbutton,332,213);
        addObject((QuitButton)quitbutton,643,200);

        IOptionCommand startGame = new OptionCommand();
        IOptionCommand quitGame = new OptionCommand();

        MyWorld tRex = new MyWorld();

        startGame.setReceiver(
            new IOptionReceiver() {
                public void doAction() {

                    Greenfoot.setWorld(tRex);

                }
            }
        );

        quitGame.setReceiver(
            new IOptionReceiver() {
                public void doAction() {

                    Greenfoot.stop();

                }
            }
        );

        playbutton.setCommand( startGame );
        quitbutton.setCommand( quitGame );
        //performAction();
    }

}
