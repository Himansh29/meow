import java.time.LocalDate;
import java.util.Arrays;

class Date
{
	int day;
	int month;
	int year;
	public Date() // parameterless constructor 
	{
		LocalDate ldt =LocalDate.now();
		this.day=ldt.getDayOfMonth();
		this.month=ldt.getMonthValue();
		this.year=ldt.getYear();
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
	
}



public class Day6_3 {

	public static void main(String[] args) 
	{
		Date[] arr=new Date[3];
		for(int i=0;i<3;i++)
			System.out.println(arr[i]); // null null null 
		
		for(int i=0;i<3;i++)
			arr[i]=new Date();
		
		//for each object of type Date 'd' inside an array arr
		
		for(Date d:arr) // using for each loop we are displaying objects 
			System.out.println(d);
		
		
		
	}
}






/*

public class Day6_3 {

	public static void main(String[] args) 
	{
		Date[] arr=new Date[3];
		for(int i=0;i<3;i++)
			System.out.println(arr[i]); // null null null 
		
		for(int i=0;i<3;i++)
			arr[i]=new Date();
		
		
		for(int i=0;i<3;i++)
			System.out.println(arr[i].toString());
		
		
		
	}
}

*/







/*

public class Day6_3 {

	public static void main(String[] args) 
	{
		Date[] arr=new Date[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=new Date();
		arr[1]=new Date();
		arr[2]=new Date();
		System.out.println(arr[0].toString());
		System.out.println(arr[1].toString());
		System.out.println(arr[2].toString());
		
	}
}
	
	*/





/*
public class Day6_3 {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.toString());

	}

}

*/
