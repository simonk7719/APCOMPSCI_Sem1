import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter 5 names:: ");
		
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		
		System.out.println("\nIn order...");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println("\nIn reverse...");
		reverse(names);
	}
		
	public static void reverse(String[] names)
	{
		for (int i = names.length; i > 0; i--){
			System.out.println(names[i-1]);
		}
	}
}	

