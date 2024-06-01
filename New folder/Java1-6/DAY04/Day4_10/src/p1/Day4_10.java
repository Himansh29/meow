package p1;
class Bank
{
	int account;
	static int balance;
	Bank()
	{
		this.account=12345;
	}
	static
	{
		balance = 2000;
	}
	void deposit()
	{
		balance+=500;
	}
	void withdraw()
	{
		balance-=200;
	}
	void getInfo()
	{
		System.out.println("Balance Avaialble "+Bank.balance);
		//It is always a good practice to access the static fields 
		//of the class with the help of class name
	}
	
}
public class Day4_10 {

	public static void main(String[] args) 
	{
		Bank b1=new Bank();
		b1.getInfo();
		b1.deposit();
		b1.getInfo();
		b1.withdraw();
		b1.getInfo();
		b1.withdraw();
		b1.getInfo();
	}

}
