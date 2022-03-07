package Inheritance;

public class Multileval 
{
	
	public void add(int a, int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println("Sub is "+(a-b));
	}
}
    class child extends Multileval
 {
	public void mult(int a, int b)
	{
		System.out.println("Multilpication is "+(a*b));
	}
 }
	class child1 extends child
	{
		public void div(int a, int b)
		{
			System.out.println("Division is ="+(a/b));
		}
	}
	class child2 extends child1
	{
		public void mod(int a, int b)
		{
			System.out.println("The mod is "+(a%b));
		}
		public static void main(String[] args) {
			child2 c2=new child2();
			c2.add(10, 5);
			c2.mod(101, 8);
			c2.sub(25, 10);

		}

	}
