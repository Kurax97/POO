package rental;


public class MainRentalAgency {

	public static void main(String[] args) {
		
		// Creation of Vehicle objects
		Vehicle v1 = new Vehicle("brand1","model1",2015,100.0f);
		Vehicle v2 = new Vehicle("brand1","model1",2012,60.0f);
		Vehicle v3 = new Vehicle("brand1","model2",2015,50.0f);
		Vehicle v4 = new Vehicle("brand2","model3",2015,100.0f);
		
		
		Car car1 = new Car("Ford", "Focus", 2018,100.0f, 5);
		Car car2 = new Car("Ford", "Mustang", 2016,250.0f, 4);
		
		
		Motorbike moto1 = new Motorbike("Yamaha", "R6", 2006,160.0f, 600);
		Motorbike moto2 = new Motorbike("Kawazaki", "H2", 2017,200.0f, 800);
		
		// Creation of RentalAgency object
		RentalAgency agence = new RentalAgency();
		
		// Add Vehicle Objects to RentalAgency
		agence.addVehicle(v1);
		agence.addVehicle(v2);
		agence.addVehicle(v3);
		
		
		agence.addVehicle(car1);
		agence.addVehicle(car2);
		
		
		agence.addVehicle(moto1);
		agence.addVehicle(moto2);
		
		
		// Create an AndFilter
		AndFilter filters = new AndFilter();
		
		// Adding two filters
		BrandFilter brd1 = new BrandFilter("brand1");
		MaxPriceFilter brd2 = new MaxPriceFilter(80);
		MaxPriceFilter pr1 = new MaxPriceFilter(180);
		
		filters.addFilter(brd1);
		filters.addFilter(brd2);
		
		// AndFilter
		agence.displaySelection(filters);
		
		System.out.println("Vehicles for under 180$ :");
		
		// Price filter for Q6
		agence.displaySelection(pr1);
		
		Client c1 = new Client("Simo", 19);
		Client c2 = new Client("Lyes", 19);
		Client c3 = new Client("Mike", 23);
		Client c4 = new Client("Caitlyn", 26);
		Client c5 = new Client("Sena", 21);
		
		try {
			System.out.println(agence.rentVehicle(c2, v4));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		try {
			System.out.println(agence.rentVehicle(c1, v1));	
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		try {
			System.out.println(agence.rentVehicle(c1, v2));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		try {
			System.out.println(agence.rentVehicle(c3, v2));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		
		try {
			System.out.println(agence.rentVehicle(c4, car2));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		try {
			System.out.println(agence.rentVehicle(c5, moto2));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		System.out.println(agence.allRentedVehicles());
		System.out.println(moto1.toString());
		System.out.println(car1.toString());
		
		
		
		// Suspicious Agency 
		SuspiciousRentalAgency suspiciousAgency = new SuspiciousRentalAgency();
		suspiciousAgency.addVehicle(moto1);
		
		SuspiciousRentalAgency suspiciousAgency2 = new SuspiciousRentalAgency();
		suspiciousAgency2.addVehicle(moto1);
		
		System.out.println("Suspicious agency renting the same vehicule to two people with diffrent age");
		
		// Different results because of age
		try {
			System.out.println(suspiciousAgency.rentVehicle(c4, moto1));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		try {
			System.out.println(suspiciousAgency2.rentVehicle(c5, moto1));
		}catch(UnknownVehicleException e) {
			System.out.println("Unavailble vehicle");
		}catch(IllegalStateException e) {
			System.out.println("This client has already rented a vehicle");
		}
		
		
		
	}

}
