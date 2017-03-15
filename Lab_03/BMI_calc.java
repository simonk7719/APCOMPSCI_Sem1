import java.util.Scanner;
public class BMI_calc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to BMI calculator! Please enter user height in inches to begin.");
		
		int h = keyboard.nextInt();
		
		System.out.println("Please enter user weight in pounds. ");
		
		int w = keyboard.nextInt();
		
		int c = 703;
		
		int BMI = w * c / h / h;
		
		System.out.println("Congrats! your BMI is " + BMI);
		
		
	}
}