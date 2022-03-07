package Inheritance;

public class hybrid 
{
	public void add(int a, int b)
	{
		System.out.println("add" +(a+b));
	}
}
  class A extends hybrid
 {
	public void sub(int a, int b)
	{
		System.out.println("Sub "+(a-b));
	}
 }
  class B extends hybrid
  {
	  public void multi(int a,int b)
	  {
		  System.out.println("Multi "+(a*b));
	  }
  }
 class C extends  B 
 {
	 public void div(int a, int b)
	 {
		 System.out.println("div "+(a/b));
	 }
	
 }
 
