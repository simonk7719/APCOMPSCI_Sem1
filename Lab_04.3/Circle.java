import java.util.Scanner;
public class Circle
{
	static double r;
	static double a;
	
	public static void main(String[]args)
	{
		Circle x = new Circle();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		r = kb.nextDouble();
        System.out.printf("the area of your circle with " + r + " radius is " + "%100000.3f", x.average(r));

	}

	public static void average(r)
	{
		a = r * r * 3.14159;
		return a;
	}
	
}