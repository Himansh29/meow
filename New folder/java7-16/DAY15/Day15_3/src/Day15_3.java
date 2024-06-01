
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Write and Read set of character from text document


public class Day15_3
{
	static Scanner sc=new Scanner(System.in);
	
	static final String PATH_NAME="File.txt";
	
	
	
	private static void readRecord() throws IOException
	{
		
		try(BufferedReader fr=new BufferedReader(new FileReader(new File(PATH_NAME))))
		{
			int data;
			while((data=fr.read())!=-1)
				System.out.println((char)data);
		}
	
		
	}


	private static void writeRecord() throws IOException 
	{
			
		try(BufferedWriter fw=new BufferedWriter(new FileWriter(new File(PATH_NAME))))
		{
			for(char ch='A';ch<='Z';ch++)
				fw.write(ch);
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
