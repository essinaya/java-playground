package oop.inheritance;

public class Car extends Vehicle {

	private double trunkSize;
    private String brand;
    private int numberOfDoors;
    
    public Car() {
    	System.out.println("[Car] Car constructor executed.");
    }
    
    public Car(double trunkSize, String brand, int numberOfDoors) {
    	System.out.println("[Car] Car constructor with parameters executed.");
    	this.trunkSize = trunkSize;
    	this.brand = brand;
    	this.numberOfDoors = numberOfDoors;
    }

    public double getTrunkSize() {
		return trunkSize;
	}

	public void setTrunkSize(double trunkSize) {
		this.trunkSize = trunkSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) throws Exception {
		System.out.println("[Car] Car setNumberOfDoors executed.");
		if (numberOfDoors < 2) {
			throw new Exception("[Car] Number of doors must be alteast 2");
		}
		this.numberOfDoors = numberOfDoors;
	}

	public void openTrunk() {
        System.out.println("[Car] Trunk opened. Capacity: " + trunkSize + " liters.");
    }

    public void closeTrunk() {
        System.out.println("[Car] Trunk closed.");
    }

    public void playMusic(String track) {
        System.out.println("[Car] Now playing: " + track);
    }
	
    public String start() {
		return "[Car] Car is starting!";
    	
    }
    
    public String stop() {
		return "[Car] Vehicle is stopping!";
	}

}
