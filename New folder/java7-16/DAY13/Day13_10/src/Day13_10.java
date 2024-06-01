import java.io.File;
import java.io.IOException;


public class Day13_10 {

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="File.txt";
		File f=new File(pathname);
		boolean b = f.createNewFile();
		System.out.println(b);
		

	}

}



/*
public class Day13_10 {

	public static void main(String[] args) 
	{
		try
		{
		String pathname="File.txt";
		File f=new File(pathname);
		boolean b = f.createNewFile();
		System.out.println(b);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

*/
