package Inheritance;

public class Cal2 extends cal
{
	Cal2()
	{
		System.out.println("Hi from Cal2 ");
	}
	public void mult(int a,int b)
	{
		System.out.println("Muliploication is="+(a*b));
	}
	public void div(int a,int b)
	{
		System.out.println("Division is="+(a/b));
	}
	
	
	
	
	
	public static void main(String[] args) {
		Cal2 c=new Cal2();
		System.out.println("Start Execution of the method");
		
		c.add(12, 10);
		c.sub(45,25);
		c.mult(74,6);
		c.div(74, 9);

	}

}
