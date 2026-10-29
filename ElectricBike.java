import java.util.ArrayList;
/**
 * Write a description of class ElectricBike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricBike
{
    // instance variables - replace the example below with your own
    private String id_eB;
    private EBCompany company;
    private Location location;
    private Location targetLocation;
    private int idleCount;
    private int batteryCapacity;
    private int batteryLevel;
    private int wsCharged;
    private int chargesCount;
    private float chargesCost;
    private ArrayList<Dock> docksUsed;
    /**
     * Constructor for objects of class ElectricBike
     */
    public ElectricBike(String id_eB, EBCompany company, Location location, 
    Location targetLocation, int idleCount, int batteryCapacity, int batteryLevel,
    int chargesCount,float chargesCost)
    {
        // initialise instance variables
    if(company!=null){
      this.company=company;
       if(location!=null){
        this.location=location;
         if(location!=null){
           this.targetLocation=targetLocation;
         }else{ System.out.println("Error targetLocation apunta a null");
         }
       }else{ System.out.println("Error location apunta a null");
       }
    }else{ System.out.println("Error company apunta a null");
    }
      this.id_eB=id_eB;
      this.idleCount=idleCount;
      this.batteryCapacity=batteryCapacity;
      this.batteryLevel=batteryLevel;
      this.wsCharged=wsCharged;
      this.chargesCount=chargesCount;
      this.chargesCost=chargesCost;
      this.docksUsed=new ArrayList<Dock>();
    
    }
    
    public String getId_eB(){
        return id_eB;
    }
    public EBCompany getCompany(){
        return company;
    }
    public Location getLocation(){
        return location;
    }
    public Location getTargetLocation(){
        return targetLocation;
    }
    public int getIdleCount(){
        return idleCount;
    }
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public int getWsCharged(){
        return wsCharged;
    }
    public int getChargesCount(){
        return chargesCount;

    }
    public float getChargesCost(){
        return chargesCost;
    }
    /*public ArrayList<Dock> getDocksUsed(){
        return docksUsed;
    }*/
    public String locationToString(){
        return location+", "+"0-0"/*Hay que cambiarlo*/+", "+ targetLocation;
    }
    @Override
    public String toString(){
        return"("+getClass().getName()+ ": "+getId_eB()+ ", " +getBatteryCapacity()+ ", " 
        +getBatteryLevel() +", " +getChargesCount() +", " +getChargesCost() +"€, " +getIdleCount()+
        ", " +getLocation()+", "+locationToString()+")";
    }
    
}