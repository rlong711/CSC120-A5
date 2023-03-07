import java.util.*;
import java.lang.Double;

public class Engine {

    private String FuelType; 
    Double currentFuel; 
    Double maxFuel; 
    Double current_max_fuel_difference;
    
    
    

    

    public Engine(String FuelType, Double currentFuel, Double maxFuel){
        this.FuelType = FuelType; 
        this.currentFuel = currentFuel; 
        this.maxFuel = maxFuel; 
        
        
    } 

    public double getcurrentFuel() {
        return this.currentFuel;
    }

    public void refuel(double maxFuel){
        this.currentFuel = maxFuel; 
    }

    public void go(double currentFuel, double x){
        if (this.currentFuel == 0) {
            throw new RuntimeException("The fuel level is at 0, so you can no longer go anywhere"); 

        }
        this.currentFuel -= x; 
        System.out.println("The current fuel level is currently at " + x); 
    }
    
        
}




    

        
            
        




}
        