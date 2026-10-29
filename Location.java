
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Location
     */
    public Location(int a, int b)
    {
        x=a;
        y=b;// initialise instance variables
        
    }
    
    /**
     * Constructor for objects of class Location
     */
    public Location()
    {
        x=0;
        y=0;// initialise instance variables
        
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