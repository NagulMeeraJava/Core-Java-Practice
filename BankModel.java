package bank;
import java.util.Scanner;
public class BankModel 
{
	private double initial_amount=100.0,withdrawal_amount=0.0,deposite_amount=0.0;
	private int option=0;
	Scanner s=new Scanner(System.in);
	public void continueLogic()
	{
		System.out.println("if You want to continue Press 1 other wise 2 ");
		int a=s.nextInt();
		if(a==1)
		{
			displayMenu();
		}
		else
		{
			System.out.println("Thank you");
			System.exit(0);
		}
	}
	// Dispaly menu options to user, then user can select any one option
	public void displayMenu()
	{
		System.out.println("Welcome to ABC bank");
		System.out.println("1. Deposite Amount");
		System.out.println("2. Withdrawal Amount");
		System.out.println("3. Balance Enquiry ");
		System.out.println("4. Exit");
		System.out.println("Please enter your option :");
	     option=s.nextInt();
		 chooseOption();
	}
	public void chooseOption()
	{
	
		switch(option)
		{
		case 1:
		{
			depositeAmount();
			continueLogic();
			break;
		}
		case 2:
		{
			withDrawalAmount();
			continueLogic();
			break;
		}
		case 3:
		{
			balanceEnquiry();
			continueLogic();
			break;
			
		}
		case 4:
		{
			System.out.println("Thank you");
			System.exit(0);
		}
		default:
		{
			System.out.println("Your Entered option is Wrong");
			break;
			
		}
		
		}
	}	
		
	
	public void depositeAmount()
	{
		System.out.println("Please enter Deposite amount :");
           deposite_amount=s.nextFloat();
           initial_amount=initial_amount+(deposite_amount-(0.25/deposite_amount)*100);
           System.out.println("Your Transaction Done Successfully");
           System.out.println("Available balance in Your account is "+initial_amount);
	}
	public void withDrawalAmount()
	{
		System.out.println("Please enter withdrawal amount :");
           withdrawal_amount=s.nextFloat();
           initial_amount=initial_amount-(withdrawal_amount+(0.50/withdrawal_amount)*100);
           System.out.println("Your Transaction Done Successfully");
           System.out.println("Available balance in Your account is "+initial_amount);
	}

	public void balanceEnquiry()
	{
		System.out.println("Available balance is :"+initial_amount);
	}

}
