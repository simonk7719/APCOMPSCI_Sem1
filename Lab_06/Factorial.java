import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.print("Please enter number for its factorial:: ");
		int num = kb.nextInt();
		int result = 1;
		
		for(int i = 1; i <= num; i++)
		{
			result = result * i;
		}
		System.out.println(result);
	}
}