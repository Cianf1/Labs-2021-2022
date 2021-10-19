package ie.itcarlow.lab3q2;

public class Driver {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(1);
		SavingsAccount saver2 = new SavingsAccount(2);
		SavingsAccount saver3 = new SavingsAccount(3);
		
		System.out.println("Acc no.: " + saver1.getAccountNumber);
		System.out.println("Acc no.: " + saver2.getAccountNumber);
		System.out.println("Acc no.: " + saver3.getAccountNumber);
		

	}

}
