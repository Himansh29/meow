class Calculator
{
	private int[] arr;
	public Calculator()
	{
		this.arr=new int[] {10,20,30,40,50,60,70};
	}
		
		public synchronized int sum(int value) throws InterruptedException
		{
			int total=0;
			for(int index=0;index<this.arr.length;++index)
			{
				this.arr[index]= this.arr[index] + value;
				total=total+this.arr[index];
				System.out.println("Running Sum "+Thread.currentThread().getName()+" "+total);
				Thread.sleep(500);
			}
			return total;
		}
		
		
		public synchronized int sub(int value) throws InterruptedException
		{
			int total=0;
			for(int index=0;index<this.arr.length;++index)
			{
				this.arr[index]= this.arr[index] - value;
				total=total+this.arr[index];
				System.out.println("Running Sub "+Thread.currentThread().getName()+" "+total);
				Thread.sleep(500);
			}
			return total;
		}
}


class Task implements Runnable
{
	private Thread thread;
	Calculator cal=new Calculator();
	
	Task(String name)
	{
		this.thread=new Thread(this,name);
		this.thread.start();
	}
	
	public void run()
	{
		int total=0;
		try
		{
			if(thread.getName().equals("SumThread"))
				total=cal.sum(5);
			else if(thread.getName().equals("SubThread"))
				total=cal.sub(2);
			else
				System.out.println("Nothing");
;		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}




public class Day16_10
{

	public static void main(String[] args) 
	{
		Task t1=new Task("SumThread");
		Task t2=new Task("SubThread");
			

	}

}
