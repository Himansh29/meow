
class Demo extends Thread
{
	
	public void run()
	{
		
		System.out.println("My Thread is in running state : "+this.getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Day16_6 extends Thread
{
	public static void main(String[] args) throws InterruptedException 
	{
		Demo d1=new Demo(); 
		d1.start();
		Thread.sleep(1500);
		Demo d2=new Demo();
		d2.start(); 
		Thread.sleep(1500);
		Demo d3=new Demo();
		d3.start();
		Thread.sleep(1500);
		Demo d4=new Demo();
		d4.start(); 
	}

}



/*
class Demo extends Thread
{
	public void run()
	{
		System.out.println("My Thread is in running state : "+this.getName());
	}
}


public class Day16_6 extends Thread
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo(); // Thread() constructor will get called automatically 
		d1.start(); //start is called upon d1 object // object is threaded  
		// implicitely it will call run() // Thread-0
		Demo d2=new Demo();
		d2.start(); // Thread-1 
	}

}

*/


/*
public class Day16_6 extends Thread
{
	public void run()
	{
		System.out.println("My Thread is in running state");
	}

	public static void main(String[] args) 
	{
		Day16_6 obj=new Day16_6();
		obj.start();
	}

}
*/
