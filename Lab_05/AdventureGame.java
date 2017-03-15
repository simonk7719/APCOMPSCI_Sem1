import java.util.Scanner;
public class AdventureGame
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in); 
		System.out.println("You are trapped in a cave.\nYou see two paths, one on the right and one on the left.\nWhere will you go?\nType \"a\" : walk left\nType \"b\" : walk right");;
		String choice1 = kb.nextLine();
		if (choice1.equalsIgnoreCase("a")){
			System.out.println("you chose to walk left.\nYou walk for a while until you see light from some crevice on the side of the cave, where you hear some jibberish.\nWhat will you do?\nType \"a\" : go check it out\nType \"b\" : ignore and keep walking straight");
			String choice1a = kb.nextLine();
			if (choice1a.equalsIgnoreCase("b"))
				System.out.println("You continue walking and soon see the light in front of you.\nYou reach the end, and rejoyce for a few minutes until you realize you are hungry without food.\nYou starve to death");
			else if (choice1a.equalsIgnoreCase("a")){
				System.out.println("You peek inside the small hole and see that it is a party of 4 robbers.\nYou see a chest beside them filled with gold.\nType \"a\" : go check it out\nType \"b\" : ignore and keep walking straight");
					String choice1b = kb.nextLine();
					if (choice1b.equalsIgnoreCase("b"))
						System.out.println("You continue your way to find a way on the top of the cave, with a rope hanging from the opening.\nYou climb up the rope, and you get outside.\nCongrats, You survived!");
					else if (choice1b.equalsIgnoreCase("a")){
						System.out.println("You make a noise, and the robbers are stunned by your presence.\nThey look at each other for a second, and somehow come up on a decision, and all rush towards you.\nYou are stabbed to death.");
					}
			}
		}else if (choice1.equalsIgnoreCase("b")){
			System.out.println("you chose to walk right.\nYou walk for a while until you hear faint growling in front of you.\nSwitching to a wary stance, you think about what to do.\nWhat will you do?\nType \"a\" : keep walking\nType \"b\" : head back");
			String choice1c = kb.nextLine();
			if (choice1c.equalsIgnoreCase("b")){
				System.out.println("You walk back, but you lose track of where you began.\nLost and in panic, you start running until you reach the end of the cave, where you find a skeleton holding two mysterious orbs on each hand, red and green.\nType \"a\" : touch the red\nType \"b\" : touch the green");
					String choice1d = kb.nextLine();
					if (choice1d.equalsIgnoreCase("b"))
						System.out.println("You touch the green orb.\nSuddenly you find yourself back in your bed, all comfy and happy. Congrats, you survived!");
					else if (choice1d.equalsIgnoreCase("a"))
						System.out.println("You touched the red orb.\nthe ord glows with great light and great noise.\nIt explodes into a thousand pieces, blowing up your hand along with it.\nYou soon die after losing too much blood.");
			}
			else if (choice1c.equalsIgnoreCase("a"))
				System.out.println("You keep walking to find a bear eating another bear.\nYou start retreating backwards, but the bear quickly notices you.\nThe bear rushes up on you in an instant, and you are eaten to death.");
		}
	}
}
