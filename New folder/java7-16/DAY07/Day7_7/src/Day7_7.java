import java.util.Scanner;


// null pointer exception 
// because we have created reference inside the person class object
//but we have not given a call to setters
//intial value of reference (birthDate and address) are null
// so it will throw NullPointerException


class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		
	}

	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
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

class Address
{
	private String cityName;
	private String stateName;
	public Address()
	{
		
	}
	public Address(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}	
	
}


class Person
{
	private String name; // field // association
	private Date birthDate; // association //reference 
	private Address address; // reference 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", address=" + address + "]";
	}
	
	
	
	
}


public class Day7_7 
{
	private static Scanner sc=new Scanner(System.in);
	
	static void acceptRecord(Date birthDate)
	{
		System.out.println(" Enter Day : ");
		birthDate.setDay(sc.nextInt());
		System.out.println(" Enter Month : ");
		birthDate.setMonth(sc.nextInt());
		System.out.println(" Enter Year : ");
		birthDate.setYear(sc.nextInt());
		
	}
	
	
	static void acceptRecord(Address currentAddress)
	{
		System.out.println(" Enter CityName : ");
		currentAddress.setCityName(sc.next());
		
		System.out.println("Enter State Name : ");
		currentAddress.setStateName(sc.next());
		
	}
	
	static void acceptRecord(Person person)
	{
		System.out.println("Enter Name : ");
		person.setName(sc.nextLine());
		
		//create Date class object
		Date birthDate = new Date();
		acceptRecord(birthDate);
		//person.setBirthDate(birthDate); // NPE
		
		//Create Address class Object
		Address currentAddress=new Address();
		acceptRecord(currentAddress);
		//person.setAddress(currentAddress); // NPE 
		
	}
	
	static void printRecord(Date birthDate)
	{
		System.out.println("Day  = "+birthDate.getDay());
		System.out.println("Month = "+birthDate.getMonth());
		System.out.println("Year = "+birthDate.getYear());
	}
	
	static void printRecord(Address currentAddress)
	{
		System.out.println("City Name = "+currentAddress.getCityName());
		System.out.println("State Name ="+currentAddress.getStateName());
	}
	
	static void printRecord(Person person)
	{
		System.out.println("Name = "+person.getName());
		Date dobj=person.getBirthDate();

		Address aobj= person.getAddress();
		printRecord(dobj);
		printRecord(aobj);
	}
	
	
	public static void main(String[] args) 
	{
		Person p=new Person();
		acceptRecord(p);
		printRecord(p);
		//System.out.println(p); //will call to toString() 
	}

}
