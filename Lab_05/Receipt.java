import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please enter item 1");
		String item1 = keyboard.nextLine();
		System.out.println("Enter price of item 1");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Please enter item 2");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter price of item 2");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Please enter item 3");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter price of item 3");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("\n\n\n<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		
		form.format(item2, price2);
		form.format(item3, price3);
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * 0.075;
		double total = tax + subtotal;
		
		boolean discount = total >= 2000;
		
		if (discount)
			total = total * 0.85;
		
		form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("\n___________________________________");
		System.out.println("Thank you for your support");
		
	}
	

	public void format(String item, double price)
	{
		System.out.printf("\n*%15s ........  %10.2f",  item, price);
		
	}
}
