import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Day12_10 {

	public static void main(String[] args)
	{
		TreeSet<Integer> s=new TreeSet<Integer>(); // UPCASTING 
		s.add(30);
		s.add(12);
		s.add(55);
		s.add(99);
		s.add(85);
		s.add(55); // duplicate entry is not allowed 
		//System.out.println(s);

		for(Integer ele:s)
			System.out.print(" "+ele); // DATA IS PRESENTED IN SORTED ORDER
	}

}




/*
public class Day12_10 {

	public static void main(String[] args)
	{
		Set<Integer> s=new TreeSet<Integer>(); // UPCASTING 
		s.add(30);
		s.add(12);
		s.add(55);
		s.add(99);
		s.add(85);
		s.add(55); // duplicate entry is not allowed 
		//System.out.println(s);

		for(Integer ele:s)
			System.out.print(" "+ele); // DATA IS PRESENTED IN SORTED ORDER
	}

}
*/



/*
public class Day12_10 {

	public static void main(String[] args)
	{
		Set<Integer> s=new HashSet<Integer>(); // UPCASTING
		s.add(30);
		s.add(12);
		s.add(55);
		s.add(99);
		s.add(85);
		s.add(55); // duplicate entry is not allowed 
		//System.out.println(s);

		for(Integer ele:s)
			System.out.print(" "+ele);
	}

}
*/