import java.util.Scanner;
public class CarDriver
{	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter paint color: ");
		String pnt = kb.nextLine();
		System.out.println("Enter interior color: ");
		String itr = kb.nextLine();
		System.out.println("Enter engine type: ");
		String eng = kb.nextLine();
		System.out.println("Enter Tire type: ");
		String trs = kb.nextLine();

		Car calc = new Car();
		calc.setValues(pnt, itr, eng, trs);
		
		System.out.println(calc.getPaint() + " paint");
		System.out.println(calc.getInterior() + " interior");
		System.out.println(calc.getEngine() + " engine");
		System.out.println(calc.getTires() + " tires");
	}
}