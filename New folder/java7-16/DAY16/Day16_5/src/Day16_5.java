
// Method Reference
// storing the reference of methods inside the reference of functional interface

interface RectangleArea
{
	public int getArea(int l,int b);
}

public class Day16_5
{

	public static int showRectangleArea(int len,int bre)
	{
		return len*bre;
	}
	
	public static int showSquareArea(int s1,int s2)
	{
		return s1*s2;
	}
	
	
	public static void main(String[] args) 
	{
		RectangleArea area=Day16_5 :: showRectangleArea;
		// calling to the static method
		//storing reference of method inside the reference of 
		// functional interface 
		
		int res=area.getArea(5, 4);
		System.out.println("Area Rectangle "+res);
		
		RectangleArea area1=Day16_5 :: showSquareArea;
		int res1=area1.getArea(3, 3);
		System.out.println("Area Sqaure "+res1);

	}

}
