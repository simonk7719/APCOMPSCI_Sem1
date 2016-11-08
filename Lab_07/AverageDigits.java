import java.util.Scanner;
public class AverageDigits
{
	static int num;
	static int number;
	static int sum;
	static int digits;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
	
		System.out.print("Enter number:: ");
		num = kb.nextInt();
		number = num;
		sum = 0;
		digits = 0;
	
		avDigits();
		
		System.out.println("The avg of the digits in " + number + " is " +  (double)sum/digits);
	}
	
	
	public static void avDigits()
	{
		while(num >= 1)
		{
			sum += (num % 10);
			num /= 10;
			digits++;
		}
	}
}