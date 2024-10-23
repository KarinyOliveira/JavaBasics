import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private int pin;
	private static final String LOG_FILE = "audit.log";	
	
	public BankAccount(String accountNumber, double balance, int pin) {
		if (String.valueOf(pin).length() != 4)
            throw new IllegalArgumentException("PIN must be four digits.");
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setPin(int pin) {
		if (String.valueOf(pin).length() != 4)
            throw new IllegalArgumentException("PIN must be exactly four digits.");
		this.pin = pin;
        logTransaction("PIN changed");
	}
	
	public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        logTransaction("Deposited " + amount);
    }
	
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            throw new IllegalArgumentException("Incorrect PIN.");
        }
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Insufficient funds or invalid withdrawal amount.");
        }
        balance -= amount;
        logTransaction("Withdrew " + amount);
    }

    public void transfer(BankAccount recipient, double amount, int enteredPin) {
        if (enteredPin != pin) {
            throw new IllegalArgumentException("Incorrect PIN.");
        }
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Insufficient funds or invalid transfer amount.");
        }
        this.withdraw(amount, enteredPin);
        recipient.deposit(amount);          
        logTransaction("Transferred " + amount + " to " + recipient.getAccountNumber());
    }

    private void logTransaction(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(LocalDateTime.now() + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Failed to log transaction: " + e.getMessage());
        }
    }

}
