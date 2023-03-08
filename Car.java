import java.util.*; 

public class Car {
    
    
    private ArrayList<Passenger> carList; 
    int maxCapacity; 

    

    public Car (int maxCapacity){
        this.maxCapacity = maxCapacity; 
        this.carList = new ArrayList<Passenger>(); 
    }

    public int getCapacity(){
        return this.maxCapacity; 
    }

    

    public void addPasenger(Passenger p){ 
        if (this.carList.contains(p)){
            throw new RuntimeException("Passenger is already on board"); 
        }

        if (this.carList.size() >= this.maxCapacity){
            throw new RuntimeException("There are no more seats left.");
        }
        this.carList.add(p); 

        
    }

    public void removePassenger(Passenger p){
        if (!this.carList.contains(p)){
            throw new RuntimeException("This person is not onboard"); 
        }
        this.carList.remove(p); 
        
    }

    public void printManifest(){
        if (this.carList.size() == 0);{
            throw new RuntimeException("The car is EMPTY");
        }
        // System.out.println(this.carList);       
    }








}
    