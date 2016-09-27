import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Average x = new Average();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Average finder! \nWhat is your first number?");
		double num1 = kb.nextDouble();
		System.out.println("What is your second number?");
		double num2 = kb.nextDouble();
		System.out.println("What is your third number?");
		double num3 = kb.nextDouble();
		
		x.average(num1, num2, num3);
	}

	public void average(double num1, double num2, double num3)
	{
		double s = num1 + num2 + num3;
		double avg = s / 3 ;
		System.out.printf("the average of three numbers is " + "%100000.3f", avg);
	}
	
}