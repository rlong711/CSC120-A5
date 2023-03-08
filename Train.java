import java.util.*;  
/**
 * This Class essentially combines all the information about the train from the previous three classes. It also initializes the Engine and Car classes.
 */
public class Train {

    private final Engine engine; 
    private ArrayList<Car> carList; 
    int nCars; 

    /**
     * This is the constructor. 
     * @param FuelType this refers to what kind of fuel the train uses. 
     * @param maxCapcity refers to the maximum amount of passengers allowed on board 
     * @param nCars refers to how many cars there are on the train
     * @param maxFuel refers to the maximum fuel level 
     */
    public Train(String FuelType; int maxCapacity; int nCars; double maxFuel){
        this.FuelType = FuelType; 
        this.maxCapacity = maxCapacity; 
        this.nCars = nCars; 
        this.maxFuel = maxFuel; 
    }

    /**
     * Accessor for the Engine
     */
    public Engine getEngine(){
        return this.engine; 
    }
    /**
     * Accessor to return a specific car 
     * @param i the index/position of the desired car
     * @return the car stored in carList
     */
    public Car getCar(int i){
        return this.carList(i); 
    }
    /**
     * Accessor for maximumCapacity object
     * @return the me maximum human capacity for the car and train. 
     */
    public int getmaxCapacity(){
        return this.maxCapacity; 
    }
    /**
     * accessor for how many seats there are left 
     * @return the amount of seat that are currently unavailable
     */
    public int getseatsRemaining(){
        return this.seatsRemaining(); 
    }
    /**
     * Accessor for the printManifest method in the Car class
     */
    public void printManifest(){
        this.printManifest(); 
    }


}










