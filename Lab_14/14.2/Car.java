import java.util.*;
public abstract class Car implements Location{
	private double[] loc;
	private int ID;

	public Car(){
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	public void move(double x, double y) {
		loc = new double [] {x,y};
	}
	public double[] getLoc() {
		return loc;
	}
	public int getID() {
		return ID;
	}
	
}