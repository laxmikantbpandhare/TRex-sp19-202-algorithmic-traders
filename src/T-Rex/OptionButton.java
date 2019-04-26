import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptionButton extends Actor implements IOptionInvoker
{
    private IOptionCommand cmd ;
    /**
     * Act - do whatever the OptionButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }  

    public void setCommand( IOptionCommand c ) {
        cmd = c ;
    }

    public void invoke() 
    {
        cmd.execute() ;
    }
}
