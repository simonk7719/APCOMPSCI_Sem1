import java.util.*;
public class Toyota extends Car{
	public Toyota (String pos){
		super();
	this.move(Double.parseDouble(pos.split(", ")[0]), Double.parseDouble(pos.split(", ")[1]));
	}
}