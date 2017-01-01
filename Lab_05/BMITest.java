import java.util.Scanner;
public class BMITest
{
	static double BMI;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds.");
		double weight = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Enter height in inches.");
		double height = keyboard.nextDouble();
		keyboard.nextLine();
		BMI = ( 703 * ( weight / height/ height));
	
		System.out.println("Your BMI is "+BMI);
		test();
	}
	
	public static void test()
	{
		if (BMI < 18.5)
			System.out.println("underweight");
		else if (BMI < 24.9)
			System.out.println("normal");
		else if (BMI < 29.9)
			System.out.println("overwight");
		else if (BMI < 34.9)
			System.out.println("obese");
		else if (BMI < 39.9)
			System.out.println("very obese");
		else if (39.9 < BMI)
			System.out.println("morbidly obese");
		else
			System.out.println("not found");
	
	}
	
}