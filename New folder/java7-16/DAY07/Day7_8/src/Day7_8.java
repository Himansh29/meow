// Inheritance

//class Person 
// class Employee
// Employee is-a Person

// In case of inheritance base class parameterless constructor is called 
//automatically from the derived class 


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
	
	void dispPerson()
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
	
	void dispEmp()
	{
		System.out.println("ID = "+this.empid+" Salary = "+this.salary);
		// call super class method , we use this keyword
		this.dispPerson();
	}
}




public class Day7_8 {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.dispEmp();
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
