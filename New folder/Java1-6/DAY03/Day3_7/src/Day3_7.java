import java.util.Scanner;




class Employee
{
	private String name;
	private int id;
	private int age;
	private float salary;
	private String dept;
	
	Scanner sc=new Scanner(System.in); // sc is reference object of Scanner class
	
	
	Employee() // user defined parameterless constructor ( user defined default constructor)
	{
		//this.name="DEFAULT";
		//this.id=1;
		//this.age=1;
		//this.salary=40000;
		//this.dept="DEFAULT";
		
		
		this("DEFAULT",1,1,40000,"DEFAULT"); // Constructor Chaining 
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

public class Day3_7 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.accept();
		Employee e2=new Employee("AKSHITA",1,30,50000,"TRAINING");
		
		e1.disp();
		e2.disp(); 
		//e2.salary=e1.salary; // not allowed (private)
		// e1.salary = 70000; // not allowed (private)
	
		
		
		
	}
}
