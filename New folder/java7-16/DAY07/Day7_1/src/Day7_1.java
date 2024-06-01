

public class Day7_1 {

	public static void main(String[] args) 
	{

		StringBuffer sb1=new StringBuffer("akshita"); // Mutable 
		System.out.println(sb1); //sb1.toString() //override 
		sb1.append(" chanchlani ");
		System.out.println(sb1);  // Mutable 
		System.out.println("Character at 4 = "+sb1.charAt(4));
		System.out.println("Substring : "+sb1.substring(4));
	}
}

		
		
		
		
		
		
/*
public class Day7_1 {

	public static void main(String[] args) 
	{
		String s1="Sunbeam"; // immutable 
		//S  u  n  b  e  a  m 
		//0  1  2  3  4  5  6
		String s2="    Sunbeam Pune     ";
		
		System.out.println("Orginal String ="+s1);
		System.out.println("S1 in capital "+ s1.toUpperCase());
		System.out.println("It is again printing Original: Immutable "+s1); // Immutable 
		System.out.println("chat at 1st location "+s1.charAt(1));
		System.out.println("s1 equals s2 "+s1.equals(s2));
		System.out.println("Length  "+s1.length());
		System.out.println("Substring "+s1.substring(0,3));
		System.out.println("Substring "+s1.substring(3,7));
		System.out.println(" S2 without trim method = "+s2);
		System.out.println(" s2 with trim method : "+s2.trim());
		
		//boolean b=s1.startsWith("Sun");
		//System.out.println("String is starting with Sun = "+b);
		
		System.out.println("String is starting with Sun = "+s1.startsWith("Sun"));
		
		System.out.println("AFTER PERFROMING METHODS ON S1 DISPLAY "+s1);
		
				
		
		
	}

}

*/
