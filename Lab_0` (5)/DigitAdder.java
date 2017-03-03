import java.util.Scanner;
public class DigitAdder
{
	static int num;
	static int number;
	static int sum;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
	
		System.out.print("Enter number:: ");
		num = kb.nextInt();
		number = num;
		sum = 0;
	
		sumDigits();
		
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	
	public static void sumDigits()
	{
		while(num >= 1)
		{
			sum = sum + (num % 10);
			num /= 10;
		}
	
	}
}