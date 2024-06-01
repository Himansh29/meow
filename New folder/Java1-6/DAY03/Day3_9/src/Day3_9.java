
class Student
{
	int id;
	int rollno;
	String name;
	String dept;
	int age;
	public Student() 
	{
		this(1,123,"Akshita","Training",35); // Constructor chaining 
	}
	public Student(int id, int rollno, String name, String dept, int age) {
		
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// concerete methods / instance methods 
	void disp()
	{
		System.out.println("ID "+this.id+ " Rollno :"+this.rollno+" Age : "+this.age);
		System.out.println("Name "+this.name+" Dept : "+this.dept);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}


public class Day3_9 {

	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println(s1); //s1.toString() 
		
		

	}

}




/*

public class Day3_9 {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.disp();
		System.out.println(s1); // toString() ==> hashcode 
		

	}

}
*/