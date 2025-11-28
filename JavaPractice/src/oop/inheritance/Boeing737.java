package oop.inheritance;

public class Boeing737 extends Airplane {
	private String engineType;
    private int passengerCount;

    public void deployFlaps() {
        System.out.println("Flaps deployed for increased lift.");
    }

    public void retractFlaps() {
        System.out.println("Flaps retracted for cruise flight.");
    }
}
