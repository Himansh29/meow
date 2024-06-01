import java.util.ArrayList;
import java.util.Collections;

public class Day11_9 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>(); 
		a1.add(11);
		a1.add(4);
		a1.add(40);
		a1.add(21);
		a1.add(88);
		System.out.println("Before "+a1);
		Collections.sort(a1);
		System.out.println("After "+a1);
	}
	

}
