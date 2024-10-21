import java.util.*;
class calculate
{
	static int main_balance=10000;
	static int remaining_balance;
	
	
	void withdraw(int withdraw)
	{
	  remaining_balance=main_balance-withdraw;
	  System.out.println("Withdraw Amount is = "+withdraw);
	  System.out.println("Main Balance before withdraw = "+main_balance);
	  System.out.println("Main Balance after withdraw = "+ remaining_balance);	 
		
	}
}

class Bank extends calculate
{
	void deposite (int deposite)
	{
	 remaining_balance=deposite+main_balance;
	 System.out.println("Deposite Amount = "+deposite);
	  System.out.println("Main Balance before withdraw = "+ main_balance);
	  System.out.println("Main Balance after withdraw = "+ remaining_balance); 
	
	}

	public static void main(String args[])
	{
		Bank b=new Bank();
		b.withdraw(5000);
		b.deposite(5000);
	}
}


