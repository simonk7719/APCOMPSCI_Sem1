import java.util.Scanner;
public class HumanDriver
{	
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter hair color: ");
		String ha = kb.nextLine();
		System.out.println("Enter eyes color: ");
		String ey = kb.nextLine();
		System.out.println("Enter skin type: ");
		String sk = kb.nextLine();

		Human calc = new Human();
		calc.setValues(ha, ey, sk);
		
		System.out.println(calc.gethair() + " hair");
		System.out.println(calc.geteyes() + " eyes");
		System.out.println(calc.getskin() + " skin");
	}
}