import java.lang.reflect.*;

// program is to fetch the information about our own user defined class
// ReflectionDemo

// we fetched
// name of class, constructor declared within the class
// methods declared within the class
// methods declared from the super class along with its own methods
//  field names along with the datatype


class ReflectionDemo
{
	String str;
	ReflectionDemo()
	{
		str="CoreJava-CJ08";
	}
	ReflectionDemo(String str)
	{
		this.str=str;
	}
	
	public void m1()
	{
		System.out.println("Inside Method1");
	}
	
	public void m2()
	{
		System.out.println("Inside Method2");
	}
	
	public void m3()
	{
		System.out.println("Inside Method3");
	}
}


public class Day16_1 
{

	public static void main(String[] args) throws NoSuchFieldException, SecurityException 
	{
		ReflectionDemo obj=new ReflectionDemo();
		Class cls=obj.getClass();
		System.out.println(cls.getName());
		
		//Constructor[] constructor=cls.getConstructors();
		//System.out.println(constructor);
		
		
			
		//Constructor[] list_of_constr=cls.getDeclaredConstructors();
		
		//for(Constructor cstr:list_of_constr)
			//System.out.println(cstr);
			
		System.out.println("List of methods declared inside ReflectionDemo class");
		Method[] list_of_methods=cls.getDeclaredMethods();
		for(Method m:list_of_methods)
			System.out.println(m);
		
		
		System.out.println("List of methods ");
		Method[] list_of_methods1=cls.getMethods();
		for(Method m:list_of_methods1)
			System.out.println(m);

		Field f=cls.getDeclaredField("str");
		System.out.println(f);
		
		
	}

}
