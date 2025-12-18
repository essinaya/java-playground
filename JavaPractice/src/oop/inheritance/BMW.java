package oop.inheritance;

public class BMW extends Car {
	
	private boolean adaptiveCruiseControl;
    private boolean sportMode;
    
    
    public BMW() {
    	System.out.print("☢☢ BMW constructor executed");
    }
    
    public BMW(boolean acc, boolean sm, String name,
    		   double trunkSize, String brand, int numOfDoors) throws Exception {
    	System.out.print("☢☢ BMW constructor with parameters executed");
    	this.adaptiveCruiseControl = acc;
    	this.sportMode = sm;
    	this.setName(name);
    	this.setTrunkSize(trunkSize);
    	this.setBrand(brand);
    	this.setNumberOfDoors(numOfDoors);
    }
    

    public boolean isAdaptiveCruiseControl() {
		return adaptiveCruiseControl;
	}

	public void setAdaptiveCruiseControl(boolean adaptiveCruiseControl) {
		this.adaptiveCruiseControl = adaptiveCruiseControl;
	}

	public boolean isSportMode() {
		return sportMode;
	}

	public void setSportMode(boolean sportMode) {
		this.sportMode = sportMode;
	}

	public void activateSportMode() {
        sportMode = true;
        System.out.println("Sport mode activated. Enjoy sharper handling!");
    }

    public void enableAdaptiveCruise() {
        if (adaptiveCruiseControl) {
            System.out.println("Adaptive cruise control enabled.");
        } else {
            System.out.println("This model does not support adaptive cruise control.");
        }
    }
    
    public String start() {
		return "BMW is starting!";
    	
    }
}
