package ie.itcarlow.lab3q2;

public class SavingsAccount {
	
	private int accountNumber;
	private static float annualInterestRate;
	private float savingsBalance;
	
	private static int nextFreeAccountNumber;
	
	public SavingsAccount(int newAccountNumber) {
		accountNumber = newAccountNumber;
		nextFreeAccountNumber++;
	}
	
	public int getAccountNumber( ) {
		return accountNumber;
	}


}
