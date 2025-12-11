package oop.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InheritanceMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Vehicle vc = new Vehicle();
		
		introduction();
		System.out.println("➤➤ Facility Control Scanning available vehicles...");
		List<Vehicle> fleet = new ArrayList<>();
		fleet = facilityControl(fleet);
		System.out.println("");
		//System.out.println("➤➤ Done! Please see selection of our available vehicles: ");
		//listVehicles(fleet);
		System.out.println("➤➤ Please choose where you want to test: [1] Road | [2] Tarmac");
		int testingGrounds = sc.nextInt();
		clearScreen();
		
		vc = listVehiclesAndReturnVehicle(fleet, testingGrounds);
		System.out.println("You chose "+vc.getName());
		warmUp(vc);
		
		
		
		sc.close();
	}
	
	public static void introduction() {
		System.out.println("➤➤ Welcome to Essi's Garage!");
		System.out.println("➤➤ Your one-stop shop for testing vehicles!");
	}
	
	public static List<Vehicle> facilityControl(List<Vehicle> vehicleList) throws Exception{
		//treating everything as Vehicle
		//every subclass IS-A Vehicle
		//here, we demonstrate Polymorphism as well! :D
		Random rand = new Random();
		System.out.println("➤➤ Adding new Audi");
		vehicleList.add(new Audi(true, false, "Audi R8", rand.nextDouble(2.5, 5.0), "Audi", 2));
		System.out.println("");
		System.out.println("➤➤ Adding new BMW");
		vehicleList.add(new BMW(true, false, "2025 BMW X4", rand.nextDouble(2.5, 5.0), "BMW", 2));
		System.out.println("");
		System.out.println("➤➤ Adding new Mercedes");
		vehicleList.add(new Mercedes(rand.nextDouble(2.5, 5.0), "Mercedes", 4, "Green", true, "E 200 AMG Line"));
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
		int i = 0;
		String type = "";
		for (Vehicle vehicle : vehicleList) {
			if(vehicle instanceof Audi) {
				type = "Audi";
			} else if(vehicle instanceof BMW) {
				type = "BMW";
			} else if(vehicle instanceof Mercedes) {
				type = "Mercedes";
			} else if(vehicle instanceof AirbusA320) {
				type = "Airbus";
			} else if(vehicle instanceof Boeing737) {
				type = "Boeing";
			} else {
				type = "Generic Vehicle";
			}
			System.out.println("➤➤ "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			i++;
		}
	}
	
	public static Vehicle listVehiclesAndReturnVehicle(List<Vehicle> vehicleList, int testingGrounds) {
		int i = 0;
		String type = "";
		Vehicle vc = new Vehicle();
		System.out.println("➤➤ Please choose from the following available vehicles: ");
		for (Vehicle vehicle : vehicleList) {
			if(vehicle instanceof Car && testingGrounds == 1) {
				if(vehicle instanceof Audi) {
					type = "Audi";
				} else if(vehicle instanceof BMW) {
					type = "BMW";
				} else if(vehicle instanceof Mercedes) {
					type = "Mercedes";
				} else {
					type = "Car";
				}
				System.out.println("➤➤ "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			} else if(vehicle instanceof Airplane && testingGrounds == 2) {
				if(vehicle instanceof AirbusA320) {
					type = "Airbus";
				} else if(vehicle instanceof Boeing737) {
					type = "Boeing";
				} else {
					type = "Airplane";
				}
				System.out.println("➤➤ "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			}
			i++;
		}
		int vehicleChoice = sc.nextInt();
		vc = vehicleList.get(vehicleChoice);
		return vc;
	}
	
	
	
	//we can see polymorphism in action here.
	//I pass a Vehicle object instead of a specific object like Audi, Boeing, or Car or Airplane.
	//polymorphism refers to a subclass can reference a superclass object
	//which means, I can pass any subclass object here as long as it's a superclass of the Vehicle.
	//more efficient and cleaner code!
	public static void warmUp(Vehicle vehicle) {
		Random rand = new Random();
		System.out.println("Warming up "+vehicle.getName()+"...");
		vehicle.start();
		vehicle.accelerate(rand.nextDouble(11.0, 50.0));
		vehicle.brake(rand.nextDouble(5.0, 10.0));
		vehicle.stop();
	}
	
	public static void clearScreen() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	}

	
}
