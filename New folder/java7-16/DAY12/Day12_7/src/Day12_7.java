import java.util.Enumeration;
import java.util.Vector;

public class Day12_7 {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(30);
		v.add(20);
		v.add(5);
		v.add(15);
		v.add(25);
		
		//System.out.println(v);
		//System.out.println(v.toString());
		//System.out.println(v.getClass());
		
		//for(int i=0;i<v.size();i++)
			//System.out.print("  "+v.get(i));
		
		//for(Integer i:v)
			//System.out.print(" "+i);

		//linking enumeration with the vector
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(" "+e.nextElement());
		}
		
		
		
	}

}
