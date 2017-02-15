import static java.lang.Math.*;
public abstract class Ticket
{
	private int SerNo;
	private int price;

	public Ticket()
	{
		price = 0;
		SerNo = (int)(Math.random() * 9999999) + 1;
	}
	
	public int getSerNo()
	{
		return SerNo;
	}
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial No. : " + getSerNo() + "\nPrice : " + getPrice();
	}
}