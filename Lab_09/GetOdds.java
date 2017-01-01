import java.util.Scanner;
public class GetOdds
{
	static int [] num = new int [10];;
	public static void main(String[]args)
	{
		fillArray();
		System.out.print("For the following numbers...");
		printArray();
		System.out.println("\nThese are the odd numbers:: " + getOdds());
	}
		
	public static void fillArray()
	{
		for (int i = 0; i < num.length;i++)
		{
			num[i] = (int)(Math.random() * 100)+ 1;
		}
	}
	public static void printArray()
	{
		for (int numbers : num)
		{
			System.out.print(numbers + " ");
		}
	}
	public static String getOdds()
	{
		String odds = "";
		for (int numbers : num)
		{
			if((numbers % 2) == 1)
			{
				odds += (numbers + " ");
			}
		}
		return odds;
	}
}	
