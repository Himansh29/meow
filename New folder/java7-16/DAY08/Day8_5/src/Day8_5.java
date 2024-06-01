
class Demo
{
	int num1;
	int num2;
	
	
	
	public Demo()
	{
		super(); // it will give a call to super class constructor
		// Object super class default constructor call is taking place
		
	}



	void disp()
	{
		System.out.println("Num1 "+num1+" Num2 "+num2);
	}

	
}

public class Day8_5 {

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.disp();
		

	}

}
