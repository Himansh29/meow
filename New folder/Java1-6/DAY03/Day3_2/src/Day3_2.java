import java.util.Scanner;

// class Employee
// name, id, salary 

// package level visibility 

class Employee
{
	String name;
	int id;
	float salary;
	Scanner sc=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter ID :");
		id=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary = sc.nextFloat();
	
	}
	void disp()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Salary = "+salary);
		
	}
}


public class Day3_2 {

	public static void main(String[] args) 
	{
		// Object / Instance
		Employee emp=new Employee(); // instance / object of class Employee
		emp.accept(); // accept() method is called upon emp object
		emp.disp(); // disp() is called upon emp object
		
		Employee e2=new Employee();
		e2.disp();// null 0 0.0 
		
		

	}

}
