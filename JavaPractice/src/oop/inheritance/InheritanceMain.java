package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {

	public static void main(String[] args) {
		
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
	
	public static List<Vehicle> facilityControl(List<Vehicle> vehicleList){
		//treating everything as Vehicle
		//every subclass IS-A Vehicle
		//here, we demonstrate Polymorphism! :D
		System.out.println("➤➤ Adding new Car");
		vehicleList.add(new Car());
		System.out.println("");
		System.out.println("➤➤ Adding new Audi");
		vehicleList.add(new Audi());
		System.out.println("");
		System.out.println("➤➤ Adding new BMW");
		vehicleList.add(new BMW());
		System.out.println("");
		System.out.println("➤➤ Adding new Mercedes");
		vehicleList.add(new Mercedes());
		System.out.println("");
		System.out.println("➤➤ Adding new Airplane");
		vehicleList.add(new Airplane());
		System.out.println("");
		System.out.println("➤➤ Adding new AirbusA320");
		vehicleList.add(new AirbusA320());
		System.out.println("");
		System.out.println("➤➤ Adding new Boeing737");
		vehicleList.add(new Boeing737());
		System.out.println("");
		
		return vehicleList;
	}
	
	public static void listVehicles(List<Vehicle> vehicleList) {
		for (Vehicle vehicle : vehicleList) {
			System.out.println("➤➤ "+ vehicle.getClass());
		}
	}
}
