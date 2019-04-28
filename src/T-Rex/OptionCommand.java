/**
 * Write a description of class OptionCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptionCommand implements IOptionCommand 
{
    
    IOptionReceiver target ;

    /**
     * Constructor for objects of class OptionCommand
     */
    public OptionCommand()
    {
    }

    public void execute() 
    {
        target.doAction() ;
    }

    /** 
     * Configure the Receiver for the Command
     * @param target Receiver
     */
    public void setReceiver( IOptionReceiver t ){
        target = t ;
    }
}
