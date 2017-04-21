import java.util.*;
public class Toyota extends Car{
	public Toyota (String pos){
		super();
		String[] posV = pos.split(", ");
		this.move(Double.parseDouble(posV[0]),Double.parseDouble(posV[1]));
		super.move(Double.parseDouble(posV[0]),Double.parseDouble(posV[1]));
	}
}