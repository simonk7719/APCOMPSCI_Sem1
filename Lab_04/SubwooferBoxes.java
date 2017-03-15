import java.util.Scanner;
public class SubwooferBoxes
{
	public static void main(String[]args)
	{
		SubwooferBoxes box = new SubwooferBoxes();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the height of the box in inches?");
		double h = kb.nextDouble();
		System.out.println("What is the length of the box in inches");
		double l = kb.nextDouble();
		System.out.println("What is the width of the box in inches?");
		double w = kb.nextDouble();
		
		box.volume(h,l,w);
	}

	public void volume(double h, double l, double w)
	{
		double v = h * w * l ;
		System.out.printf("Your box's volume in cubic feet is " + "%10.3f", v * 0.00057870);
	}
	
}