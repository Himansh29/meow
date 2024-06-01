import java.lang.reflect.*;

class Complex
{
	int real;
	int imag;
	public Complex() {
		
	}
	public Complex(int real, int imag) {
		
		this.real = real;
		this.imag = imag;
	}
	
	int getReal()
	{
		return this.real;
	}
	int getImag()
	{
		return this.imag;
	}
	
	
}

public class Day15_12 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		Complex complex=new Complex();
		System.out.println("Real field using Object " + complex.getReal());
		System.out.println("Imag field using object " +complex.getImag());
		
		Class<?> c = complex.getClass();
		Field f=null;
		
		f=c.getDeclaredField("real");
		f.setInt(complex, 50);
		System.out.println("Real Value after reflection"+complex.getReal());
		
		f=c.getDeclaredField("imag");
		f.setInt(complex, 70);
		System.out.println("Imag Value after reflection"+complex.getImag());
		
		@SuppressWarnings("rawtypes")
		Constructor[] list_of_constr=c.getDeclaredConstructors();
		
		for(Constructor cstr:list_of_constr)
			System.out.println(cstr);
		
		
	}

}
