import java.util.Scanner;
import java.util.ArrayList;
public class Divisor
{
	public static void main(String[]args)
	{
		int[][] nums = new int [4][4];

		for (int i = 0; i < nums.length;i++)
		{
			for (int j = 0; j < nums[i].length;j++)
			{
				nums[i][j] = (int)(Math.random() * 100 + 1);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();				
		}
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int div = kb.nextInt();

		int count = 0;
		
		for (int i = 0; i < nums.length;i++)
		{
			for (int j = 0; j < nums[i].length;j++)
			{
				if (nums[i][j] % div == 0)
					count++;
			}
		}
		System.out.print("There are " + count + "numbers divisible by " + div + "in the Array.");
	}
}