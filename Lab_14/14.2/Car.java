import java.util.*;
public abstract class Car implements Location{
	private int ID;
	private double x;
	private double y;

	public Car(){
		x=0;
		y=0;
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	public void move(double p, double q) {
		x +=p;
		y +=q;
	}
	public double[] getLoc() {
		double[] Loc = new double[2];
		Loc[0] = x;
		Loc[1] = y;
		return Loc;
	}
	public int getID() {
		return ID;
	}
	
}