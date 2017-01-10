import static java.lang.Math.*;
public class MilesPerHour
{
	private int distance;
	private int hours;
	private int minutes;
	private double mph;

	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	public MilesPerHour(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	public void setValues(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
	}
	public double getMph()
	{
		mph = Math.round(distance / (hours + minutes / 60));
		return mph;
	}
}