
//class Date : day, month, year
//class Employee : name, age,salary

class Date
{
	private int day;
	private int month;
	private int year;
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

class Employee
{
	private int empid; // value type
	private String name; // reference type
	private int salary; // value type
	private Date joinDate;//reference type //reference variable / instance / object od Date class
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	void printRecord()
	{
		System.out.println("Empid = "+this.empid);
		System.out.println(" Name = "+this.name);
		System.out.println(" Salary = "+this.salary);
		
		System.out.println("Day =  "+joinDate.getDay()); // NPE
		System.out.println(" Month = "+joinDate.getMonth()); // NPE
		System.out.println(" Year = "+joinDate.getYear()); // NPE 
	}
	
}



public class Day4_1 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.printRecord();

	}

}

// NullPointerException will occur because Date joinDate is a reference holding null.

