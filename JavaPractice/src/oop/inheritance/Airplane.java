package oop.inheritance;

public class Airplane {
	private double wingspan;
    private double altitude;
    private String airline;

    public void takeOff() {
        altitude = 1000;
        System.out.println("Airplane taking off. Altitude: " + altitude + " meters.");
    }

    public void land() {
        altitude = 0;
        System.out.println("Airplane has landed.");
    }

    public void deployLandingGear() {
        System.out.println("Landing gear deployed.");
    }

    public void retractLandingGear() {
        System.out.println("Landing gear retracted.");
    }
}
