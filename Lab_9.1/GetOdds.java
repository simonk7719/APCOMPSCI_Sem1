import java.util.Scanner;
public class GetOdds
{
	static int [] num;
	public static void main(String[]args)
	{
		num = new int [10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.print("The" + getOdds() + " are odd numbers!");
	}
		
	public static double fillArray(int[] num)
	{
		for (int i = 0; i <= num.length();i++)
		{
			num[i] = (int)(math.random() * 100)+ 1;
		}
	}
	public static void printArray()
	{
		for (int numbers : num)
		{
			System.out.println(num + " ");
		}
	}
	public static double getOdds()
	{
		int odds = 0;
		
		for (int num : numbers)
		{
			if((num % 2) == 1) odds ++;
		}
		return odds;
	}
}	
