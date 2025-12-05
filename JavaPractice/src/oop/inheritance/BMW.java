package oop.inheritance;

public class BMW extends Car {
	
	private boolean adaptiveCruiseControl;
    private boolean sportMode;
    
    
    public BMW() {
    	System.out.print("☢☢ BMW constructor loaded");
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
}
