import java.util.Scanner;
public class FirstLetter
{	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		String [] words = new String[5];
		System.out.print("Enter 5 words");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
		System.out.print("\n");
	}

	public static void first(String[] words)
	{
		for (String word : words)
		{
			System.out.print(word.charAt(0) + " ");
		
		}
	}
}