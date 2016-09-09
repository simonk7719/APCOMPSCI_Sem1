import java.util.Scanner;
public class Simple_integrals
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Simple integral solver! This calculator is for integrating one term with one variable. Enter coefficient to begin");
		
		double c = keyboard.nextDouble();
		
		System.out.println("Please enter the power of your variable ");
		
		double e = keyboard.nextDouble();
		
		double d = e + 1;
		
		double ei = 1 / d;
		
		double f = ei * c;
		
		System.out.println(f + " x^ " + d);
		
		
		
	}
}