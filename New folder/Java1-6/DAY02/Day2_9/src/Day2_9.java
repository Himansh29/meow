

// narrowing 

public class Day2_9 {

	public static void main(String[] args) 
	{
		double num1=50;
		//int num2=num1; // store num1 into num2 // larger to smaller //javac error
		// NARROWING Concept
		//RULE: in case of narrowing concept , you must specify the typecasting
		// other wise it will give javac error (TYPE MISMATCH)
		int num2=(int)num1;
		System.out.println("Num1 "+num1+ " Num2 "+num2);
		
		int num3=(int) num1;
		System.out.println("Num3 "+num3);
		
	}
}

/*
// Narrowing and Widening 
//int,float,double,byte,short
// primitive datatypes
// Conversion : Typecasting 

// in case of widening, It is optional to explicitely
// to do the  typecast 

public class Day2_9 {

	public static void main(String[] args) 
	{
		int a=45;
		//double d=a; //converting smaller datatype to larger  (implicit conversion)
		// Widening 
		double d=(double)a; // typecasting // explicit conversion
		System.out.println("A = "+a);
		System.out.println("D = "+d);
		

	}

}


*/