import java.util.Scanner;
public class ReverseNumber
{
	static int num;
	static int number;
	static int rev;
	static int digits;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
	
		System.out.print("Enter number:: ");
		num = kb.nextInt();
		number = num;
		rev = 0;
		digits = 0;
	
		getReverse();
		
		System.out.println("The avg of the digits in " + number + " is " +  rev);
	}
	
	
	public static void getReverse()
	{
		while(num >= 1)
		{
			rev = (rev *10) + (num % 10);
			num /= 10;
		}
	}
}