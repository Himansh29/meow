package p1;

public class Student 
{
	private int rollno;
	private int id;
	public Student()
	{
		this(1,1);
	}
	public Student(int rollno, int id) 
	{
		this.rollno = rollno;
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", id=" + id + "]";
	}
	
	
}
