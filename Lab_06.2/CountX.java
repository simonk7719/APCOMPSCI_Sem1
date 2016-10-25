import java.util.Scanner;
public class CountX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.print("Enter the number you want to count up to:: ");
		int num = kb.nextInt();
		System.out.print("Enter intervals of count:: ");
		int interval = kb.nextInt();
		
		for(int i = 2; i <= num; i+= interval)
		{
		System.out.print(i);
		}
	}
}