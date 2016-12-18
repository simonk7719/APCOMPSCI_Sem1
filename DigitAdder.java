import java.util.Scanner;
public class DigitAdder {	


	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[]args)

	{
		System.out.print("Enter Number”);
		int num = keyboard.nextInt();
		int sum= 0;
		int number= num;
		sumDigits();

		System.out.println(“the sum of the digits in your number”+ number +” is”+ sum);
	}
	public static void sumDigits(){

		while (num > 0) {
			sum = sum+ (num% 10);
			num /= 10;
		}
	}	
}