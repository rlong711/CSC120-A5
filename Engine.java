import java.util.*;
import java.lang.Double;

/**
 * Stores and accesses information abot the engine and adjusts engine levels for instances of refueling and decreasing after trips. 
 */
public class Engine {

    private String FuelType; 
    Double currentFuel; 
    Double maxFuel; 
    
    
    
    

    
    /**
     * Constructor for this class. 
     * @param FuelType the type of fuel the engine uses
     * @param currentFuel the current amount of fuel 
     * @param maxFuel the maximum fuel capacity
     */
    public Engine(String FuelType, Double currentFuel, Double maxFuel){
        this.FuelType = FuelType; 
        this.currentFuel = currentFuel; 
        this.maxFuel = maxFuel; 
        
        
    } 
    /**
     * accessor for the current fuel amount
     * @return this instance of the current fuel amount 
     */
    public double getcurrentFuel() {
        return this.currentFuel;
    }
    /**
     * Sets the current fuel amount to the maximum fuel amount in instances where it has been fully refueled
     * @param maxFuel the maximum fuel capacity 
     */
    public void refuel(double maxFuel){
        this.currentFuel = maxFuel; 
    }
    /**
     * Prints out what the current fuel amount is and creates a new exception for when there is no more fuel left. 
     * @param currentFuel the current amount of fuel 
     * @param x the amount of fuel that is being subtracted as the train moves. 
     */
    public void go(double currentFuel, double x){
        if (this.currentFuel == 0) {
            throw new RuntimeException("The fuel level is at 0, so you can no longer go anywhere"); 

        }
        this.currentFuel -= x; 
        System.out.println("The current fuel level is currently at " + this.currentFuel); 
    }
    
        
}




    

        
            
        




}
        