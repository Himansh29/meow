import java.util.ArrayList;

public class Day11_8
{

	private static void printList(ArrayList<?> list) // unbounded wild card 
	{
		for(Object o:list)
			System.out.print(" "+o);
	}
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		System.out.println("\n Printing Integer ArrayList");
		Day11_8.printList(a1);
		
		
		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(11.5);
		a2.add(22.5);
		a2.add(33.5);
		System.out.println("\n Printing Double ArrayList");
		Day11_8.printList(a2);
		
				
		ArrayList<String> d1=new ArrayList<String>();
		d1.add("abc");
		d1.add("def");
		d1.add("efg");
		System.out.println("\n Printing String ArrayList ");
		Day11_8.printList(d1);
		
		
		
	
	}


	
}

/*
public class Day11_8
{

	public static void printIntData(ArrayList<Integer> list)
	{
		for(Integer i:list)
			System.out.print(" " +i);
		
	}
	
	public static void printDoubleData(ArrayList<Double> list)
	{
		for(Double i:list)
			System.out.println(" " +i);
		
	}
	public static void printStrData(ArrayList<String> list) 
	{
		
		for(String str:list)
			System.out.print(" "+str);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		Day11_8.printIntData(a1);
		
		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(11.5);
		a2.add(22.5);
		a2.add(33.5);
		Day11_8.printDoubleData(a2);
		
				
		ArrayList<String> d1=new ArrayList<String>();
		d1.add("abc");
		d1.add("def");
		d1.add("efg");
		Day11_8.printStrData(d1);
		
		
		
	
	}


	
}
	
	
	*/
