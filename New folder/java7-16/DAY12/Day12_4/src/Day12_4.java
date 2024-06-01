import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;




public class Day12_4 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Sunbeam");
		a1.add("Infotech");
		a1.add("Akshita");
		a1.add("Technical Trainer");
		
		//for each element inside ArrayList please print the data
		
		for(String ele : a1)
			System.out.println(ele);
		
		System.out.println("Get Class = "+a1.getClass());
		
		//converting arraylist in normal string array
		// use toArray() method 
		
		
		//<T> T[]	toArray(T[] a)
		
		String[] array = a1.toArray(new String[a1.size()]);
		//String[] array = a1.toArray(new String[4]);
		
		
		System.out.println("Array Elements are ");
		for(String str:array)
			System.out.println(str);
		
		System.out.println("Array Get Class " +array.getClass());
		
		
	}
}

/*
public class Day12_4 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Sunbeam");
		a1.add("Infotech");
		a1.add("Akshita");
		a1.add("Technical Trainer");
		
		//for each element inside ArrayList please print the data
		
		for(String ele : a1)
			System.out.println(ele);
		
		if(a1.contains("Akshita"))
			System.out.println("Element is present");
		else
			System.out.println("Element is not present");
		
	}
}

*/

/*
public class Day12_4 
{

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sunbeam");
		list.add("Pune");
		list.add("karad");
		list.add("Akshita");
		System.out.println(list);
		list.addFirst("Infotech");
		System.out.println(list);
		list.add(5," Chanchlani");
		System.out.println(list);
		list.addLast("Trainer");
		System.out.println(list);
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("PG-DAC");
		a1.add("PG-DMC");
		a1.add("PG-DBDA");
		a1.add("PG-DESD");
		System.out.println("Array List = "+a1);
		
		list.addAll(a1);
		//System.out.println("Linked List "+list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.print(" "+itr.next());
		System.out.println("Removing element from list ");
		list.remove(0);
		//System.out.println(list);
		
		
		
	}

}


*/