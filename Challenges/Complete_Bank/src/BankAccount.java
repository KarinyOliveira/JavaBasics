//Author: Kariny Oliveira
//Student Number: CT1004878

//Abstract class BankAccount with the common methods and attributes
public abstract class BankAccount {

	double balance;

	// Constructor to initialize the balance
	public BankAccount(double balance) {
		this.balance = balance;
	}

	// Common method
	public abstract double calculateInterest();
}
