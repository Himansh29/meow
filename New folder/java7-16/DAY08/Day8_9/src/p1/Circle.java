package p1;
import static java.lang.Math.PI;

public class Circle extends BoundedShape
{
	private double radius;
	
	public Circle(double radius,int x,int y) // paramatrized constructor 
	{
		super(x,y); // call to super class paramatrized constructor
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double area()
	{
		System.out.println("Inside Circle class area method");
		return PI*radius*radius;
	}
}
