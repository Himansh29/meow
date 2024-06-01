class Outer
{
	Outer() // Outer.class 
	{
		System.out.println("Inside class outer");
	}
	class Inner //Outer$Inner.class
	{
		Inner()
		{
			System.out.println("Inner class constructor");
		}
		
	}
}


public class Day8_8  //Day8_8.class
{

	public static void main(String[] args) 
	{
		//if inner class is non static
		
		Outer out=new Outer(); //creating instance of outer classs
		Outer.Inner in=out.new Inner(); // creating an instance of inner class
		
		//OR 
		Outer.Inner in2=new Outer().new Inner();
		
		//if inner class is static  
		//Outer.Inner in3=new  Outer.Inner();
		
		

	}

}
