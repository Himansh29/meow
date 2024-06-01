import java.util.Scanner;


// In Employee class
// we have defined two constructors
// Constructor Overloading 


class Employee
{
	String name;
	int id;
	int age;
	float salary;
	String dept;
	
	Scanner sc=new Scanner(System.in); // sc is reference object of Scanner class
	
	
	Employee() // user defined parameterless constructor ( user defined default constructor)
	{
		this.name="DEFAULT";
		this.id=1;
		this.age=1;
		this.salary=40000;
		this.dept="DEFAULT";
	}
	
	Employee(String name,int id,int age,float salary,String dept)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.dept=dept;
			
		
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

public class Day3_5 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(); // parameterless constructor called
		e1.disp(); // disp() is called upon e1 object 
		Employee e2=new Employee("Akshita",1,35,50000,"Training");
		// e2 object is created by passing some values/parameters 
		
		e2.disp();// disp() is called upon e2 object 
		
		Employee e3=e2;
		e3.disp();
		
		Employee e4=new Employee("abc",2,34,677765,"placement");
		
		e4.disp();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		
		
		
		
	}
}
