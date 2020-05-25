/**
* A class that modelize the Bike Station
* @author Benlamlih Mohammed
* @version 1.0
*/
public class BikeStation {

    // DEFINIR LES ATTRIBIUTS
	private String name;
	private final int capacity;
	private Bike [] bikes;

    /**
     * the constructor of class BikeStation with 2 parameters
     * @param name the name of the station
     * @param capacity the number of bikes that can be placed in this station
     */
	public BikeStation(String name, int capacity) {
		this.name = name;
		this.capacity = capacity; 
		this.bikes = new Bike [capacity];
	}

    /**
     * return the station's name
     * @return the name of the station
     */
	public String getName() {
		return this.name; 
	}

    /**
     * return the number of bikes that can placed in this station
     * @return the station's capacity
     */
	public int getCapacity() {
		return this.capacity;
	}

    /**
     * return the number of availble bikes in the station
     * @return the number of bike that are availble
     */
	public int getNumberOfBikes() {
		int total = 0;
		for (int i= 0; i < getCapacity(); i++){
			if (bikes[i] != null)
				total += 1;
		}
		return total;
	}

    
    /**
     * return the index of the first empty place for a bike 
     * @return the index of the first empty place for a bike 
     */
	public int firstFreeSlot() {
		int ind = -1;
		for (int i = 0; i < getCapacity(); i++){
			if (bikes[i] == null){
				ind = i;
				break;
			}
		}
		return ind;
	}
	
    /**
     * place a bike in the station and return true, and return false if there is not place
     * @return true if there is a place and add the bike to the table, return false otherwide
     * @param bike the bike that we want to place in the station 
     */
	public boolean dropBike(Bike bike) {
		for (int i = 0; i < getCapacity(); i++){
			if (bikes[i] == null){
				bikes[i] = bike;
				return true;
			}
		}
		return false;
	}
	
	
	
    /**
     * return a Bike in the place i or return null if the place i doesnt exist or doesnt have a bike
     * @return Bike if exist in position i or null if place i is empty or doesnt exist
     * @param i the bike's number place that we want to take 
     */
	public Bike takeBike(int i) {
		Bike c;
		if (i >= 0 && i < getCapacity())	{
			if (bikes[i] != null){
				c = bikes[i];
				bikes[i] = null;
				return c;
			}
		}
		return null;
	}
	
}
