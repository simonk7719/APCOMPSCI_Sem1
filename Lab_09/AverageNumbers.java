import java.util.Scanner;
public class AverageNumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter 10 numbers:: ");

		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)((Math.random() * 100) + 1);
		}
		
		System.out.println("Numbers...");
		
		for(int num : numbers)
		{
			System.out.println(num + " ");
		}
		
		System.out.println("The average of the above numbers is... " + average(numbers));
	}
		
	public static double average(int[] newnum)
	{
		int sum = 0;
		for (int num : newnum){
			sum = sum + num;
		}
		return sum /10;
		
		
	}
}	

