import java.util.Arrays;
import java.util.List;

// Functional Programming Streams 

// Declarative Style of coding

public class Day16_2 {

	public static void main(String[] args)
	{
		
		List<Integer> numbers=Arrays.asList(11,22,33,44,55,66,77,88,99);
		
		System.out.println(numbers.stream().
				filter(number->number%2==0).mapToInt(e->e*2).sum());
		
	
		
		
	}
}

/*
// Imperative Style of Coding
public class Day16_2 {

	public static void main(String[] args)
	{
		
		List<Integer> numbers=Arrays.asList(11,22,33,44,55,66,77,88,99);
		
		//List<Integer> l1=new ArrayList<Integer>;
		//l1.add(11); l1.add(22).....
		
		int result=0;
		for(Integer n:numbers)
			if(n%2==0)
			{
				result+=n*2;
				
			}
		System.out.println(result);
		
		

	}

}

*/
