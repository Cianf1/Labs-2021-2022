package ie.itcarlow.lab3q2;

public class SavingsAccount {
	
	private int accountNumber;
	private static float annualInterestRate;
	private float savingsBalance;
	
	private static int nextFreeAccountNumber = 1;
	
	public SavingsAccount(int newAccountNumber) {
		accountNumber = newAccountNumber;
		nextFreeAccountNumber++;
	}
	
	public int getAccountNumber( ) {
		return accountNumber;
	}
	

	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void modifyAnnualInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public float getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
    public void calculateMonthlyInterest() {      //Calc interest rate 
		
		float interest = getSavingsBalance() * getAnnualInterestRate() / 12; 
		savingsBalance += interest;
		
    }
		
		
    public String toString() { 
    	return "Acc. no.: " + getAccountNumber()
    	+", balance: " + getSavingsBalance();
    }
    
	}
}
