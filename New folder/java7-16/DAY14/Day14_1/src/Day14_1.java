
import java.io.File;
import java.io.IOException;



public class Day14_1 
{

	public static void main(String[] args) throws IOException 
	{
		String location="JAVA"; 
		File f=new File(location);
		boolean b = f.mkdir();
		System.out.println("Folder creation status = "+b);
		
		
		
		String pathname="D:/Sunbeam/FEB2022/cj-o-08/DAY14/Day14_1/JAVA/TEST.txt"; // absolute path
		
		File f1=new File(pathname);
		boolean b1 = f1.createNewFile();
		System.out.println("File creation status = "+b1);
	}
}

/*
public class Day14_1 
{

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="JAVA"; 
		File f=new File(pathname);
		//boolean b = f.mkdir();
		//System.out.println("Folder creation status = "+b);
		
		boolean b = f.delete();
		System.out.println("Folder deletion status = "+b);
		
	}

}

*/




/*

public class Day14_1 
{

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="C:/Users/sunbeam/Desktop/Demo.txt"; // Absoulte path
		File f=new File(pathname);
		boolean b = f.delete();
		System.out.println("File Deletion status = "+b);
		

	}

}

*/



/*
public class Day14_1 
{

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="Demo.txt"; // Relative Path
		File f=new File(pathname);
		boolean b = f.delete();
		System.out.println("File Deletion status = "+b);
		

	}

}
*/





/*
public class Day14_1 {

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="Demo.txt";
		File f=new File(pathname);
		boolean b = f.createNewFile();
		System.out.println(b);
		

	}

}

*/




