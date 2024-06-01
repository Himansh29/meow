
//super 
// 1. super is used to give a call to overrridden method of super class
// 2. super is used to give a call to super class constructor
//3. super class parameterless constructor is called automatically via sub class parameterless constructor
// so writting of super() is optional in derived class constructor
//4. super class parameterized constructor is called
//with the help of super(list of parameters)
//inside sub class parameterized constructor
// super() statement must be the first statement in the method



// Inheritance Example 

class Person
{
	private String name;
	private int age;
	
	public Person() 
	{
		System.out.println("Inside Person class  Parameterless constructor");
	}
	
	
	public Person(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
		System.out.println("Inside Person class paramatrized constructor");
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
	
	void disp()
	{
	
		System.out.println(" Name = "+this.name+" Age = "+this.age);
		
	}
	
}


class Employee extends Person
{
	private int empid;
	private int salary;
	
	
	public Employee() 
	{
		super();
		System.out.println("Inside Employee class Parameterless constructor");

	}
		
	public Employee(String name, int age,int empid,int salary) 
	{
		super(name,age); //valid 
		System.out.println("Inside Employee class paramatrized constructor");
		
		this.empid=empid;
		this.salary=salary;
		//super(name,age); // Error : constructor call must be first statement into the constructor
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
	
	void disp()
	{
		
		System.out.println("Empid = "+this.empid+" Salary "+this.salary);
		super.disp(); 
	}
	
}
public class Day8_3
{
	public static void main(String[] args)
	{
		//Employee e1=new Employee(); 
		//e1.disp();
		
		Employee e2=new Employee("Akshita",34,123,60000);
		e2.disp();
		
		System.out.println(e2.getEmpid());
		System.out.println(e2.getSalary());
	}

}
