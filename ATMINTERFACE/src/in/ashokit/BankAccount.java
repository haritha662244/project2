package in.ashokit;

import java.util.Scanner;
 public class BankAccount {

	String name;
	String username;
	String password;
	String accountNo;
	float balance = 1000000f;
	int transactions = 0;
	String transactionHistory = "";
	// BankAccount(String name, String username, String password, String accountNo) {
	// this.name = name;
	// this.username = username;
	// this.password = password;
	// this.accountNo = accountNo;
	// }
	public void register() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Your Name : ");
		this.name = sc.nextLine();
		System.out.print("\nEnter Your Username : ");
		this.username = sc.nextLine();
		System.out.print("\nEnter Your Password : ");
		this.password = sc.nextLine();
		System.out.print("\nEnter Your Account Number :  ");
		this.accountNo = sc.nextLine();
		System.out.println("\nYou have Successfully Registered!!!");
		System.out.println("Kindly Login!!!");
	}
	public boolean login() 
	{
		boolean isLogin = false;
		Scanner sc = new Scanner(System.in);
		while ( !isLogin ) 
		{
			System.out.print("\nEnter Your Username : ");
			String Username = sc.nextLine();
			if ( Username.equals(username) ) 
			{
				while ( !isLogin ) 
				{
					System.out.print("\nEnter Your Password : ");
					String Password = sc.nextLine();
					if ( Password.equals(password) ) 
					{
						System.out.print("\nYou have Logged in Successfully!!!");
						isLogin = true;
					}
					else 
					{
						System.out.println("\nIncorrect Password");
					}
				}
			}
			else 
			{
				System.out.println("\nUsername not found");
			}
		}
		return isLogin;
	}
	public void withdraw() 
	{
		System.out.print("\nEnter amount to withdraw :  ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		try 
		{
			if ( balance >= amount ) 
			{
				transactions++;
				balance -= amount;
				System.out.println("\nWithdraw Successful");
				String str = amount + " Rs Withdrawed\n";
				transactionHistory = transactionHistory.concat(str);
				
			}
			else 
			{
				System.out.println("\nInsufficient Balance");
			}
			
		}
		catch ( Exception e) 
		{
		}
	}
	public void deposit() 
	{	
		System.out.print("\nEnter amount to deposit : ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();	
		try 
		{
			if ( amount <= 1000000f ) 
			{
				transactions++;
				balance += amount;
				System.out.println("\nSuccessfully Deposited");
				String str = amount + " Rs deposited\n";
				transactionHistory = transactionHistory.concat(str);
			}
			else 
			{
				System.out.println("\nSorry. The Maximum Limit is Rs.1000000.00 only");
			}	
		}
		catch ( Exception e) 
		{
		}
	}
	public void transfer() 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Recipient's Name : ");
		String receipent = sc.nextLine();
		System.out.print("\nEnter amount to transfer : ");
		float amount = sc.nextFloat();
		try 
		{
			if ( balance >= amount ) 
			{
				if ( amount <= 50000f ) 
				{
					transactions++;
					balance -= amount;
					System.out.println("\nSuccessfully Transferred to " + receipent);
					String str = amount + " Rs transferred to " + receipent + "\n";
					transactionHistory = transactionHistory.concat(str);
				}
				else 
				{
					System.out.println("\nSorry. The Maximum Limit is Rs.50000.00 only");
				}
			}
			else 
			{
				System.out.println("\nInsufficient Balance");
			}
		}
		catch ( Exception e) 
		{
		}
	}
	public void checkBalance() 
	{
		System.out.println("\n" + balance + " Rs");
	}
	public void transHistory() 
	{
		if ( transactions == 0 ) 
		{
			System.out.println("\nEmpty");
		}
		else 
		{
			System.out.println("\n" + transactionHistory);
		}
	}
}
