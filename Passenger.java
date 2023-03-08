/**
 * This class keeps track of adding and removing passengers as they come off and on the train. 
 */
public class Passenger {
    
    private String name;
    
    /**
     * Constructor for the name object
     * @param name of the passenger coming on to the train. 
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Removes a passenger from the list of passengers for the car list. Catches the exception mentioned in the Car class. 
     * @param c The array list of passengers on the train. 
     */
    public void getOffCar(Car c){
        try {
            c.removePassenger(this); 
        } catch(Exception e) {
            System.out.println(e); 
        }
    }

    /**
     * Adds passenger to the list of passengers for the car lsit. Catches the exception mentioned in the Car class. 
     * @param c The array list of passengers on the train. 
     */
    public void boardCar(Car c){
        try {
            c.addPassenger(this); 
        } catch(Exception e) {
            System.out.println(e); 
        }
    }
    
   


}
