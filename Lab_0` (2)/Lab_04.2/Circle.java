import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
	
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		double r = kb.nextDouble();
		double a = r * r * 3.14159;
		System.out.printf("the area of your circle with " + r + " radius is " + "%100000.3f", a);
	}
	
}