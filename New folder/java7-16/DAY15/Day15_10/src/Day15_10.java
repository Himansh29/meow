import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Day15_10 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		int a=123;
		
		Integer b=new Integer(123);
		System.out.println(a);
		System.out.println(b);
	}
	
}




/*
public class Day15_10 
{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add("akshita");
		
		
		LinkedList l1=new LinkedList();
		l1.add("PG-DAC");
		
		
		

	}

}

*/


/*

//Demo is having by default its super class as Object
// Object ==> toString() ==> implementation details ==> hashcode 

//inside Demo class
//we have overridden toString() ==> we want to add some additional functionality



class Demo
{
	int num1;
	int num2;
	Scanner sc=new Scanner(System.in);
	public Demo()
	{
		
	}
	@Override
	public String toString() {
		return "Demo [num1=" + num1 + ", num2=" + num2 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(num1, num2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return num1 == other.num1 && num2 == other.num2;
	}
	
	@Override // is not allowed because Super class Object is not having accept() 
	void accept()
	{
		System.out.println("Enter Num1 ");
		this.num1 = sc.nextInt();
		System.out.println("Enter Num2 ");
		this.num2 = sc.nextInt();
		
	}
	
	
}
public class Day15_10 {

	public static void main(String[] args)
	{
		

	}

}

*/
