import java.util.*;
public abstract class Car implements Location{
	private int ID;
	private double[] Loc = new double[2];

	public Car(){
		Loc[0] = 0;
		Loc[1] = 0;
		ID = (int)(Math.random() * 1000000) + 100000;
	}
	public void move(double p, double q) {
		Loc[0] += p;
		Loc[1] += q;
	}
	public double[] getLoc() {
		return Loc;
	}
	public int getID() {
		return ID;
	}
	
}