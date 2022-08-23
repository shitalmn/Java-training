public class Bank
{
	
   public static void main(String args[])
   {
		BankAccount baObj ;
	   System.out.println("Bank Started");
	   baObj = new BankAccount();
	   baObj.deposit();
	   baObj.withdraw();
	   baObj.getbalance();
	   
   }
}

class BankAccount
{
	
	
	void withdraw()
	{
		System.out.println("BankAccount : withdraw() is called...........");
		Joker j = new Joker();
	j.jaggling();
	}
	void deposit()
	{
		System.out.println("BankAccount : deposit() is called...........");
	}
	void getbalance()
	{
		System.out.println("BankAccount : getbalance() is called...........");
	}
}

class Joker
{
	void jaggling()
	{
		System.out.println("joker is jaggling...........");
	}
}