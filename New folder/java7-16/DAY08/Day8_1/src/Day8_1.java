
// Inheritance Example 

class Person
{
	private String name;
	private int age;
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
public class Day8_1
{
	public static void main(String[] args)
	{
		//Person p1=new Person();
		//p1.disp();
		Employee emp=new Employee();
		emp.disp();
		
		emp.setName("Akshita");
		emp.setAge(34);
		emp.setEmpid(1);
		emp.setSalary(50000);
		
		//emp.disp();
		
		//System.out.println("Name = "+emp.getName());
		//System.out.println("Age = "+emp.getAge());
		//System.out.println(" ID = "+emp.getEmpid());
		//System.out.println(" Salary = "+emp.getSalary());
		
		System.out.println(emp); //toString() // hashcode 
		
		// we can give a call to super class methods
		// with the help of subclass object
		
		Person p=new Person();
		p.setAge(25); // allowed 
		p.setName("sunbeam"); // allowed 
		//p.setEmpId(123); // NOT ALLOWED 
		//p.setSalary(60000); // NOT ALLOWED 
		
		//we can not give a call to sub class methods with the 
		//help of super class object 
		
		
		
		
		
	}

}
