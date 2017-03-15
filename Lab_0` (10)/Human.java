import static java.lang.Math.*;
public class Human {

	private String hair;
	private String eyes;
	private String skin;

	public Human()
	{
		hair = "";
		eyes = "";
		skin= "";
	}
	public Human(String ha, String ey, String sk)
	{
		hair = ha;
		eyes = ey;
		skin = sk;
	}
	public void setValues(String ha, String itr, String sk)
	{
		hair = ha;
		eyes = itr;
		skin= sk;
	}
	public String gethair()
	{
		return hair;
	}
	public String geteyes()
	{
		return eyes;
	}
	public String getskin()
	{
		return skin;
	}
}