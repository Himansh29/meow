import java.util.Scanner;

//we can not access private fields of class outside its scope
// So if we wish to access private fields of class in a indirect way
// so we write getter and setters
// getters and setters are the methods defined inside the class
// getters/ setters can be called based on object name 

class Employee
{
	private String name;
	private int id;
	private float salary;
	
	public Employee() 
	{
		
	}

	public Employee(String name, int id, float salary) 
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//getters 
	String getName()
	{
		return this.name;
	}
	int getID()
	{
		return this.id;
	}
	float getSalary()
	{
		return this.salary;
	}
	
	//setters
	void setName(String name)
	{
		this.name=name;
	}
	
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	void disp()
	{
		System.out.println("Name "+this.name+" ID "+this.id+" Salary "+this.salary);
	}
}


public class Day3_8 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		//Employee e1=new Employee();
		//e1.disp();
		
		//Employee e2=new Employee("Akshita",1,50000);
		//e2.disp();
		
		// e2.salary=70000; // NOT ALLOWED (Private)
		//e2.setSalary(70000);
		//e2.disp();
		
		//Employee e3=new Employee("P1",2,40000);
		//e3.disp();
		//System.out.println("Enter salary to be modified for e3 employee");
		//float newsal=sc.nextFloat();
		//e3.setSalary(newsal);
		//e3.disp();
		
		
		Employee e4=new Employee("Akshita",1,650000);
		System.out.println(e4.getName()); //call to getter 
		e4.setName("AkshitaChanchlani"); // call to setter
		System.out.println(e4.getName());  // call to getter 
		
		
		
		
		
		
		

	}

}
