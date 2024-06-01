import java.util.ArrayList;

public class Day12_1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(15);
		a1.add(20);
		a1.add(25);
		ArrayList<Integer>a2=a1;
		System.out.println("A1 = "+a1+" Hashcode = "+a1.hashCode());
		System.out.println("A2 = "+a2+" Hashcode = "+a2.hashCode());
		
		ArrayList<Integer>a3 = (ArrayList<Integer>) a1.clone();
		System.out.println("A3 = "+a3+" Hashcode = "+a3.hashCode());
		//cloning operation
		
		System.out.println("get the element at index2= "+a3.get(2));
		// able to access any random data from AL using get()
	}

}
