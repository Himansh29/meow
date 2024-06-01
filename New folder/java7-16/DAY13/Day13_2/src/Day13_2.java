import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;




public class Day13_2
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(101, "PG-DAC");
		m.put(102, "PG-DMC");
		m.put(202, "PG-DESD");
		m.put(104, "PG-DBDA");
		m.put(103, "precat"); // if you assign same key to two values
		// it will overwrite the values 
		
		m.put(105, "precat");
		m.put(204, "core java");
		System.out.println(m);
		

	}

}



/*
public class Day13_2
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m=new Hashtable<>();
		m.put(101, "PG-DAC");
		m.put(102, "PG-DMC");
		m.put(202, "PG-DESD");
		m.put(104, "PG-DBDA");
		m.put(103, "precat"); // if you assign same key to two values
		// it will overwrite the values 
		
		m.put(105, "precat");
		m.put(204, "core java");
		System.out.println(m);
		

	}

}
*/
