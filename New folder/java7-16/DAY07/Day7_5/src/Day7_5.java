import java.util.StringTokenizer;



public class Day7_5 {

	public static void main(String[] args)
	{
		String str="www.sunbeaminfo.in/modular";
		StringTokenizer stk=new StringTokenizer(str,"./",true);
		String element=null;
		
		while(stk.hasMoreTokens())
		{
			element=stk.nextToken();
			System.out.println(element);
		}
		
	}
}


/*
public class Day7_5 {

	public static void main(String[] args)
	{
		String str="www.sunbeaminfo.in/modular";
		StringTokenizer stk=new StringTokenizer(str,"./");
		String element=null;
		
		while(stk.hasMoreTokens())
		{
			element=stk.nextToken();
			System.out.println(element);
		}
		
	}
}
*/

/*
public class Day7_5 {

	public static void main(String[] args)
	{
		String str="www.sunbeaminfo.in";
		StringTokenizer stk=new StringTokenizer(str,".");
		System.out.println(stk); //toString() 
		String element=null;
		
		while(stk.hasMoreTokens())
		{
			element=stk.nextToken();
			System.out.println(element);
		}
		
	}
}
*/



/*
public class Day7_5 {

	public static void main(String[] args)
	{
		String str="Sunbeam Infotech Pune Karad";
		StringTokenizer stk=new StringTokenizer(str);
		System.out.println(stk); //toString() 
		String element=null;
		
		while(stk.hasMoreTokens())
		{
			element=stk.nextToken();
			System.out.println(element);
		}
		
	}
}

*/



/*
public class Day7_5 {

	public static void main(String[] args)
	{
		String str="Sunbeam Infotech Pune Karad";
		StringTokenizer stk=new StringTokenizer(str);
		int count=stk.countTokens();
		System.out.println("Number of tokens = "+count);
	}

}
*/