import java.util.Scanner;
public class ReplaceAts
{
	static String sent;
	static int number;
	static int sum;
	static int digits;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
	
		System.out.print("Enter phrase:: ");
		String sentence = kb.nextLine();
		sent = sentence;
	
		replace();
		
		System.out.println(sent);
	}
	
	
	public static void replace()
	{
		while(sent.indexOf("a")>=0)
		{
			sent = sent.substring(0,sent.indexOf("a")) + "@" + (sent.substring(sent.indexOf("a") +1));
		}
		
	}
}