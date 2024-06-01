import java.io.File;
import java.io.IOException;

public class Day14_2 
{

	public static void main(String[] args) throws IOException 
	{
		
		String pathname="Demo.txt";
		File f=new File(pathname);
		System.out.println("Absolute path = "+f.getAbsolutePath());
		System.out.println("Name "+f.getName());
		System.out.println("Length "+f.length());
		//System.out.println(f.getTotalSpace());
		
		//System.out.println(f.getUsableSpace());
		//System.out.println(f.lastModified());
		System.out.println(f.isHidden());
		
	}

}






