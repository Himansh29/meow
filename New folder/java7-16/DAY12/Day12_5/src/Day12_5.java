import java.util.Stack;


public class Day12_5 {

	public static void main(String[] args) 
	{
		Stack stk=new Stack(); // RAW TYPE 
		
		System.out.println("Initial Stack "+stk);
		System.out.println("Is Empty ? "+stk.isEmpty());
		stk.push('A');
		stk.push('B');
		stk.push('C');
		stk.push(20);
		
		//System.out.println(stk); // stk.toString()
		
		for(Object o:stk)
			System.out.print("  "+o);
	}
}


/*
public class Day12_5 {

	public static void main(String[] args) 
	{
		Stack<Character> stk=new Stack<Character>();
		
		System.out.println("Initial Stack "+stk);
		System.out.println("Is Empty ? "+stk.isEmpty());
		stk.push('A');
		stk.push('B');
		stk.push('C');
		System.out.println(stk);
	}
}

*/


/*
public class Day12_5 {

	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack<Integer>();
		
		System.out.println("Initial Stack "+stk);
		System.out.println("Is Empty ? "+stk.isEmpty());
		stk.push(10);
		stk.push(20);
		stk.push(30);
		System.out.println("Contents inside Stack = "+stk);
		System.out.println("Is Empty ? "+stk.isEmpty());
		stk.pop();
		
		System.out.println("Contents inside Stack = "+stk);
		System.out.println("Search = "+stk.search(20));
		System.out.println(stk.getClass());
		stk.push(30);
		stk.push(40);
		stk.push(50);
		stk.push(60);
		System.out.println(stk);
		System.out.println("Search = "+stk.search(50));
		System.out.println("Search = "+stk.search(30));
		//search() returns the location of element from top position
		// and starts counting from 1 
		//Returns the 1-based position where an object is on this stack.

	}

}

*/
