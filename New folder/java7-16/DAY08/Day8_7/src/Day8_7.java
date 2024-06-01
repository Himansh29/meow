class Person
{
	private String name;
	private int age;
	
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
	
	void disp()
	{
		
		System.out.println("Empid = "+this.empid+" Salary "+this.salary);
		super.disp(); 
	} 
	
}
public class Day8_7
{
	public static void main(String[] args)
	{
		//Person p=new Person(); 
		Person p=new Employee();  //UPCASTING 
		// DOWNCASTING
		Employee emp=(Employee) p;   // ClassCastException
		emp.disp();
	}
}




/*
class Person
{
	private String name;
	private int age;
	
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
	
	void disp()
	{
		
		System.out.println("Empid = "+this.empid+" Salary "+this.salary);
		super.disp(); 
	} 
	
}
public class Day8_7
{
	public static void main(String[] args)
	{
		
		Person p=new Employee("Akshita",34,123,50000); // upcasting
		//System.out.println(p.getName());
		//System.out.println(p.getAge());
		//p.disp(); //calling subclass disp() method
		//with super class reference variable
		// dynamic method dispatch
		//C++ ==> LATE BINDING 
		
		// DOWNCASTING
		Employee emp=(Employee) p; // parent class reference is stored in child class reference 
		System.out.println("ID ="+emp.getEmpid());
		System.out.println("Salary "+emp.getSalary());
		emp.disp();
		
		
	}

}


*/
