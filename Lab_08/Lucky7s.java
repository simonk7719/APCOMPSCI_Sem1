import java.util.Scanner;
public class Lucky7s
{
	static String sentence;
	static int number;
	static int sum;
	static int digits;
	static Scanner kb = new Scanner(System.in); 
	
	public static void main(String[]args)
	{
		
		System.out.print("Enter number:: ");
		int num = kb.nextInt();
		System.out.println(luck(num));
	}
	
	
	public static int luck(int num)
	{
		
		if (num>0){
			if (num % 10 == 7){
				return 1 + luck(num/10);
			}
			else
				return 0 + luck(num/10);
		}
		else
		{
			return 0;
		}
	}
}

