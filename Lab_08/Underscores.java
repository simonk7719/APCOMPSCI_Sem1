import java.util.Scanner;
public class Underscores
{
	static String sentence;
	static int number;
	static int sum;
	static int digits;
	static Scanner kb = new Scanner(System.in); 
	public static void main(String[]args)
	{
		
		System.out.print("Enter phrase:: ");
		sentence = kb.nextLine();
		

		
		System.out.println(replace());
	}
	
	
	public static String replace()
	{
	
	
	
		if (sentence.indexOf(" ")<0){
			return sentence;
			}
		else
		{
			sentence = sentence.substring(0,sentence.indexOf(" ")) + "_" + (sentence.substring(sentence.indexOf(" ") +1));
			return replace();
		}
	}
}

