import java.util.Scanner;
public class Password
{
	static Scanner keyboard = new Scanner(System.in);
	static String usernameActual = "Simon";
	static String passwordActual = "Kim";
	static String username;
	static String password;
	public static void main(String[]args)
	{
		Password form = new Password();
	
		
		System.out.println("Enter Username");
		username = keyboard.nextLine();
		System.out.println("Enter Password");
		password = keyboard.nextLine();
		passCheck();
	}

	public static void passCheck()
	{
		boolean correct = (usernameActual.equals(username) && passwordActual.equals(password));
		if (correct)
			System.out.println("Granted access");
		if (!passwordActual.equals(password))
			System.out.println("Your password is incorrect");
		if (!usernameActual.equals(username))
			System.out.println("Your username is incorrect");
	}
}