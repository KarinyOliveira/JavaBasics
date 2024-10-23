//Author: Kariny Oliveira
//Student Number: CT1004878

//SavingAccount class that inherit the attributes and methods from Bank Account
public class savingAccount extends BankAccount {
	// attribute specific from saving account
	private double interestRate;

	// Constructor initializing the parent and child class
	public savingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	// Override the parent method and implement the specific for saving account
	@Override
	public double calculateInterest() {
		return balance * interestRate;
	}
}
