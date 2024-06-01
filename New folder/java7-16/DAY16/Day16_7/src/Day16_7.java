
class Demo implements Runnable 
{
	Demo()
	{
		
	}
	public void run()
	{
		System.out.println("Inside Run method : "+this.getClass().getName());
		
	}

}



public class Day16_7 
{

	public static void main(String[] args) 
	{
		Demo d1=new Demo(); // d1 is Runnable object
		///Runnable object must be linked with thread object
		Thread th=new Thread(d1);
		th.start(); //d1.start() is not allowed 
		
		
		
	}
}



/*
public class Day16_7 implements Runnable 
{

	public static void main(String[] args) 
	{
		Day16_7 obj=new Day16_7(); // obj is reference of Runnable interface 
		
		// Thread(Runnable obj)
		// If we implement runnable interface
		//it is developer duty to link runnable reference with thread object
		// by calling the constructor of Thread class
		// Thread(Runnable obj)
		Thread th=new Thread(obj);
		th.start();
		

	}

	@Override
	public void run()
	{
		System.out.println("Inside Run method");
		
	}

}
*/