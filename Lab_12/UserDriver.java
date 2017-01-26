import java.util.*;
public class UserDriver
{ 
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String f = kb.nextLine();
		System.out.println("What is your last name?");
		String l = kb.nextLine();
		System.out.println("Do you want to use a public avatar?(y or n)");
		String ans = kb.nextLine();
		
		User userN = new User(f,l);
		if (ans.equals("n")){
			userN = new User(f,l);
		} else if (ans.equalsIgnoreCase("y")){
			System.out.println("Enter name of avatar?");
			String avt = kb.nextLine();
			userN = new User(f,l,avt);
		}else { 
			userN = new User();
		}
		System.out.println(userN);
	}
} 