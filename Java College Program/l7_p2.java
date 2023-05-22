class InsufficientFundsException extends Exception
{
	private double amount;
 	public InsufficientFundsException(double amount)
 	{
 		this.amount = amount;
}
 	public double getAmount()
	{
		return amount;
 	}
}


class CheckingAccount
{
 	private double balance;
 	private int number;
 	public CheckingAccount(int number)
 	{
 		this.number = number;
 	}
 	public void deposit(double amount)
	{
 		balance += amount;
 	}

public void withdraw(double amount) throws InsufficientFundsException
{
 	if(amount <= balance)
	{
		 balance -= amount;
 	}
 	else
 	{
 		double needs = amount - balance;
 		throw new InsufficientFundsException(needs);
 	}
 }
 public double getBalance()
 {
 	return balance;
 }
 public int getNumber()
 {
 	return number;
 }
}

public class l7_p2
{
	public static void main(String [] args)
 	{
 		CheckingAccount c = new CheckingAccount(20000);
 		System.out.println("Depositing Rs.15000...");
 		c.deposit(15000.00);
 		try
 		{
 			System.out.println("\nWithdrawing Rs.18000...");
 			c.withdraw(18000.00);
 			System.out.println("\nWithdrawing Rs.18000...");
 			c.withdraw(18000.00);
 		}
 		catch (InsufficientFundsException e)
		{
			 System.out.println("paisa ocha che :" + e.getAmount());
			 e.printStackTrace();
		 }
 	}
}
