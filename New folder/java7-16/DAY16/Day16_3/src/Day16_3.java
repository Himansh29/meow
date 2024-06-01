import java.util.Arrays;
import java.util.List;


// If we want some collective / consolidate result on collection (Streams)
// if we want to perform some iterative result on collection (lambda)

public class Day16_3 
{
	public static void main(String args[])
	{
		List<Integer>l1 = Arrays.asList (1,2,3,4,5);
		l1.forEach(x->{
			x+=2;
			System.out.print(x+" ");
			
		});
		System.out.println("\n"+l1);
		
		
	}
}

/*
public class Day16_3 
{
	public static void main(String args[])
	{
		List<Integer>intSeq = Arrays.asList (1,2,3);
		intSeq.forEach(x -> System.out.println (x));
		
		// for each element x inside the intSeq print the element x 
		// function style of programming (LAMBDA EXPRESSION)
	}
	
}
*/


/*
public class Day16_3 
{
	public static void main(String args[])
	{
		List<Integer>intSeq = Arrays.asList (1,2,3);
		
		for(Integer i: intSeq)
			System.out.println(i);
		
	}
	
}
*/