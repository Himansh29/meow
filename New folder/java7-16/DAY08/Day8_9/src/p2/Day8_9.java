package p2;

import p1.BoundedShape;
import p1.Circle;
import p1.Rectangle;



public class Day8_9 {

	public static void main(String[] args) 
	{
		//array of references of abstract class 
		BoundedShape[] shapes= {new Circle(5.5,10,20),new Rectangle(50,100,4.5,3.5)};
		
		//for each BoundedShape 's' inside shapes array
		// print object information (call toString())
		// call area() method 
		for(BoundedShape s:shapes)
		{
			System.out.println(s);
			System.out.println(s.area());
		}
		
	}

}


/*
public class Day8_9 {

	public static void main(String[] args) 
	{
		//array of references of abstract class 
		BoundedShape[] shapes= {new Circle(5.5,10,20),new Rectangle(50,100,4.5,3.5)};
		
		System.out.println(shapes[0]); //toString()
		System.out.println(shapes[0].area());
		System.out.println(shapes[1]); //toString()
		System.out.println(shapes[1].area());
		
		
	}

}

*/
