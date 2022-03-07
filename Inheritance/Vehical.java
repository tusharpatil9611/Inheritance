package Inheritance;

public class Vehical 
{
	String vehicalName;
	int vehicalModelNo;
	int vehicalPrice;
	String serviceStationName;
	public Vehical(String vehicalName, int vehicalModelNo, int vehicalPrice,
			String serviceStationName) 
	{
		//super();
		this.vehicalName = vehicalName;
		this.vehicalModelNo = vehicalModelNo;
		this.vehicalPrice = vehicalPrice;
		this.serviceStationName = serviceStationName;
	}
	public void Display()
	{
		System.out.println(vehicalName+ "\n"+vehicalModelNo+"\n"+vehicalPrice+"\n"+serviceStationName);
	}
}
class Bike extends Vehical
{
	int discountRate;
	public Bike(String vehicalName, int vehicalModelNo, int vehicalPrice,
			String serviceStationName,int discountRate) 
	{
		super(vehicalName, vehicalModelNo, vehicalPrice, serviceStationName);
		this.discountRate= discountRate;
	}
	public void display()
	{
		System.out.println(vehicalName+ "\n"+vehicalModelNo+"\n"+vehicalPrice+"\n"+serviceStationName+"\n"+discountRate);
	}
	public void Discount()
	{
		System.out.println("Discount on Vehical ="+(vehicalPrice*(discountRate/100)));
	}
}
