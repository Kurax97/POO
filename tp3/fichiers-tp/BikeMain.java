/**
* Main class fo the class Bike
* @author Benlamlih Mohammed
* @version 1.0
*/
public class BikeMain{

	public static void main(String[] args){
		Bike bike1 = new Bike("b001", BikeModel.CLASSICAL);
		Bike bike2 = new Bike("b002", BikeModel.ELECTRIC); 
		System.out.println(bike1.equals(bike2));
		System.out.println(bike1.toString());
		System.out.println(bike1.getPrice());
	}
}
