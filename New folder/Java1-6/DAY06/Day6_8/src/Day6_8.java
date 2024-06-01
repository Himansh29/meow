
//Name  ADMIN , TRAIN, PLACEMENT
//Ordinal  0     1        2
//Values  20     30       40

//COMP ComputerEngineering
//IT   InformationTechnology

enum Dept  
{
	ADMIN(20,"ADMINSTRATION"),TRAIN(30,"TRAINING"),PLACEMENT(40,"PLACEMENTS");
	private int id;
	private String name;
	
	Dept  (int id, String name) 
	{
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

		
	
}


public class Day6_8 {

	public static void main(String[] args)
	{
		Dept d=Dept.TRAIN; //d is a reference variable of type enum Dept
		System.out.println("Name = "+d.name());
		System.out.println("Ordinal = "+d.ordinal());
		System.out.println(" Day name = "+d.getId());
		System.out.println("Day Number = "+d.getName());

	}

}


/*
//SUN , MON, TUES are static final constants 

enum Day  // name of Enum ==> Class name 
{
	SUN(10,"SunDay"),MON(20,"Monday"),TUES(30,"Tuesday");
	private int dayNumber;
	private String dayName;
	
	Day(int dayNumber, String dayName) 
	{
		this.dayNumber=dayNumber;
		this.dayName=dayName;
		
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public String getDayName() {
		return dayName;
	}
	
	
	
	
}

//SUN object internally Sole Constructor
// 1 , "Sunday" 1==> ordinal " sunday" Name value 




public class Day6_8 {

	public static void main(String[] args)
	{
		Day d=Day.SUN;
		System.out.println("Name = "+d.name());
		System.out.println("Ordinal = "+d.ordinal());
		System.out.println(" Day name = "+d.getDayName());
		System.out.println("Day Number = "+d.getDayNumber());

	}

}


*/
