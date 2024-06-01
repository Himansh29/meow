package p1;

public abstract class BoundedShape 
{
	public int x,y;

	public BoundedShape()
	{
		
	}

	public BoundedShape(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "BoundedShape [x=" + x + ", y=" + y + "]";
	}
	
	//add abstract method
	// Abstract classes consist of  abstract methods 
	//declaration of abstract methods
	
	public abstract double area();
	
	

}
