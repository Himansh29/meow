import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Day13_3 {

	public static void main(String[] args) 
	{
		
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(101, "PG-DAC");
		m.put(102, "PG-DMC");
		m.put(202, "PG-DESD");
		m.put(104, "PG-DBDA");
		m.put(103, "precat"); 
		m.put(105, "precat");
		m.put(204, "core-java");
		
		Set<Integer> s=m.keySet();
		// s is a reference variable of type interface Set<Integer>
		// m.keyset() will link map entires to Set
		System.out.println("Map Keys are : ");
		for(Integer i:s)
			System.out.print(" "+i);
		
		System.out.println("\n Map Values are : ");
		Collection<String> str=m.values();
		for(String value:str)
			System.out.print(" "+value);
		
		System.out.println("\n"+m.containsKey(105));
		System.out.println("\n "+m.isEmpty());
		System.out.println("\n "+m.size());
		
			
		
		
		
	}

}
