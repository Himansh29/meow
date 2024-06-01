import java.util.Scanner;

class Employee
{
	String name;
	int id;
	int age;
	float salary;
	String dept;
	
	Scanner sc=new Scanner(System.in);
	
	Employee() // user defined parameterless constructor ( user defined default constructor)
	{
		this.name="DEFAULT";
		this.id=1;
		this.age=1;
		this.salary=40000;
		this.dept="DEFAULT";
	}
	
	void accept()
	{
		System.out.println("Enter Name : ");
		this.name=sc.next();
		System.out.println("Enter ID :");
		this.id=sc.nextInt();
		
		System.out.println("Enter Age :");
		this.age=sc.nextInt();
		System.out.println("Enter Salary : ");
		this.salary = sc.nextFloat();
		System.out.println("Enter Department : ");
		this.dept=sc.next();
	
	}
	void disp()
	{
		System.out.println("Name = "+this.name+" ID : "+this.id+" Department :"+this.dept);
		System.out.println("Salary = "+this.salary+" Age : "+this.age);
		
		
	}
	
}

public class Day3_4 
{

	public static void main(String[] args) 
	{
		// since we are having one parameterless constructor in the program
		// so it will give a call to parameterless constructor 
		
		Employee e1=new Employee(); // call to parameterless constructor 
		// OR user defined default constructor 
		e1.disp(); // disp() is called upon e1 object
		// e1 object address will be holded by this keyword
		// 'this' keyword is used to hold the current object address 
		
		e1.accept();
		e1.disp();
		System.out.println(e1);
	
	}
}


/*
public class Day3_4 {

	public static void main(String[] args) 
	{
		// since we are not having any constructor in the class
		 // thatswhy compiler will give a call to default constructor 
		  
		Employee e1=new Employee(); // null 0 null 0.0 0 
		// Object will get allocated 
		// with some default values in this case
		// Initializing the Object with default values 
		// DEFAULT CONSTRUCTOR 
		e1.disp();
		System.out.println(e1);
		
	}
}
*/






/*

public class Day3_4 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.accept();
		
		Employee e2=new Employee();
		e2.accept();
		e1.disp();
		e2.disp();
		
		System.out.println(e1);  // Employee@75bd9247
		System.out.println(e2); //Employee@7d417077
		
		// whenever we display any object
		// it internally gives a call to toString()  from Object class
		
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		Employee e3=e1;
		System.out.println(e3); // Employee@75bd9247
		e3.disp(); // same data as e1 
	

	}

}


*/