package Inheritance;

public class MethodOverRidingC extends MethodOverRiding
{
	
	public  void abcd()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		MethodOverRidingC obj= new MethodOverRidingC();
		obj.abcd();

	}

}
