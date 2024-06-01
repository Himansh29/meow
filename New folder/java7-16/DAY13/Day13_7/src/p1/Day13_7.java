package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Day13_7 {

	public static void main(String[] args) 
	{
		//ArrayList<Student> a1=new ArrayList<Student>();
		// Student s1=new Student(1,"Akshita",34");
		// a1.add(s1);
		
		ArrayList a1=new ArrayList();
		a1.add(new Student(1,"Akshita",34));
		a1.add(new Student(2,"ABC",25));
		a1.add(new Student(3,"PQR",45));
		a1.add(new Student(4,"DEF",35));
		
		//System.out.println(a1);
		
		System.out.println(a1); // toString() 
		
		//a1.get(i).disp();
		
		//	sort(List<T> list, Comparator<? super T> c)
		System.out.println("Sorting based on Name ");
		Collections.sort(a1,new NameComparator());
		System.out.println(a1);
		
		
		System.out.println("Sorting based on Age ");
		Collections.sort(a1,new AgeComparator());
		System.out.println(a1);
		

	}

}
