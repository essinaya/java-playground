package oop.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InheritanceMain {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) throws Exception {
		//we create a reference. not an Object (the new keyword)
		//it will be dangerous if the superclass was an abstract (meaning you can't use the new keyword)
		//anatomy: Vehicle (reference type) audi (ref variable) = new Audi() (obj instance)
		Vehicle vc;
		Random rand = new Random();
		
		introduction();
		System.out.println("[Main] Facility Control Scanning available vehicles...");
		List<Vehicle> fleet = new ArrayList<>();
		fleet = facilityControl(fleet);
		System.out.println("");
		//System.out.println("➤➤ Done! Please see selection of our available vehicles: ");
		//listVehicles(fleet);
		System.out.println("[Main] Please choose where you want to test: [1] Road | [2] Tarmac");
		int testingGrounds = sc.nextInt();
		clearScreen();
		
		vc = listVehiclesAndReturnVehicle(fleet, testingGrounds);
		System.out.println("[Main] You chose "+vc.getName());
		warmUp(vc);
		specializedPerfTest(vc);
		//if(rand.nextBoolean()) {
			//randomMachineChallenge(vc);
		//}
		
		sc.close();
	}
	
	public static void introduction() {
		System.out.println("[Main] Welcome to Essi's Garage!");
		System.out.println("[Main] Your one-stop shop for testing vehicles!");
	}
	
	//TODO put in a util class
	public static List<Vehicle> facilityControl(List<Vehicle> vehicleList) throws Exception{
		//treating everything as Vehicle
		//every subclass IS-A Vehicle
		//here, we demonstrate Polymorphism as well! :D
		Random rand = new Random();
		vehicleList.add(new Audi(rand.nextBoolean(), rand.nextBoolean(), "Audi R8", rand.nextDouble(2.5, 5.0), "Audi", 2));
		vehicleList.add(new BMW(rand.nextBoolean(), rand.nextBoolean(), "2025 BMW X4", rand.nextDouble(2.5, 5.0), "BMW", 2));
		vehicleList.add(new Mercedes(rand.nextDouble(2.5, 5.0), "Mercedes", 4, "Green", rand.nextBoolean(), "E 200 AMG Line"));
		vehicleList.add(new AirbusA320(rand.nextBoolean(), rand.nextDouble(100.0, 200.0), "Philippine Airlines", "A321XLR", rand.nextDouble(),rand.nextInt()));
		vehicleList.add(new Boeing737("Pratt & Whitney JT8D", rand.nextInt(150, 300), "Singapore Airlines", "737-MAX10", rand.nextDouble(100.0, 250.0), rand.nextDouble()));
		vehicleList.add(new Cessna("Cessna 172 Skyhawk", "Private"));
		
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
			System.out.println("[Main] "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			i++;
		}
	}

	
	public static Vehicle listVehiclesAndReturnVehicle(List<Vehicle> vehicleList, int testingGrounds) {
		int i = 0;
		String type = "";
		Vehicle vc = new Vehicle();
		System.out.println("[Main] Please choose from the following available vehicles: ");
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
				System.out.println("[Main] "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			} else if(vehicle instanceof Airplane && testingGrounds == 2) {
				if(vehicle instanceof AirbusA320) {
					type = "Airbus";
				} else if(vehicle instanceof Boeing737) {
					type = "Boeing";
				} else {
					type = "Airplane";
				}
				System.out.println("[Main] "+"["+i+"]"+ vehicle.getName()+" ("+type+")");
			}
			i++;
		}
		int vehicleChoice = sc.nextInt();
		vc = vehicleList.get(vehicleChoice);
		return vc;
	}
	
	
	
	//TODO put in a function class
	//we can see polymorphism in action here.
	//I pass a Vehicle object instead of a specific object like Audi, Boeing, or Car or Airplane.
	//polymorphism refers to a subclass can reference a superclass object
	//which means, I can pass any subclass object here as long as it's a superclass of the Vehicle.
	//more efficient and cleaner code!
	public static void warmUp(Vehicle vehicle) {
		if(vehicle instanceof Boeing737) {
			System.out.println("[1] announcements only | [2] announcements with passenger count");
			int boeingChoice = sc.nextInt();
			sc.nextLine();
			boeingAnnouncement(boeingChoice);
		}
		Random rand = new Random();
		System.out.println("[Main] Warming up "+vehicle.getName()+"...");
		System.out.println("[Main] Starting "+vehicle.getName()+"!");
		System.out.println(vehicle.start());
		System.out.println("[Main] Accelerating "+vehicle.getName()+"!");
		vehicle.accelerate(rand.nextDouble(11.0, 50.0));
		System.out.println("[Main] Braking "+vehicle.getName()+"!");
		vehicle.brake(rand.nextDouble(5.0, 10.0));
		System.out.println("[Main] Stopping "+vehicle.getName()+"!");
		System.out.println(vehicle.stop());
		
		
		System.out.println("Warm up done!");
	}
	
	public static void clearScreen() {
	    System.out.println("==================================================================");
	}
	
	//TODO put in a function class
	public static void specializedPerfTest(Vehicle vehicle) {
		System.out.println("[Main] Specialized Performance Test for "+vehicle.getName()+ " starting...");
		if (vehicle instanceof Car) {
			((Car) vehicle).openTrunk();
			//this is called DOWNCASTING.
			//it refers to converting a superclass reference to a subclass reference
			//it is explicit and needs to be handled CAREFULLY (this is why I don't see it often in enterprise softwares)
			//Utilized to access subclass-specific functionality
			//Requires type checking to avoid ClassCastExceptio, unlike in upcasting that's usually used in polymporphism
			//but in upcasting, we can only access superclass methods. in downcasting, we can access specific subclass methods
			((Car) vehicle).playMusic(giveMeRandomMusic());
			System.out.println("[Main] Initiating "+((Car) vehicle).getBrand()+ " specific performance test.");
			if(vehicle instanceof Audi) {
				((Audi) vehicle).enableQuattroMode();
			} else if (vehicle instanceof BMW) {
				((BMW) vehicle).activateSportMode();
			} else if (vehicle instanceof Mercedes) {
				((Mercedes) vehicle).changeAmbientLighting(giveMeRandomColor());
			} else {
				System.out.println("[Main] No "+((Car) vehicle).getBrand()+" specific performance test found.");
			}
		} else if (vehicle instanceof Airplane) {
			//for Airplane, I'll use Airline. I could use getClass and then tri the string to get the class name, but I am lazy.
			//therefore, we'll use airline instead.
			((Airplane) vehicle).takeOff();
			((Airplane) vehicle).deployLandingGear();
			System.out.println("[Main] Initiating "+((Airplane) vehicle).getAirline()+ " specific performance test.");
			if(vehicle instanceof AirbusA320) {
				((AirbusA320) vehicle).activateFlyByWire();
			} else if (vehicle instanceof Boeing737) {
				((Boeing737) vehicle).deployFlaps(); 
			} else {
				System.out.println("[Main] No "+((Airplane) vehicle).getAirline()+" specific performance test found.");
			}
		} else {
			System.out.println("[Main] What kind of Vehicle are you testing?");
		}
		System.out.println("[Main] Specialized Performance Test done!");
	}
	
	//TODO put in a util class
	public static String giveMeRandomMusic() {
		Random rand = new Random();
		List<String> musicPlaylist = new ArrayList<String>();
		musicPlaylist.add("Revolution by Bastille");
		musicPlaylist.add("Movie Scene by grentperez");
		musicPlaylist.add("Poster Boy by 2hollis");
		musicPlaylist.add("Diet Pepsi  by Addison Rae");
		musicPlaylist.add("lowkey by Niki");
		musicPlaylist.add("The Emptiness Machine by Linkin Park");
		musicPlaylist.add("To The Edge by Masayoshi Soken");
		musicPlaylist.add("Golden Hour by JVKE");
		
		return musicPlaylist.get((rand.nextInt(0, (musicPlaylist.size() - 1))));
	}
	
	//TODO put in a util class
	public static String giveMeRandomColor() {
		Random rand = new Random();
		List<String> colorPalette = new ArrayList<String>();
		colorPalette.add("Red");
		colorPalette.add("Orange");
		colorPalette.add("Yellow");
		colorPalette.add("Green");
		colorPalette.add("Blue");
		colorPalette.add("Indigo");
		colorPalette.add("Violet");
		colorPalette.add("Gobbue Green (RARE)");
		
		return colorPalette.get((rand.nextInt(0, (colorPalette.size() - 1))));
	}
//	(dynamic binding resolves actual subclass at runtime)
//	v executes subclass behaviour depending on its real type
	//TODO put in a function class
	public static void randomMachineChallenge(Vehicle vehicle) {
		System.out.println("[Main] Hold up! A random machine challenge for "+vehicle.getName()+" is initialized!");
		String startString = vehicle.start();
		System.out.println(startString);
	}
	

	public static void emergencyProtocol(Vehicle vehicle) {
		System.out.println("[Main] EMERGENCY PROTOCOL for "+vehicle.getName()+" is initialized!");
		vehicle.stop();
		if(vehicle instanceof Car) {
			if(vehicle instanceof Audi) {
				((Audi) vehicle).enableQuattroMode();
			} else if (vehicle instanceof BMW) {
				((BMW) vehicle).activateSportMode();
			} else if (vehicle instanceof Mercedes) {
				((Mercedes) vehicle).changeAmbientLighting(giveMeRandomColor());
			} else {
				System.out.println("[Main] No emergency protocol found for "+vehicle.getName());			}
		} else if(vehicle instanceof Airplane) {
			((Airplane) vehicle).retractLandingGear();
			
		} else {
			System.out.println("[Main] Generic emergency Protocol initialized!");
		}
	}
	
	public static void boeingAnnouncement(int choice) {
		Boeing737 boeing = new Boeing737();
		if(choice == 1) {
			System.out.print("Enter your message: ");
			String msg = sc.nextLine();
			boeing.announceCabinStatus(msg);
			
		} else {
			System.out.print("Enter your message: ");
			String msg = sc.nextLine();
			System.out.println("How many passengers?: ");
			int numOfPsngers = sc.nextInt();
			boeing.announceCabinStatus(msg, numOfPsngers);
		}
	}
	
}
