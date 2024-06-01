import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//0. Exit
//1. Write Record
//2. Reading the Record 

//Write one byte on binary file ( FileOutputStream)
// read one byte from binary file( FileInputStream)



public class Day14_3 
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.dat";
	
	
	
	private static void readRecord() 
	{
		
		//try
		//{
			//FileInputStream is=new FileInputStream(new File(PATH_NAME));
		//}
		
		
		FileInputStream is=null;
		
		try
		{
			is=new FileInputStream(new File(PATH_NAME));
			byte data=(byte)is.read();
			System.out.println("Data is read from the file = "+data);
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		
		{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}


	private static void writeRecord() 
	{
		FileOutputStream os=null;
		try
		{
		os=new FileOutputStream(new File(PATH_NAME));
		//os=new FileOutputStream(new File("File.dat"));
		
		byte data=123;
		os.write(data);
		System.out.println("Data is written inside the file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			
				try 
				{
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
	}
	
	
	private static int menuList()
	{
		System.out.println("Enter Choice : ");
		System.out.println("0.Exit 1.Write 2. Read ");
		return sc.nextInt();
		
	}
	

	public static void main(String[] args) 
	{
		int choice;
		while((choice=menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				writeRecord();
			break;
			case 2:
				readRecord();
			break;
			}
		}
		

	}


	

}
