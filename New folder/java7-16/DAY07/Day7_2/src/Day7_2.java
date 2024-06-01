
public class Day7_2 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Akshita");
		StringBuffer sb3=new StringBuffer("Akshita");
		StringBuffer sb4=sb3; // shallow copy 
		StringBuilder sb2=new StringBuilder("Akshita");
		//System.out.println("Capacity "+sb1.capacity());
		
		//StringBuffer sb3=new StringBuffer(50);
		//System.out.println("Capacity "+sb3.capacity());
	
			System.out.println(sb1.hashCode());
			System.out.println(sb3.hashCode());
		System.out.println(sb1.equals(sb3)); 
		System.out.println(sb4.equals(sb3));
	
	}
}



/*
public class Day7_2 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Sunbeam ");
		System.out.println("Original String = "+sb1);
		
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());  // compiler dependednt
		sb1.append("pune hinjewadi karad");
		System.out.println("Length = "+sb1.length());
		System.out.println("Capacity = "+sb1.capacity());
		System.out.println(sb1);
		StringBuilder sb2=sb1.append(" akshita ").append(" Trainer").append(" Technical").append("123456");
		
		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println("Sb1 Hashcode = "+sb1.hashCode()+" Sb2 Hashcode  "+sb2.hashCode());
		
		StringBuffer sb3=new StringBuffer("Gaurav");
		System.out.println(sb3.hashCode());
		

	}

}
*/