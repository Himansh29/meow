package p1;

import java.util.Scanner;

class Numbers 
{
	private int num1,num2;
	Numbers()
	{
		this.num1=5;
		this.num2=5;
	}
	Numbers(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}



public class Test extends Numbers implements maths 
{

	int a,b;
	Numbers n1=new Numbers(20,5);
	
	Test()
	{
		a=n1.getNum1(); // a = 20
		b=n1.getNum2(); // b = 5
	}
	
	
	
	@Override
	public void add() 
	{
		System.out.println("Addition = "+(a+b));
		
	}

	@Override
	public void sub() 
	{
		
		System.out.println("Subtraction = "+(a-b));
	}

	@Override
	public void mul() 
	{
		System.out.println("Multiplication = "+(a*b));
	}

	@Override
	public void div()
	{
		System.out.println("Division = "+(a/b));
		
	}
	
}
