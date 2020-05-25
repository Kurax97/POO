package rental;

public class Motorbike extends Vehicle{
	private int cylinder;
	
	
	/**
	 * creates a motorbike with given informations
	 * 
	 * @param brand
	 *            the vehicle's brand
	 * @param model
	 *            the vehicle's model
	 * @param productionYear
	 *            the vehicle's production year
	 * @param dailyRentalPrice
	 *            the daily rental price
	 * @param cylinder 
	 * 	          the motorbike's cylinder in cm3
	 */
	public Motorbike(String brand, String model, int productionYear, float dailyRentalPrice, int cylinder){
		super(brand, model, productionYear, dailyRentalPrice);
		this.cylinder = cylinder;
	}
	
	/**
	 * @return the motorbike's cylinder
	 */
	public int getCylinder() {
		return this.cylinder;
	}
	
	public String toString() {
		return super.toString() + " " + this.cylinder;
 	}
}
