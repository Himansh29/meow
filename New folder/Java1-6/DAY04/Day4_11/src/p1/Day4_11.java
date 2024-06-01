package p1;

class Test
{
	int num1;
	int num2;
	static int num3;
	
	static
	{
		num3=55;
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
	public static int getNum3() 
	{
		return num3;
	}
	public static void setNum3(int num3) 
	{
		Test.num3 = num3;
	}
	
	
	//if we access static data inside the method
	// we should declare method as static
	
}
public class Day4_11 {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		//t1 object will receive memory allocation for num1 and num2
		t1.setNum1(30);
		t1.setNum2(20);
		Test.setNum3(99);
		System.out.println("Num1 "+t1.getNum1());
		System.out.println("Num2 "+t1.getNum2());
		System.out.println("Num3 "+Test.getNum3());

	}

}
