package p1;
public class Day4_7 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.disp();
		
		Employee e2=new Employee("Akshita",34,50000);
		e2.disp();
		System.out.println("E2 employee name = "+e2.getName());
		
		Employee e3=new Employee();
		e3.accept();
		e3.disp();
		
		Student s1=new Student();
		System.out.println(s1);
		
		

	}

}
