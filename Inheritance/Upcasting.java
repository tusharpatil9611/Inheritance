package Inheritance;

public class Upcasting
{
	
	public void mult(int a,int b)
	{
		System.out.println("Muliploication is="+(a*b));
	}
	public void div(int a,int b)
	{
		System.out.println("Division is="+(a/b));
	}
	public void abcd()
	{
		System.out.println("Parents class ");
	}
}
class cast extends Upcasting
	{
		public void add(int a, int b)
		{
		System.out.println("Addition is= "+(a+b));	
		}
		public void sub(int a, int b)
		{
		System.out.println("Substraction is ="+(a-b));	
		}
		public void abcd()
		{
			System.out.println("Child");
		}
	}


