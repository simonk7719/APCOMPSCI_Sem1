import java.util.Scanner;
public class DistanceRunner
{	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter x1: ");
		int x1 = kb.nextInt();
		System.out.println("Enter y1: ");
		int y1 = kb.nextInt();
		System.out.println("Enter x2: ");
		int x2 = kb.nextInt();
		System.out.println("Enter y2: ");
		int y2 = kb.nextInt();

		Distance calc = new Distance();
		calc.setValues(x1, y1, x2, y2);
		
		System.out.println(calc.getDist() + " distance");
	}
}