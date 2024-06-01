package p1;

import java.util.Scanner;

public class Employee
{
	private String name;
	private int age;
	private float salary;
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		
	}
	Employee(String name, int age, float salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	 void accept()
	{
		System.out.println("Enter Name ");
		this.name=sc.next();
		System.out.println("Enter Age ");
		this.age=sc.nextInt();
		System.out.println("Enter Salary ");
		this.salary=sc.nextFloat();
		
	}
	 void disp()
	{
		System.out.println("Name "+this.name+" Age "+this.age+" Salary "+this.salary);
	}
	
}



