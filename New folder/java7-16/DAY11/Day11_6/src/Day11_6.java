import java.util.ArrayList;
import java.util.Iterator;

public class Day11_6 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list consist of elements of reference type 
		System.out.println("size = "+list.size());
		int[] data= {10,20,30,40,50,60,70,80,90};
		// data is array of elements of value type
		
		//list.add(data[0]); // 10 is added in the list 
		// internally int type is getting convetred to Integer type
		// value type to reference type
		
		for(int i : data)
			list.add(i);
		System.out.println("Array List elements are using for each:");
		for(int i:list) // implicit convertion of int to Integer
			// Auto boxing
			System.out.print("  "+i);
		
		System.out.println("\n Array List elements are using normal for :");
		for(int i=0;i<list.size();i++)
			System.out.print(" "+list.get(i));
		//list[i] ==> Integer non primitive
		// i primitive 
		
		// using iterator displaying ArrayList elements 
		System.out.println("\n Array List elements using Iterator : ");
		// attach a iterator to the list
		
		Iterator<Integer> itr = list.iterator();
		//itr is reference of Iterator Interface
		while(itr.hasNext())
			System.out.print(" "+itr.next());
		
		
		
		
		
		
		
	}

}
