package Inheritance;

public class Test1 {
	int num1;
	int num2;
	public void test(int num1,int num2)
	{
		System.out.println(num1+" "+num2);
	}

}
class Test2 extends Test1
{
	int num3;
	public void test2(int num3,int num1,int num2)
	{
		System.out.println(" "+num3);
	}
	
}