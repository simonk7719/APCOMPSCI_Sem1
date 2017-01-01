import java.util.Scanner;
public class BiggestNumber
{
	static int [] num;
	public static void main(String[]args)
	{
		num = new int[10];
		fillArray();
		System.out.println("For the following numbers ");
		printArray();
		System.out.print("\nThe biggest number is " + getBiggest());
	}
	public static void fillArray()
	{
		for (int i = 0; i < num.length; i++)
			num[i] = (int)(Math.random() * 100) + 1;
	}
	public static void printArray()
	{		
		for(int numbers : num)
			System.out.print(numbers + " ");
	}
	public static int getBiggest()
	{
		int max = 0;
		for (int numbers : num)
		{
			if(numbers >= max)
				max = numbers;
		}
		return max;
	}
}