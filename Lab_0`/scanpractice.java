import java.util.Scanner;
public class scanpractice
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow!" + num + " is correct." +  "You're pretty handsome.");
	}
}