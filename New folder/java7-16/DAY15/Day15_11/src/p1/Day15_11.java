package p1;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Day15_11 {

	public static void main(String[] args)
	{
		Class<?> c=Book.class; // Reflection
		// storing the classs file of Book.java inside 
		// the reference variable 'c' of type Class
		
		Annotation[] list = c.getDeclaredAnnotations();
		for(Annotation element:list)
		
			{
			if(element instanceof Author)
			{
				Author a=(Author)element;
				System.out.println("First name = "+a.firstName());
				System.out.println("Last name = "+a.lastName());
			}
			}
		
	
		

	}

}


// class Employee
// Employee e1=new Employee()

// e1 instanceOf Employee  // True 






