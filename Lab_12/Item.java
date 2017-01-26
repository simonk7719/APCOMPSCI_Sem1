import static java.lang.Math.*;
public class Item
{
	private String manufacture;
	private String name;
	private String category;
	private int UPC;
	private int price;

	public Item()
	{
		manufacture ="";
		name ="";
		category = "";
		price = 0;
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	public Item(String man, String nam)
	{
		manufacture = man;
		name = nam;
		category = "";
		price = 0;
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	public Item(String man, String nam, String cat, int pri)
	{
		manufacture = man;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	public void setValues(String man, String nam, String cat, int pri){
		manufacture = man;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 999999999) + 1;
	}
	public String getmanufacturer()
	{
		return manufacture;
	}
	public String getname()
	{
		return name;
	}
	public String getcategory()
	{
		return category;
	}
	public int getUPC()
	{
		return UPC;
	}
	public int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "Item Info:\nManufacturer: " + manufacture +"\nName: " +name+"\nPrice: $"+ price+"\nCategory: " + category +"\nUPC: " +UPC;
	}
}