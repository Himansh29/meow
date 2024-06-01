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
//Use of try block handler 



public class Day14_4 
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.dat";
	
	
	
	private static void readRecord() throws IOException
	{
		
		try(FileInputStream is=new FileInputStream(new File(PATH_NAME));)
		{
			byte data = (byte)is.read();
			System.out.println("Reading from file = "+data);
			
		}
		
	}


	private static void writeRecord() throws IOException 
	{
		try(FileOutputStream os=new FileOutputStream(new File(PATH_NAME));)
		{
			os.write(123);
		}
		
			
		
	}
	
	
	private static int menuList()
	{
		System.out.println("Enter Choice : ");
		System.out.println("0.Exit 1.Write 2. Read ");
		return sc.nextInt();
		
	}
	

	public static void main(String[] args) throws IOException 
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
