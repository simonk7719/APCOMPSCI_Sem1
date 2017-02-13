import java.util.*;
public class StudentAdvance extends Advance {
	public StudentAdvance(int dl){
		super(dl);
	}
   public int getPrice(){
	   return super.getPrice()/2;
   }
   public String toString()
	{
		return "Serial No. : " + getSerNo() + "\nPrice : " + getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}