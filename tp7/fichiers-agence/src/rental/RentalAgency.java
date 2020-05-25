package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency{
    // vehicles of this agency
    protected List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client) 
    protected Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
    	this.theVehicles = new ArrayList<Vehicle>();
    	this.rentedVehicles = new HashMap<Client,Vehicle>();
    	
    }
    
    /** adds a vehicle to this agency 
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
    	this.theVehicles.add(v);
    }

    /** provides the list of the vehicles that is accepted by filter  
    * @param filter the selection filter
    * @return  the list of the vehicles accepted by filter
    */
    public List<Vehicle> select(VehicleFilter filter) {	
    	List<Vehicle> selectedVehicles = new ArrayList<Vehicle>();
    	for (Vehicle v: this.theVehicles) 
    		if (filter.accept(v))
    			selectedVehicles.add(v);
        return selectedVehicles;
    }
    
    /** displays the vehicles accepted by the filter 
    * @param filter the selection filter
    */
    public void displaySelection(VehicleFilter filter) {
    	List<Vehicle> availbleVehicles = this.select(filter);
    	for (Vehicle v: availbleVehicles)
    		System.out.println(v);
    }


    /** returns <em>true</em> if client c is renting a vehicle
     * @param client the client for which we want to know it has rented a vehicle
    * @return <em>true</em> if client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
        return this.rentedVehicles.containsKey(client);
    }
    
    /** returns <em>true</em> if vehicle v is rented
     * @param v the vehicle we want to check if it is rented
    * @return <em>true</em> if vehicle v is rented    
    */
    public boolean isRented(Vehicle v){
    	return this.rentedVehicles.containsValue(v);
    }

   /** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
    	if (!this.theVehicles.contains(v))
    		throw new UnknownVehicleException();
    	else if (!(this.isRented(v)) && !(this.hasRentedAVehicle(client))) {
    		this.rentedVehicles.put(client, v);
    		return v.getDailyPrice();
    	}else
    		throw new IllegalStateException();
    }

    
    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle. 
    * @param client the client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	if (this.hasRentedAVehicle(client))
    		this.rentedVehicles.remove(client);
    }
    
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles 
    */
    public Collection<Vehicle> allRentedVehicles(){
    	Set<Vehicle> rentedVehicles = new HashSet<Vehicle>();
    	for (Client key: this.rentedVehicles.keySet()){
    		rentedVehicles.add(this.rentedVehicles.get(key));
    	}
        return rentedVehicles;
    }

}
