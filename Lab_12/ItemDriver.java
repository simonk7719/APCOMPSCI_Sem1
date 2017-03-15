import java.util.*;
public class ItemDriver
{ 
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the manufacturer?");
		String m = kb.nextLine();
		System.out.println("What is the name?");
		String n = kb.nextLine();
		System.out.println("Do you want to enter catergory and price?(y or n)");
		String ans = kb.nextLine();
		
		Item itemN = new Item(m,n);
		if (ans.equals("n"))
		{
			itemN = new Item(m,n);
		} else if (ans.equalsIgnoreCase("y")){
			System.out.println("Enter name of category?");
			String c = kb.nextLine();
			System.out.println("Enter price?");
			int p = kb.nextInt();
			itemN = new Item(m,n,c,p);
		}
		else { 
			itemN = new Item();
		}
		System.out.println(itemN);
	}
} 