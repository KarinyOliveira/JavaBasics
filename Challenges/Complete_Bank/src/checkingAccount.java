//Author: Kariny Oliveira
//Student Number: CT1004878

//Child class that extends the parent class Bank Account
public class checkingAccount extends BankAccount {
	public checkingAccount(double balance) {
		super(balance);
	}

	// checking account doesn't have an interest associated, so returns 0
	@Override
	public double calculateInterest() {
		return 0;
	}
}
