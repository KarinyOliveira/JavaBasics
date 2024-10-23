//Author: Kariny Oliveira
//Student Number: CT1004878 

import java.util.ArrayList;
import java.util.List;

public class interestCalculator {
	public static void main(String[] args) {
		// Create the accounts objects
		savingAccount savingsAccount = new savingAccount(10000.0, 0.15);
		checkingAccount checkingAccount = new checkingAccount(2000.0);

		// Create a list to hold BankAccount objects
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(savingsAccount);
		accounts.add(checkingAccount);

		// Loop through the list and calculate the interest for each account
		for (BankAccount account : accounts) {
			double interest = account.calculateInterest();
			String accountType = account instanceof savingAccount ? "Savings Account" : "Checking Account";
			System.out.println(accountType + " interest: " + interest);
		}
	}
}
