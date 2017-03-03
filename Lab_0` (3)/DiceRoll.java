import java.util.Scanner;
public class DiceRoll
{
	public static void main(String[]args)
	{
		DiceRoll form = new DiceRoll();
		
		Scanner kb = new Scanner(System.in); 
		System.out.println("Type \"Enter\" to simulate DiceRoll.");
		String play = kb.next();
		
		if (play.equalsIgnoreCase("enter")){
		int PlayerRoll = (int)((Math.random()*7));
		int CPURoll = (int)((Math.random()*7));
		
		System.out.println("you rolled a " + PlayerRoll + ".");
		System.out.println("Computer rolled a " + CPURoll + ".");
		System.out.println("The winner is...");
		
		form.roll(PlayerRoll, CPURoll);
		}
	}
	

	public void roll(int PlayerRoll, int CPURoll)
	{
		boolean PlayerWin = PlayerRoll > CPURoll;
		
		if (PlayerWin)
			System.out.println("You!");
		if (!PlayerWin)
			System.out.println("Computer!");
		
		
	}
}