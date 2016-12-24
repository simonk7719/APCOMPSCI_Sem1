import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class GameGun
{
	static Scanner kb = new Scanner(System.in);
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String[] clip;

	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
	
		resetClip();

		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.print("Action: ");
			String action = kb.next();
			
			if (action == "R" )
			{
				reload();
			}
			if (action == "S" )
			{	
				System.out.print(shoot());
			}
			System.out.print(printClip());
		}
		System.out.print("Out of bullets!!");
	}
	public static void resetClip()
	{
		for(int i = 0;i < clip.length;i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return ("Boom!!!");
		}
		else
		{
			return ("Reload!!!");
		}
	}
	public static void reload()
	{
		if (bulletCount >= clipSize)
		{
			bulletCount = bulletCount - clipSize;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();

		for(int i = 0;i < shotCount;i++)
			{
				clip[i] = " * ";
			}
	}
	public static String printClip()
	{
		String output = "";
		output += "Bullets\t" + bulletCount + "\n" + "Clip: " + "\t";

		for (int i = 0;i < clipSize; i++)
		{
			output += clip[i];
		}
		return output;
	}
}