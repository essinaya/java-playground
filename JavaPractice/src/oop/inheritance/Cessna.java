package oop.inheritance;


public class Cessna extends Airplane {

	public Cessna(String name, String airline) throws Exception {
		super(name, airline, 31);
		System.out.println("[Cessna] Constructor executed.");
	}
	
}
