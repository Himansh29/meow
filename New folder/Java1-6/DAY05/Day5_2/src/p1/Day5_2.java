package p1;

class Login
{
	private String email;
	private static int pass;

	Login()
	{
		this.email="DEFAULT";
	}
	
	static
	{
		pass=123;
	}

	public String getEmail() 
	{
		return email;
	}

	 //static fields must be accessed by static methods 
	public static int getPass()
	{
		return pass; 
	}

	
	public static void setPass(int pass) {
		Login.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + "]";
	}

	
	
}


public class Day5_2 
{

	public static void main(String[] args) 
	{
		Login l1=new Login();
		System.out.println("Email = "+l1.getEmail());
		System.out.println("Pass = "+Login.getPass());
		Login.setPass(123456);
		System.out.println("Email = "+l1.getEmail());
		System.out.println("Pass = "+Login.getPass());

	}

}
