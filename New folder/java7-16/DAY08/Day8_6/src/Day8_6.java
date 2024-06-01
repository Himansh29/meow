
class Machine //super / parent 
{
	public void start()
	{
		System.out.println("Inside start method of machine");
	}
}

class Laptop extends Machine //sub / child 
{
	public void start()
	{
		System.out.println("Inside start method of laptop");
	}
	
	public void stop()
	{
		System.out.println("Inside Stop method of laptop");
	}
}


public class Day8_6 {

	public static void main(String[] args)
	{
		Machine mobj=new Machine();
		//mobj.start(); // it will call start() of super class

		Laptop lobj=new Laptop();
		//lobj.start(); //start() will be called sub class
		//lobj.stop(); //stop() will be called sub class
		
		// parent class reference is pointing to child class object
		// UPCASTING 
		Machine m2=lobj; 
		
		// above statement is exactly similar to
		//Machine m2=new Laptop(); 
		//m2.start(); // strat() of sub class
		
		
		Machine m3=new Laptop();
		//m3.start();
		// m3.stop(); // NO  //javac  : Error
		
		// Downcasting
		// assign reference of parent which points to child class
				
		Laptop l1=(Laptop) m3;
		l1.start();
		l1.stop();
		
		
	}

}
