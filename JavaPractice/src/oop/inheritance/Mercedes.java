package oop.inheritance;

public class Mercedes extends Car {
	private String ambientLightingColor;
    private boolean autoPilotEnabled;

    public void changeAmbientLighting(String color) {
        ambientLightingColor = color;
        System.out.println("Ambient lighting changed to " + color);
    }

    public void enableAutoPilot() {
        if (autoPilotEnabled) {
            System.out.println("AutoPilot engaged. Sit back and relax.");
        } else {
            System.out.println("This model does not support AutoPilot.");
        }
    }
}
