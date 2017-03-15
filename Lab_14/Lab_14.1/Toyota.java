import java.util.*;
public class Toyota extends Car{
	private int ID;
	private double x;
	private double y;
public Toyota (String pos){
	x = Double.parseDouble(pos.split(", ")[0]);
	y = Double.parseDouble(pos.split(", ")[1]);
	ID = (int)(Math.random() * 999999) + 1;
	}
public int getID(){
	return ID;
	}
public void move(double p, double q){
	x += p;
	y += q;
	}
public double [] getLoc() {
	double[] Loc = new double[2];
	Loc[0] = x;
	Loc[1] = y;
	return Loc;
	}
}