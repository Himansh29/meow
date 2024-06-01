

// Test generic class
// Two Type Parameters 
//T is first type parameter
// U is second type parameter

class Test<T,U>
{
	T obj1;
	U obj2;
	Test(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void print()
	{
		System.out.print("\n First Type = "+obj1); 
		System.out.print(" Second Type = "+obj2); 
	}
}


public class Day9_4 {

	public static void main(String[] args)
	{
		//Test t1=new Test(25,20); // Raw Type 
		// while creating instance of generic class
		//if we dont specify type parameter
		//it is called as RawType of reference
		// So compiler gives us warning
		
		// Recommended : supply the type parameters 
		// whenever you are creating instance of generic class 
		
		//t1.print();
		
		
		Test<Integer,Double> t2=new Test<Integer,Double>(30,2.5);
		t2.print();
		
		Test<Double,Float> t3=new Test<Double,Float>(5.5,2.5f);
		t3.print();
		
		Test<Integer,Integer> t4=new Test<Integer,Integer>(70,80);
		t4.print();
		
		Test<Integer,String> t5=new Test<Integer,String>(34,"Akshita");
		t5.print();
		
	}

}






