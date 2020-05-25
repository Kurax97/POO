package rental;

public class Car extends Vehicle{
	private int nbPassengers;
	
	/**
	 * creates a car with given informations
	 * 
	 * @param brand
	 *            the vehicle's brand
	 * @param model
	 *            the vehicle's model
	 * @param productionYear
	 *            the vehicle's production year
	 * @param dailyRentalPrice
	 *            the daily rental price
	 * @param nbPassengers
	 * 	          the number of the seats of the car
	 */
	public Car(String brand, String model, int productionYear, float dailyRentalPrice, int nbPassengers){
		super(brand, model, productionYear, dailyRentalPrice);
		this.nbPassengers = nbPassengers;
	}
	
	/**
	 * @return the number of the car's seats
	 */
	public int getNbPassengers() {
		return this.nbPassengers;
	}
	
	public String toString() {
		return super.toString() + " " + this.nbPassengers;
 	}
	

}
