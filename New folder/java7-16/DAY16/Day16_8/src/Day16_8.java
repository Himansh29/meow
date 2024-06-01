class Count extends Thread
{
	Count()
	{
		super("My extending Thread ");
		System.out.println(" Thread is created "+this);
		start();
	}
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(" Count = "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class Day16_8 {

	public static void main(String[] args) throws InterruptedException {
		Count c1=new Count();
		c1.start();
		
		

	}

}
