import java.util.*;
public class GMC implements Location {
	private int ID;
	private double x;
	private double y;
public GMC (double p, double q){
	x = p;
	y = q;
	ID = (int)(Math.random() * 999999) + 1;
}
public int getID(){
	return ID;
	}
public void move(double p, double q){
	x += p;
	y += q;
	}
public double        [] getLoc() {
	double[] Loc = new double[2];
	Loc[0] = x;
	Loc[1] = y;
	return Loc;
	}
}