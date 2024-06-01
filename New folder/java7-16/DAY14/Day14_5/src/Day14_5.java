import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class Day14_5 
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.dat";
	
	
	
	private static void readRecord() throws IOException
	{
		
		try(FileInputStream is=new FileInputStream(new File(PATH_NAME));)
		{
			int data; 
			while((data=is.read())!=-1) //-1 EOF 
			{
				System.out.print("  "+(char)data);
			}
				
			System.out.println("\n Read successful ");
			
			
		}
		
	}


	private static void writeRecord() throws IOException 
	{
		try(FileOutputStream os=new FileOutputStream(new File(PATH_NAME));)
		{
			for(char ch='A';ch<='Z';ch++)
				os.write(ch); //we are writing the data one byte at a time (26 times)
			System.out.println("Data Written Successfully");
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
