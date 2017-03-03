import static java.lang.Math.*;
public class Car {

	private String paint;
	private String interior;
	private String engine;
	private String tires;

	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	public Car(String pnt, String itr, String eng, String trs)
	{
		paint = pnt;
		interior = itr;
		engine = eng;
		tires = trs;
	}
	public void setValues(String pnt, String itr, String eng, String trs)
	{
		paint = pnt;
		interior = itr;
		engine = eng;
		tires = trs;
	}
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
}