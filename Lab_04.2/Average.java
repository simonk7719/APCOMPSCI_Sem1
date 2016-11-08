import java.util.Scanner;
public class Average
{
	public void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Average finder! \nWhat is your first number?");
		double num1 = kb.nextDouble();
		System.out.println("What is your second number?");
		double num2 = kb.nextDouble();
		System.out.println("What is your third number?");
		double num3 = kb.nextDouble();
		double s = num1 + num2 + num3;
		double avg = s / 3 ;
		System.out.printf("the average of three numbers is " + "%100000.3f", avg);
	}
	
}