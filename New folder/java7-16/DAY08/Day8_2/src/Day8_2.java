  
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
		super(); //optional to write
		System.out.println("Inside Employee class Parameterless constructor");

	}
		
	public Employee(String name, int age,int empid,int salary) 
	{
		super(name,age);
		this.empid=empid;
		this.salary=salary;
		System.out.println("Inside Employee class paramatrized constructor");
		
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
		super.disp(); 
		System.out.println("Empid = "+this.empid+" Salary "+this.salary);
		
	}
	
}
public class Day8_2
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
