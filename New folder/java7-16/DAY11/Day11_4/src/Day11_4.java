



class Box<T extends Number> // Bounded Type Parameter
{
	private T obj;
	public T get()
	{
		return obj;
	}
	public void set(T obj)
	{
		this.obj=obj;
	}
}

public class Day11_4 {

	public static void main(String[] args) 
	{
		Box<Integer> b1=new Box<Integer>();
		b1.set(1234);
		System.out.println(b1.get());
		
		//Box<Boolean> b2=new Box<Boolean>(); //invalid Boolean is not extended from Number
		//b2.set(true); 
		//System.out.println(b2.get());
		
		Box<Double> b3=new Box<Double>(); // Double extends Number 
		b3.set(4.5);
		System.out.println(b3.get());
		
		
		Box<Float> b4=new Box<Float>();
		b4.set(2.3f);
		System.out.println(b4.get());
		
		//Box<String> b5=new Box<String>(); // invalid
		// type mismatch
		// String is not extended from Number class
		//b5.set("Akshita");
		//System.out.println(b5.get());
		
		 		
	}

}


/*

class Box<T> // extends Object
{
	private T obj;
	public T get()
	{
		return obj;
	}
	public void set(T obj)
	{
		this.obj=obj;
	}
}

public class Day11_4 {

	public static void main(String[] args) 
	{
		Box<Integer> b1=new Box<Integer>();
		b1.set(1234);
		System.out.println(b1.get());
		
		Box<Boolean> b2=new Box<Boolean>();
		b2.set(true);
		System.out.println(b2.get());
		
		Box<Double> b3=new Box<Double>();
		b3.set(4.5);
		System.out.println(b3.get());
		
		
		Box<Float> b4=new Box<Float>();
		b4.set(2.3f);
		System.out.println(b4.get());
		
		Box<String> b5=new Box<String>();
		b5.set("Akshita");
		System.out.println(b5.get());
	}

}
*/