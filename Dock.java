import java.util.ArrayList;
/**
 * Write a description of class Dock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dock
{
    // instance variables - replace the example below with your own
    private String idDock;
    private int chargingSpeed;
    private int chargingFee;
    private ArrayList<ElectricBike> bikesRecharged;
    private float amountCollected;
    private boolean free;
    

    /**
     * Constructor for objects of class Dock
     */
    public Dock()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}