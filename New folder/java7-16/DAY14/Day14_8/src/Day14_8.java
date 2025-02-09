import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class Employee implements Serializable 
{
	String name;
	int age;
	float salary;
	
	public Employee(String name, int age, float salary) 
	{


		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}



public class Day14_8 
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.dat";
	
	
	
	private static void readRecord() throws IOException, ClassNotFoundException
	{
		
		try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(PATH_NAME))));)
		{
			
			
			Employee e = (Employee)ois.readObject();
			System.out.println(e);
			
			
			
		}
		
	}


	private static void writeRecord() throws IOException 
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(PATH_NAME))));)
		{
			Employee emp=new Employee("Akshita",34,60000);
			oos.writeObject(emp);
			System.out.println("File Write Operation done successfully");
			
		}
		
			
		
	}
	
	
	private static int menuList()
	{
		System.out.println("Enter Choice : ");
		System.out.println("0.Exit 1.Write 2. Read ");
		return sc.nextInt();
		
	}
	

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		int choice;
		while((choice=menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				writeRecord();
			break;
			case 2:
				readRecord();
			break;
			}
		}
		

	}


	

}
