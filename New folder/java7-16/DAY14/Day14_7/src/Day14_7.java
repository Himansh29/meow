import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;




public class Day14_7 
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.dat";
	
	
	
	private static void readRecord() throws IOException
	{
		
		try(DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(new File(PATH_NAME))));)
		{
			
			String name=dis.readUTF();
			int age=dis.readInt();
			float salary=dis.readFloat();
			double d=dis.readDouble();
			System.out.println("Read from file ");
			System.out.println("Name = "+name+" Age = "+age);
			System.out.println("Salary= "+salary+" d = "+d);
			
			
			
		}
		
	}


	private static void writeRecord() throws IOException 
	{
		try(DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(PATH_NAME))));)
		{
			dos.writeUTF("Akshita");
			dos.writeInt(34);
			dos.writeFloat((float) 50000.50);
			dos.writeDouble(5.3);
			
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
