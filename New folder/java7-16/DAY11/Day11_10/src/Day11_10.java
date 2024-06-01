import java.util.LinkedList;

public class Day11_10 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println("Initial linked list "+l1);
		l1.addFirst(50);
		System.out.println("after adding first  "+l1);
		l1.addLast(99);
		System.out.println("after adding last  "+l1);
	}

}
