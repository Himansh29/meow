import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class Day12_8 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		//System.out.println(vec);
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
		{
			System.out.print(" "+e.nextElement());
			vec.add(55); // Fail-safe 
		}
		
		System.out.println(vec);
		
		
		

	}

}



/*
public class Day12_8 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		
		//System.out.println(vec);
		
		Iterator<Integer> itr=vec.iterator();
		while(itr.hasNext())
		{
			System.out.print("  "+itr.next());
			vec.add(65); // Exception java.util.ConcurrentModificationException
			// Fail-Fast Iterator 
			
		}
		
		

	}

}

*/