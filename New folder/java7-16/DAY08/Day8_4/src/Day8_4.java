import java.util.Scanner;

// Inheritance Example 

class Person
{
	private String name;
	private int age;
	Scanner sc=new Scanner (System.in);
	
	public Person() 
	{
	}
	
	
	public Person(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
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
	
	void accept()
	{
		System.out.println("Enter Name ");
		this.name=sc.next();
		
		System.out.println("Enter Age  ");
		this.age=sc.nextInt();
		
	}
	void disp()
	{
	
		System.out.println(" Name = "+this.name+" Age = "+this.age);
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sc=" + sc + "]";
	}
	
	
	
}


class Employee extends Person
{
	private int empid;
	private int salary;
	
	
	public Employee() 
	{
		super(); // writing of super() is optional
	}
		
	public Employee(String name, int age,int empid,int salary) 
	{
		super(name,age); //valid 
		this.empid=empid;
		this.salary=salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void accept()
	{
		super.accept();
		System.out.println("Enter ID ");
		this.empid=sc.nextInt();
		
		System.out.println("Enter salary :");
		this.salary=sc.nextInt();
		
	}
	void disp()
	{
		super.disp(); 
		System.out.println("Empid = "+this.empid+" Salary "+this.salary);
		
	}

	@Override
	public String toString() 
	{
		
		return "Employee Record empid=" + empid + " salary=" + salary + " Name = "+this.getName()+" Age = "+this.getAge();
	}

	
	
	
	
}


public class Day8_4
{
	public static void main(String[] args)
	{
		Employee e[]=new Employee[3];
		for(int i=0;i<3;i++)
		{
			e[i]=new Employee();
		}
		for(int i=0;i<3;i++)
			e[i].accept();
		//for(int i=0;i<3;i++)
			//e[i].disp();
		
		
		for(Employee emp:e)
			System.out.println(emp); //toString()
		
	}
}


/*
public class Day8_4
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		//e1.disp();
		e1.accept();
		//e1.disp();
		System.out.println(e1);
		
	}

}

*/
