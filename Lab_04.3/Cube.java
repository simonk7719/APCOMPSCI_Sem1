import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Cube x = new Cube();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of one edge of your cube?");
		double edge = kb.nextDouble();
		System.out.printf("the surface area of your cube with" + edge + "sides is " + "%100000.3f", x.average(edge));
		
	}

	public double average(double edge)
	{
		double s = edge * edge * 6;
		return s;
	}
	
}