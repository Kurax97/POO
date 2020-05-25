package rental;

import java.util.*;

/** a suspicious rental vehicle agency, client can rent one vehicle at a time */

public class SuspiciousRentalAgency extends RentalAgency{
	
	// Attributes of the class SuspiciousRentalAgency
	
	static final float extraCost = 0.1f;
	static final int safeAge = 25;

	
	public SuspiciousRentalAgency() {
		super();
	}
	/** client rents a vehicle, if the clinet's age if less then 25 an extra cost if applied
	    * @param client the renter
	    * @param v the rented vehicle
	    * @return the daily rental price
	    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
	    * @exception IllegalStateException if v is already rented or client rents already another vehicle
	    */
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		if (client.getAge() < safeAge) {
			float res = super.rentVehicle(client, v);
			res += res * extraCost;
			return res;
		}else {
			return super.rentVehicle(client, v);
		}
	}
}
