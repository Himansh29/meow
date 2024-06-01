

// Functional Interface 
// If any interface consist of only  Single Abstract Method (one SAM) 
// then its called as functional interface 

//In this program square interface is a Functional Interface because it is having SAM

interface Square 
{
	public int getArea(int side); // function declaration  (Abstract method)
}

// if we have functional interface then no need to write implements Square
// because we are using lambda expressions 


public class Day16_4
{

	public static void main(String[] args) 
	{
		Square area = (side) -> {return side*side;};  
		// Lambda expression to define the function 
		System.out.println(area.getArea(20));
		System.out.println(area.getArea(5));
		Square area1 = (side) -> {return side*side*side;}; 
		System.out.println(area1.getArea(20));
		System.out.println(area1.getArea(5));

	}

}
