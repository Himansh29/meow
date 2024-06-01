


public class Day2_8 {

	public static void main(String[] args) 
	{
		String mobile="+91-1234567";
		System.out.println("Mobile = "+mobile);
		int m=Integer.parseInt(mobile); // NumberFormatException (NFE)
		System.out.println("M = "+m);
	}
}



/*
public class Day2_8 {

	public static void main(String[] args) 
	{
		String mobile="1234567";
		System.out.println("Mobile = "+mobile);
		System.out.println(mobile.getClass());
		int m=Integer.parseInt(mobile);
		System.out.println("M = "+m);
	}
}

*/




/*
public class Day2_8 {

	public static void main(String[] args) 
	{
		System.out.println(Integer.MIN_VALUE+"\t"+Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"\t"+Byte.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"\t"+Float.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+"\t"+(int)Character.MAX_VALUE);
		
	}

}

*/

