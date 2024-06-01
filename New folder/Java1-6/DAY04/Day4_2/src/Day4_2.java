
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
	
	
	
}

class Employee
{
	private int empid; // value type
	private String name; // reference type
	private int salary; // value type
	private Date joinDate=new Date();//reference type //reference variable / instance / object od Date class
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
		
		System.out.println("Day =  "+joinDate.getDay());
		System.out.println(" Month = "+joinDate.getMonth()); 
		System.out.println(" Year = "+joinDate.getYear());  
		
		System.out.println("Hashcode of date class = "+joinDate);
	}
	
}



public class Day4_2 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.printRecord();
		System.out.println("Employee hashcode "+e1);

	}

}

//Association is creating object of one class into another class 



