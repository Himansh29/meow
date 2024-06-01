import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;



public class Day12_9 {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new ArrayDeque<Integer>(); // UPCASTING
		
		//ArrayDeque<Integer> a1=new ArrayDeque<Integer>(); // VALID 
		q.offer(11);
		q.offer(22);
		q.offer(33);
		q.offer(44);
		
		
		Integer ele=null;
		while(!q.isEmpty())
		{
			ele=q.peek();
			System.out.print(" "+ele);
			q.poll();
			
		}
		System.out.println("\n After Removing all the elements"+ q);
		//q.poll(); // No Exception will be thrown
		
		System.out.println(q.peek()); //null as a special value 
	}

}


/*

public class Day12_9 {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new ArrayDeque<Integer>(); // UPCASTING
		
		//ArrayDeque<Integer> a1=new ArrayDeque<Integer>(); // VALID 
		q.add(11);
		q.add(22);
		q.add(33);
		q.add(44);
		
		//System.out.println(q);
		
		//Iterator<Integer> itr = q.iterator();
		//while(itr.hasNext())
			//System.out.print(" "+itr.next());
		
		Integer ele=null;
		while(!q.isEmpty())
		{
			ele=q.element();
			System.out.print(" "+ele);
			q.remove();
			
		}
		System.out.println("\n After Removing all the elements"+ q);
		//q.remove();
		//System.out.println(q.element());
	}

}

*/


/*
public class Day12_9 {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new ArrayDeque<Integer>(); // UPCASTING
		
		//ArrayDeque<Integer> a1=new ArrayDeque<Integer>(); // VALID 
		q.add(11);
		q.add(22);
		q.add(33);
		q.add(44);
		
		//System.out.println(q);
		
		//Iterator<Integer> itr = q.iterator();
		//while(itr.hasNext())
			//System.out.print(" "+itr.next());
		
		Integer ele=null;
		while(!q.isEmpty())
		{
			ele=q.element();
			System.out.print(" "+ele);
			q.remove();
			
		}
	}

}

*/
