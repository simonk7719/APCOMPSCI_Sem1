import java.util.Scanner;
public class IDcard
{
	public static void main(String[]args)
	{
		IDcard form = new IDcard();
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter your first name:");
		String item1 = keyboard.nextLine();
		System.out.println("Enter your last name:");
		String price1 = keyboard.nextLine();
		System.out.println("Enter your title:");
		String item2 = keyboard.nextLine();
		System.out.println("Enter the school name");
		String price2 = keyboard.nextLine();
		System.out.println("Enter school year");
		String item3 = keyboard.nextLine();
		System.out.println("Enter subject");
		String price3 = keyboard.nextLine();
		
		System.out.println("***********************************");
		form.format(price2, item3);
		form.format(item1, price1);
		form.format(item2, price3);
		System.out.println("\n************************************");

		
	}
	

	public void format(String item, String price)
	{
		System.out.printf("\n*%10s        %10s  *",  item, price);
		
	}
}