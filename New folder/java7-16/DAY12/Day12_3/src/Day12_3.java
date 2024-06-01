import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


// Ask from user how many students record you wish to insert in LL / AL
//take input from user in varible n 
// iterate the for loop till n

class Student
{
	int rollno;
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	
	Student()
	{
		
	}
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	void accept()
	{
		System.out.println("Enter Rollno : ");
		this.rollno=sc.nextInt();
		System.out.println("Enter Name : ");
		this.name=sc.next();
		System.out.println("Enter Age : ");
		this.age=sc.nextInt();
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Rollno = "+this.rollno+" Age = "+this.age);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	
}

public class Day12_3{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.accept();
		s2.accept();
		s3.accept();
		
		LinkedList<Student> l1=new LinkedList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		for(Student s:l1)
			s.disp();
		
		
		
	}

}
