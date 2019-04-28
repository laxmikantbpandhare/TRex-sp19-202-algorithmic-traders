/**
 * Write a description of class IOptionCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IOptionCommand  
{
    // instance variables - replace the example below with your own
    void execute() ;

    /** 
     * Configure the Receiver for the Command
     * @param target Receiver
     */
    void setReceiver( IOptionReceiver target ) ;
}
