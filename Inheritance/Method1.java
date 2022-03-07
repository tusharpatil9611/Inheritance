package Inheritance;

public class Method1 
{
	public void add()
	{
		System.out.println("Add in Parent class");
	}
	public void sub()
	{
		System.out.println("Sub Parent class");
	}

}
class Methodc extends Method1
{
	public void add()
	{
		System.out.println("Add in child class");
	}
	public void sub()
	{
		System.out.println("Sub in Child Class");
	}

}
