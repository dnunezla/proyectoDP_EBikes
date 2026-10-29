
/**
 * Write a description of class Comparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparatorEBIdBike implements Comparator<ElectricBike>
{
 public int compare(ElectricBike eb1, ElectricBike eb2){
     return eb1.getId_eB().compareTo(eb2.getId_eB());
 }
}