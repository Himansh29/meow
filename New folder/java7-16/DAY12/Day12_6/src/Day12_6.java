import java.util.Vector;


public class Day12_6 {

	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>(5,5);
		System.out.println("Size = "+vec.size());
		System.out.println("Empty ?? "+vec.isEmpty());
		System.out.println("Capacity = "+vec.capacity());
		vec.add("Sunbeam");
		vec.add("Infotech");
		vec.add("Pune");
		vec.add("Karad");
		vec.add("Akshita");
		vec.add("PG-DAC");
		System.out.println(vec);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add("PG-DMC");
		vec.add("PG-DBDA");
		vec.add("PG-DESD");
		vec.add("PreCAT");
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add("Core Java Modular");
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add("Trainer");
		vec.add("Python");
		vec.add("Technical");
		vec.add("abc");
		vec.add("def");
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
	}
}




/*
public class Day12_6 {

	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>();
		System.out.println("Size = "+vec.size());
		System.out.println("Empty ?? "+vec.isEmpty());
		System.out.println("Capacity = "+vec.capacity());
		vec.add("Sunbeam");
		vec.add("Infotech");
		vec.add("Pune");
		vec.add("Karad");
		vec.add("Akshita");
		vec.add("PG-DAC");
		System.out.println(vec);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add("PG-DMC");
		vec.add("PG-DBDA");
		vec.add("PG-DESD");
		vec.add("PreCAT");
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add("Core Java Modular");
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
	}
}

*/


/*
public class Day12_6 {

	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>();
		System.out.println("Size = "+vec.size());
		System.out.println("Empty ?? "+vec.isEmpty());
		System.out.println("Capacity = "+vec.capacity());
		
		Vector<Integer> v1=new Vector<Integer>(20,5); 
		
		System.out.println("Size = "+v1.size());
		System.out.println("Empty ?? "+v1.isEmpty());
		System.out.println("Capacity = "+v1.capacity());
	}

}

*/
