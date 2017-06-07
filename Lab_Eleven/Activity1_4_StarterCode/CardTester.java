/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("three ", " clover ", 3);
		Card card2 = new Card("eight ", " spades ", 8);
		Card card3 = new Card("ace ", " diamonds ", 13);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
