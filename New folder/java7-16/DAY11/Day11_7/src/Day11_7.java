import java.util.ArrayList;
import java.util.Iterator;




public class Day11_7 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		
		int[] data= {10,20,30,40,50,60,70,80,90};
		
		for(int i : data)
			a1.add(i);
		System.out.println("A1 ="+a1);
		
		System.out.println(a1.contains(80));
		System.out.println(a1.contains(180));
		
	}
}

/*
public class Day11_7 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = a2;
		
		int[] data= {10,20,30,40,50,60,70,80,90};
		
		for(int i : data)
			a1.add(i);
		System.out.println("A1 ="+a1);
		
		a2.addAll(a1);
		System.out.println("A2 ="+a2);
		
		System.out.println("A3 ="+a3);
		
		System.out.println("A1 hascode ="+a1.hashCode());
		System.out.println("A2 hashcode ="+a2.hashCode());
		System.out.println("A3 hashcode ="+a3.hashCode());
		
		a2.remove(3);
		System.out.println("A2 after removing element="+a2);
		
		System.out.println("A3 after removing element="+a3);
		
		System.out.println("A1 hascode ="+a1.hashCode());
		System.out.println("A2 hashcode ="+a2.hashCode());
		System.out.println("A3 hashcode ="+a3.hashCode());
		
		
	}
}
*/


/*
public class Day11_7 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("size = "+list.size());
		int[] data= {10,20,30,40,50,60,70,80,90};
			
		for(int i : data)
			list.add(i);
		
		System.out.println("Initial List Element : "+list);
		list.add(0,55);
		System.out.println("Added one element at index 0"+list);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.addAll(list);
		System.out.println("newly created AL "+a2);
		list.remove(3);
		System.out.print("Removed element from list "+list);
		System.out.println();
		System.out.print("newly created AL Elements "+a2);
		// Not synchronized 
		

		
	}
}

*/