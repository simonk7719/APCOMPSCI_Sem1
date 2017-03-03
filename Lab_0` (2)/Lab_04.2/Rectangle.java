import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the height of the Rectangle?");
		double h = kb.nextDouble();
		System.out.println("What is the length of the Rectangle");
		double l = kb.nextDouble();
		System.out.println("What is the width of the Rectangle?");
		double w = kb.nextDouble();
		
		double a = 4 * h ;
		double b = 4 * l ;
		double c = 4 * w ;
		double p = a + b + c;
		System.out.printf("Your Rectangle's perimeter is %10000.5f ft around.", p);
	}
	
}