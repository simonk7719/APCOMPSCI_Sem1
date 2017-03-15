import java.util.Scanner;
public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		
		String name = keyboard.nextLine();
		
		System.out.println("Your name is " + name + "?" + " Grubby name, I have to say.");
		
		System.out.println("How old are you, anyways? ");
		
		String age = keyboard.next();
		
		System.out.println("ORLRROLRRLRLRLRL " + age + "?!?1?!1!!" + " I'm pretty sure you're gonna die in 100 years.");
		
		System.out.println("What do you do for fun? ");
		
		String hobby = keyboard.next();
		
		System.out.println("I heard people who " + hobby + "eat dogs. Is that true?");
		
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.next();
		
		System.out.println("what a nerd." + " Only fobs listen to " + music + ".");
	
		System.out.println("How many siblings do you have? ");
		
		int Siblings = keyboard.nextInt();
		
		System.out.println(Siblings + " ??? Dude thats bad.");
			
		System.out.println("What do you want to be when you grow up? ");
		
		String dream = keyboard.next();
		
		System.out.println("Oops! Someone's doing that already.");
		
	}
}