package Inheritance;
public class Worker 
{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	public Worker(String name, int age, int phone, String address, int salary)
	{
		//super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}
	public void displaySalary(int salary)
	{
		System.out.println("Salary of the Employee is "+salary);
	}
}
class Employee extends Worker
{ 
	String workSpecilization;
	public Employee(String workSpecilization ,String name, int age, int phone, String address, int salary,String workSpecilization1) 
	{
		super(name, age, phone, address, salary);
		this.workSpecilization=workSpecilization1;
	}
	public void display1()
	{
		System.out.println("Employee Details as per Requirments");
		System.out.println("Name of Employee is  "+name+"\nAge of employee "+age+"\nContact no is "+phone+"\nAddress is "+address+"\nSalary is "+salary+"\nWork Specilization "+workSpecilization);
	}
}
class Manager extends Worker
{
	String department;
	public Manager(String name, int age, int phone, String address, int salary,String department)
	{
		super(name, age, phone, address, salary);
		this.department=department;
	}
	public void display()
	{
		System.out.println("Manager Details ");
		System.out.println("Employee name is "+name+"\nAge is "+age+"\ncontact no "+phone+"\naddress is "+address+"\nSalary "+salary+"\nDepartemnt "+department);
	}
}
