/**
* Main class for the class BikeStation
* @author Benlamlih Mohammed
* @version 1.0
*/
public class BikeStationMain {

	public static void main(String[] args){
		BikeStation station = new BikeStation("Timoleon", 10);
		Bike b1 = new Bike("b001", BikeModel.CLASSICAL);
		Bike b2 = new Bike("b002", BikeModel.ELECTRIC);
		station.dropBike(b1);
		station.dropBike(b2);
		if (args.length != 0){
			Bike c;
			c = station.takeBike(Integer.parseInt(args[0]));
			if (c != null){
				System.out.println("Vous avez pris le vélo : " + c.getId() + ". Le prix de location pour ce modèle est: "+ c.getPrice()+ "€");
			}else{
				System.out.println("Le vélo que vous désirez est indisponible :(");
			}
			
		}
	}



}
