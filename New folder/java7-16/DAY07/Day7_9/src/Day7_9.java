// If method names are different  
//to give a call to super class method we use 'this' keyword


//if method names are same (Function overriding)
//to give a call to super class method we use 'super' keyword 


// Inheritance

// same signature in different scope (Function Overriding )
//class Person  void disp()
//class Employee void disp() 

class Person // base class / super class / parent class 
{
	String name;
	int age;
	
	Person() // parameterless constructor  
	{
		this.name="DEFAULT";
		this.age=1;
		System.out.println("Inside Parameterless constructor of Person");
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}
}

class Employee extends Person // Employee derived/sub/child 
{
	int empid;
	int salary;
	Employee() // parameterless constructor  
	{
		this.empid=1;
		this.salary=50000;
		System.out.println("Inside Parameterless constructor of Employee");
		
	}
	
	void disp()
	{
		System.out.println("ID = "+this.empid+" Salary = "+this.salary);
		//this.disp(); //indefinite number of times (Recursive Call) 
		// disp(); ////indefinite number of times (Recursive Call) 
		//RULE: if we wish to give a call to super class overridden method
		//then we use super keyword explicitely
		// if we dont write super keyword then it will be recursive call
		
		super.disp();
		
	
	}
}




public class Day7_9 {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.disp();
	}
}


/*
public class Day7_8 {

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.dispPerson();

	}

}

*/
