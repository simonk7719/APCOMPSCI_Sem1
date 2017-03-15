import java.util.*;
public class Honda extends Car {
	private int ID;
	private double x;
	private double y;
public Honda (double[] Pos){
	x = Pos[0];
	y = Pos[1];
	ID = (int)(Math.random() * 999999) + 1;
	}
public int getID(){
	return ID;
	}
public void move(double p, double q){
	x += p;
	y += q;
	}
public double[] getLoc() {
	double[] Loc = new double[2];
	Loc[0] = x;
	Loc[1] = y;
	return Loc;
	}
}
