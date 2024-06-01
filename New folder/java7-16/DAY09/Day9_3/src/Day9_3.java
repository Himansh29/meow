
//<T> : Type Parameter
// this type parameter we have specified with the class name
// C++ Class Template 
// java : Generic Class


//Test is called as generic call 


/*
class Test<T>
{
	T obj;
	Test(T obj)
	{
		this.obj=obj;
	}
	public T getObject()
	{
		return this.obj;
	}
}


public class Day9_3 {

	public static void main(String[] args)
	{
		Test<Integer> t1=new Test<Integer>(15);
		System.out.println(t1.getObject());
		
		Test<String> t2=new Test<String>("Sunbeam Infotech");
		System.out.println(t2.getObject());
		
	}

}

*/

//Code without generics 

class Test
{
	int num;
	String str;
	Test()
	{
		
	}
	Test(int num)
	{
		this.num=num;
	}
	Test(String str)
	{
		this.str=str;
	}
	
	int getValue()
	{
		return this.num;
	}
	
	String getString()
	{
		return this.str;
	}
	
}


public class Day9_3 {

	public static void main(String[] args)
	{
		Test t1=new Test(15);
		System.out.println(t1.getValue());
		
		Test t2=new Test("Sunbeam Infotech");
		System.out.println(t2.getString());
		
	}

}



