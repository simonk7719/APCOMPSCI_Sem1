import java.util.Scanner;
public class Rectangle
{
	static double a;
	static double b;
	static double c;
	static double p;
	static double h;
	static double l;
	static double w; 
	
	public static void main(String[]args)
	{
		Rectangle box = new Rectangle();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the height of the Rectangle?");
		h = kb.nextDouble();
		System.out.println("What is the length of the Rectangle");
		l = kb.nextDouble();
		System.out.println("What is the width of the Rectangle?");
		w = kb.nextDouble();
		
		System.out.printf("Your Rectangle's perimeter is %.5f ft around.",box.calcperim(h,l,w));
	}

	public static double calcperim(double h,double l,double w)
	{
		a = 4 * h ;
		b = 4 * l ;
		c = 4 * w ;
		p = a + b + c;
		return p;
	}
	
}