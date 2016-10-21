import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.print("Please enter number:: ");
		int num = kb.nextInt();
		System.out.print("Please enter size:: ");
		int size = kb.nextInt();
		int result = 1;
		
		for(int i = 1; i <= size; i++)
		{ 
			System.out.println(num + "  | " + form(num,i));
		}
	}
	public static int form(int num, int i)
	{
		return num * i;
	}
}