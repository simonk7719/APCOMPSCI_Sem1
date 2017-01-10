import java.util.Scanner;
public class MPHRunner
{	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter distance: ");
		int distance = kb.nextInt();
		System.out.println("Enter minutes: ");
		int minutes = kb.nextInt();
		System.out.println("Enter hours: ");
		int hours = kb.nextInt();

		MilesPerHour calc = new MilesPerHour();
		calc.setValues(distance, hours, minutes);
		
		System.out.println(calc.getMph() + " MPH");
	}
}