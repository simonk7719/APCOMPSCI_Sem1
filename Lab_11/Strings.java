import java.util.Scanner;
import java.util.ArrayList;
public class Strings
{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String[][] words = new String[4][4];
	
		for (int i = 0; i < words.length;i++)
		{
			for (int j = 0; j < words[i].length;j++)
			{
				System.out.print("Please enter a word: ");
				words[i][j] = kb.nextLine();                                                     
			}
		}
		for (int i = 0; i < words.length;i++)
		{
			for (int j = 0; j < words[i].length;j++)
			{
				System.out.print(words[i][j] + "\t\t");                                             
			}
			System.out.println();       
		}
	}
}