
public class Main {
	
	public static void main(String[] args) {
        // Example usage
        BankAccount account1 = new BankAccount("1234567890", 1000.0, 1234);
        BankAccount account2 = new BankAccount("0987654321", 500.0, 5678);

        try {
            account1.deposit(500.0);
            account1.withdraw(250.0, 1234);
            account1.transfer(account2, 100.0, 1234);
            account1.setPin(4321);

            System.out.println("Account 1 balance: " + account1.getBalance());
            System.out.println("Account 2 balance: " + account2.getBalance());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

}
