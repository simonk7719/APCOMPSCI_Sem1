import java.lang.Math.*;
import java.util.*;
public class TicketDriver {
	static Scanner kb = new Scanner(System.in); 
    public static void main(String args[]) {
		Ticket walkup = new Walkup();
		System.out.println(walkup);
		
		System.out.print("How many days left until event?:: ");
		int days = kb.nextInt();
		Ticket adv = new Advance(days);
		System.out.println(adv);
		Advance sadv = new StudentAdvance(days);
		System.out.println(sadv);

    }
}