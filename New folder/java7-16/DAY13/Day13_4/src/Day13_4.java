import java.util.LinkedHashSet;
import java.util.Objects;

// LinkedHashSet of Employee Class 

class Employee
{
	private String name;
	private int id;
	public Employee() 
	{
		
	}
	public Employee(String name, int id) 
	{
		
		this.name = name;
		this.id = id;
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	//e1.equals(e3) // e3==> obj  e1 ==> this 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
		
	
}


public class Day13_4
{

	public static void main(String[] args) 
	{
		
		LinkedHashSet<Employee> lhs=new LinkedHashSet<Employee>();
		Employee e1=new Employee("Akshita",1);
		Employee e2=new Employee("Sparsh",2);
		lhs.add(e1);
		lhs.add(e2);
		
		for(Employee e:lhs)
			System.out.println(e);
		
		Employee e3=e2;
		System.out.println(e3);
		
		System.out.println("HashCode e1 = "+e1.hashCode());
		System.out.println("Hashcode e2 = "+e2.hashCode());
		System.out.println("Hashcode e3 = "+e3.hashCode());
		
		System.out.println("e1 and e3  : "+e1.equals(e3));
		System.out.println("e2 and e3  : "+e2.equals(e3));
		System.out.println("e2 and e3  : "+(e2==e3));
		
		
	}

}
