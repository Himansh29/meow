
//generic methods 
//if any method is taking generic type of parameter
//then we declare that method as generic

public class Day9_5
{                        internally,
	              //display(T element = new T(55)) 
	              // display(Integer element = new Integer(55))
	static <T> void display(T element)
	{
		System.out.println(element.getClass()+ " Value =  "+element);
		
	}
	
	
	public static void main(String[] args) 
	{
		display(55);  // it is pass by reference 
		//it is achieved with the help of WRAPPER CLASSES 
		display("sunbeam infotech");
		display(5.2);
		
		
		
	}

}
