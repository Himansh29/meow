package p1;

public class Student 
{
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) 
	{
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	void disp()
	{
		System.out.println("Rollno = "+rollno+ "Name = "+name+" Age = "+age);
	}
	
	

}
