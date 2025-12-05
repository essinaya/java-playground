package oop.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InheritanceMain {

	public static void main(String[] args) throws Exception {
		
		introduction();
		System.out.println("➤➤ Facility Control Scanning available vehicles...");
		List<Vehicle> fleet = new ArrayList<>();
		fleet = facilityControl(fleet);
		System.out.println("");
		System.out.println("➤➤ Done! Please see selection of our available vehicles: ");
		listVehicles(fleet);
		
		
	}
	
	public static void introduction() {
		System.out.println("➤➤ Welcome to Essi's Garage!");
		System.out.println("➤➤ Your one-stop shop for testing vehicles!");
	}
	
	public static List<Vehicle> facilityControl(List<Vehicle> vehicleList) throws Exception{
		//treating everything as Vehicle
		//every subclass IS-A Vehicle
		//here, we demonstrate Polymorphism! :D
		Random rand = new Random();
		System.out.println("➤➤ Adding new Car");
		vehicleList.add(new Car());
		System.out.println("");
		System.out.println("➤➤ Adding new Audi");
		vehicleList.add(new Audi(true, false, "Audi R8", rand.nextDouble(2.5, 5.0), "Audi", 2));
		System.out.println("");
		System.out.println("➤➤ Adding new BMW");
		vehicleList.add(new BMW(true, false, "2025 BMW X4", rand.nextDouble(2.5, 5.0), "BMW", 2));
		System.out.println("");
		System.out.println("➤➤ Adding new Mercedes");
		vehicleList.add(new Mercedes(rand.nextDouble(2.5, 5.0), "Mercedes", 4, "Green", true, "E 200 AMG Line"));
		System.out.println("");
		System.out.println("➤➤ Adding new Airplane");
		vehicleList.add(new Airplane());
		System.out.println("");
		System.out.println("➤➤ Adding new AirbusA320");
		vehicleList.add(new AirbusA320(true, rand.nextDouble(100.0, 200.0), "Philippine Airlines", "A321XLR", rand.nextDouble(),rand.nextInt()));
		System.out.println("");
		System.out.println("➤➤ Adding new Boeing737");
		vehicleList.add(new Boeing737("Pratt & Whitney JT8D", rand.nextInt(150, 300), "Singapore Airlines", "737-MAX10", rand.nextDouble(100.0, 250.0), rand.nextDouble()));
		System.out.println("");
		
		return vehicleList;
	}
	
	public static void listVehicles(List<Vehicle> vehicleList) {
		for (Vehicle vehicle : vehicleList) {
			System.out.println("➤➤ "+ vehicle.getName());
		}
	}
	
}
