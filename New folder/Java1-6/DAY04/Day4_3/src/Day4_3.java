
class Demo
{
	int num1,num2;
	Demo() // user defined default constructor / parameterless 
	{
		this(50,25);
	}
	Demo(int num1,int num2) // paramatrized 
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void set(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void disp()
	{
		System.out.println("Num1 = "+num1+" Num2 =" +num2);
	}
	
}

public class Day4_3 {

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.set(40,50);//set() is called upon d1
		Demo d2=new Demo();
		d2.set(70, 80); //set() is called upon d2
		d1.disp();
		d2.disp();
		
		

	}

}
