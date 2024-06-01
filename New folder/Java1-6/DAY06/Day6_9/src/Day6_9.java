
public class Day6_9 {

	public static void main(String[] args) 
	{
		String s1="Sunbeam"; // it gives a call to default constructor of String class 
		//String s1=new String("Sunbeam");
		String s2="sunbeam"; 
		System.out.println(s1.hashCode()+ " \t "+s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=new String("Sunbeam").intern();
		System.out.println(s3.hashCode());
	}
}



/*
public class Day6_9 {

	public static void main(String[] args) 
	{
		String s1="hello"; //s1 : is a String literal object
		String s2="hello"; //s2 : is a string literal object
		System.out.println(s1+" "+s1.hashCode());
		System.out.println(s2+" "+s2.hashCode());
		String s3="Akshita";
		System.out.println(s3+" "+s3.hashCode());
		System.out.println("s1==s2 "+(s1==s2)); //true hashcode is compared 
		System.out.println("s1 equals s2 "+s1.equals(s2)); // contents are same true 
		
		System.out.println("s1 == s3 "+(s1==s3));
		System.out.println("s1 equals s3 "+s1.equals(s3));
		

	}

}

*/
