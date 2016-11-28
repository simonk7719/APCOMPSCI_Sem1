import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double s;
	static double avg;
	
	
	public static void main(String[]args)
	{
		Average x = new Average();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Average finder! \nWhat is your first number?");
		num1 = kb.nextDouble();
		System.out.println("What is your second number?");
		num2 = kb.nextDouble();
		System.out.println("What is your third number?");
		num3 = kb.nextDouble();
		System.out.printf("the average of three numbers is " + "%100000.3f", x.average(num1, num2, num3));
	}

	public static void average(num1, num2, num3)
	{
		s = num1 + num2 + num3;
		avg = s / 3 ;
		return avg;
	}
	
}