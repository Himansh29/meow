import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.io.BufferedOutputStream;

class Date implements Serializable
{
	

	private static final long serialVersionUID = 1L;
	int day;
	int month;
	int year;
	
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}

class Employee implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	int salary;
	Date joinDate=new Date(25,02,2022); // Association 
	
	Employee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", joinDate=" + joinDate + "]";
	}
	
	
}

public class Day15_7
{

	static Scanner sc=new Scanner(System.in);
	static final String PATH_NAME="File.dat";
	
	
	private static void readRecord() throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		try(ObjectInputStream is=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(PATH_NAME))));)
		{
			Employee e1 = (Employee)is.readObject();
			System.out.println(e1.toString());
			Employee e2 = (Employee)is.readObject();
			System.out.println(e2.toString());
		}
		
	}


	private static void writeRecord() throws Exception
	{
		try(ObjectOutputStream os=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(PATH_NAME))));)
		{
			Employee emp1=new Employee("Akshita",1,50000);
			os.writeObject(emp1);
			Employee emp2=new Employee("Sparsh",2,70000);
			os.writeObject(emp2);
		}
	}

	
	
	static int menuList()
	{
		System.out.println("Enter Choice : 0.Exit 1.Write 2.Read ");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) 
	{
		int choice;
		while((choice=menuList())!=0)
		{
			try
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
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}


	
}
