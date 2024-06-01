package p1;

public class Rectangle extends BoundedShape
{

	private double width,height;
	
	
	public Rectangle(int x,int y,double width,double height)
	{
		super(x,y);
		this.width=width;
		this.height=height;
	}
	@Override
	public double area() 
	{
		System.out.println("Inside Rectangle class area method");
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
}
