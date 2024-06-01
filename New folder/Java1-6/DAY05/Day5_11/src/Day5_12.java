
class Employee
{
	String name;
	int id;
	int salary;
	public Employee() 
	{
		
	}
	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}


//Array of references
public class Day5_12 
{

	public static void main(String[] args) 
	{
		Employee e[]=new Employee[5];
		//e[] indicates array of  reference variable
		e[0]=new Employee("p1",1,40000);
		e[1]=new Employee("p2",2,50000);
		e[2]=new Employee("p3",3,60000);
		e[3]=new Employee("p4",4,70000);
		e[4]=new Employee("p5",5,80000);
		
		System.out.println("Displaying the data inside objects using for loop");
		for(int i=0;i<5;i++)
		{
			System.out.println("Name = "+e[i].name+" ID = "+e[i].id+ " Salary = "+e[i].salary);
			
		}
		
		
		System.out.println("\n Displaying the data inside objects using for each loop");
		for(Employee emp:e)
			System.out.println(emp); // toString() 
		
		//emp=e[0]  emp=e[1]  emp=e[2] emp=e[3] emp=e[4] 
	}
}




/*

public class Day5_12 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Akshita",1,50000);
		System.out.println(e1);
		Employee e2=new Employee("p1",2,60000);
		System.out.println(e2);

	}

}

*/
