package Inheritance;

public class Hirerachical 
{
	
	public void add(int a, int b)
	{
		System.out.println("Add "+(a+b));
	}

}
	
class tushar extends Hirerachical
{
	public void sub(int a, int b)
	{
		System.out.println("Sub "+(a-b));
	}
}

class Tushar2 extends Hirerachical
	{
	public void mult(int a, int b)
	{
		System.out.println("Multi "+(a*b));	
	}
}
class Tushar1 extends Hirerachical
{
	public void div()
	{
		System.out.println("Div");
	}

}