package Inheritance;

public class workDemo {
	public static void main(String []arg)
	{
		Manager manager=new Manager("Tushar", 22, 777985735, "Balaji nagar", 25000,"Mechanical");
		manager.displaySalary(15000);
		manager.display();
		Employee employee=new Employee("Quality Engineer","Rajendra" , 25, 86260722,
												"Pune", 20000,"Jr Java Devlaper" );
		employee.display1();
	
	}

}
