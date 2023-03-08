import java.util.*; 
/**
 * Updates the record of passengers on the train while catching a few exceptions. 
 */
public class Car {
    
    
    private ArrayList<Passenger> passengerList; 
    int maxCapacity; 

    
    /**
     * Constructor for the objects in this class. 
     * @param maxCapacity the maximum capacity of people on the train
     */
    public Car (int maxCapacity){
        this.maxCapacity = maxCapacity; 
        this.passengerList = new ArrayList<Passenger>(); 
    }
    /**
     * Accessor for the maximum capacity. 
     * @return the maximum number of people allowed on this instance of the train. 
     */
    public int getCapacity(){
        return this.maxCapacity; 
    }


    
    /**
     * Adds a passenger to the record, and throws two exceptions if the passenger is alreadyon board or if there are no more seats left. 
     * @param p referst to a passenger p. 
     */
    public void addPasenger(Passenger p){ 
        if (this.passengerList.contains(p)){
            throw new RuntimeException("Passenger is already on board"); 
        }

        if (this.passengerList.size() >= this.maxCapacity){
            throw new RuntimeException("There are no more seats left.");
        }
        this.passengerList.add(p); 

        
    }
    /**
     * Removes a passenger from the record, and throws an exception for if the person is not onboard. 
     * @param p refers to some passenger p. 
     */
    public void removePassenger(Passenger p){
        if (!this.passengerList.contains(p)){
            throw new RuntimeException("This person is not onboard"); 
        }
        this.passengerList.remove(p); 
        
    }

    public void printManifest(){
        if (this.passengerList.size() == 0);{
            throw new RuntimeException("The car is EMPTY");
        }
       System.out.println(this.passengerList);
            
    }








}
    