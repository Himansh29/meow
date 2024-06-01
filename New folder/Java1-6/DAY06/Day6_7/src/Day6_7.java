
//enum is one type
//class is one type 

enum Color //enum Color is user defined enum 
{
	RED,GREEN,BLUE // RED,GREEN,BLUE  are enum constants 
}

public class Day6_7 
{
	
	public static void main(String[] args)
	{
		Color[] colors = Color.values() ; // colors array of reference
		
		System.out.println(colors.toString()); // hashcode 
		for(Color clr:colors)
			System.out.println(clr.toString()); // names of enum constatns 
		for(Color clr:colors)
			System.out.println(clr.ordinal()+" \t "+clr.name());
		//  position and name  of enum constants
		
	}
}







/*
public class Day6_7 
{
	
	public static void main(String[] args)
	{
		System.out.println(Color.RED.toString());
		
		Color clr=Color.RED; // clr is a enum variable name 
		//which is holding RED value currently
		System.out.println("Name = "+clr.name());
		
		System.out.println("Ordinal Value = "+clr.ordinal());
		
		
		clr=Color.BLUE;
		System.out.println("Name = "+clr.name()+" Ordinal Value = "+clr.ordinal());
		

	}

}
*/