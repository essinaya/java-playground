package oop.inheritance;

public class BMW extends Car {
	
	//TODO: CREATE CONSTRUCTORS FOR BMW, MERCEDES, AIRPLANE, BOEING737, AND AIRBUSA320
	private boolean adaptiveCruiseControl;
    private boolean sportMode;

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
