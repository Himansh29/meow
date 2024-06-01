
public class Day16_9 
{

	public static void main(String[] args) 
	{
		Thread th=Thread.currentThread();
		System.out.println(th.getPriority()); // 5 
		th.setPriority(3);
		System.out.println(th.getPriority()); // 3 
		System.out.println(th.isAlive()); // true 
		System.out.println(th.isDaemon()); // false 
		
	}
}


/*
public class Day16_9 
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}
}

*/
/*

class Demo implements Runnable 
{
	Thread t;
	String name;
	Demo(String name)
	{
		this.name=name;
	}
	@Override
	public void run() 
	{
		System.out.println(" Running Thread name = "+this.name);
		for(int i=0;i<4;i++)
			System.out.println(name + " "+ i );
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public class Day16_9 {

	public static void main(String[] args) 
	{
		Demo d1=new Demo("first");
		Thread th=new Thread(d1);
		th.start();
		
		Demo d2=new Demo("second");
		Thread th1=new Thread(d2);
		th1.start();
		
		
		Demo d3=new Demo("Third");
		Thread th3=new Thread(d3);
		th3.start();
		
		

	}

}


*/