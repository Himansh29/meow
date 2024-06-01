package p1;

//static
// 1. static fields
// 2. static methods 

class Test
{
	int num1; // non static field 
	int num2; // non static field
	static int num3; // static field
	//static fields must be initialized only once through out the program
	
	Test()
	{
		this.num1=10;
		this.num2=10;		
		System.out.println("Inside parameterless constructor");
	}
	
	Test(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("inside paramatrized constructor ");
	}
	//if we would like to initialize static variables 
	// then we must have static initializer block
	
	static //STATIC INITIALIZER BLOCK 
	{
		System.out.println("Inside Static intiializer block ");
		Test.num3=50;
	}
	
		
	//static initializer block will get loaded at the time of class loading 
	void disp()
	{
		System.out.println("Num1 "+this.num1+" Num2 "+this.num2);
		System.out.println("Num3 "+Test.num3);
	}
	
	void modify()
	{
		num3+=10;
		
	}
	
}

// Test :: num3=50; // SCOPE RESOLUTION OPERATOR in C++  
// Scope Resoultion operator is not present  in java



public class Day4_9 {

	public static void main(String[] args) 
	{
		Test t1=new Test(); 
		Test t2=new Test(55,44); 
		t1.disp();
		t2.disp();
		t1.modify();
		t1.disp();
		t2.disp();

	}

}
