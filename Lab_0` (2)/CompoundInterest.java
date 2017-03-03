import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[]args)
	{
		CompoundInterest form = new CompoundInterest();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the interest rate?");
		double intrate = kb.nextDouble();
		System.out.println("How much money do you need to borrow?");
		double principle = kb.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double compound = kb.nextDouble();
		System.out.println("For how many years are you using the loan?");
		double time = kb.nextDouble();
		
		form.interest(intrate, principle, compound, time);
	}

	public void interest(double intrate, double principle, double compound, double time)
	{
		double c = (1 + intrate / compound );
		double b = Math.pow(c, time * compound);
		double a = principle * b;
		System.out.printf("Your total yearly payment is $ " + "%10.2f", a);
		System.out.printf("\nYour total monthly payment is $ " + "%10.2f", a / 12);
	}
	
}