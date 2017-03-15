import java.util.Scanner;
public class Song
{
	static String word;
	static int repeat;
	static String song = "";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		for (int i = 1; i <= 4; i++){
		System.out.print("Enter word you want to repeat:: ");
		word = kb.next();
		System.out.print("Enter how many times you want it to repeat:: ");
		repeat = kb.nextInt();
	
		sing();
		}
		System.out.println(song);
	}
	
	
	public static void sing()
	{
		for(int i = 0; i < repeat; i++)
		{
			song = song + " " + word;
		}
		song = song + "\n";
	}
}