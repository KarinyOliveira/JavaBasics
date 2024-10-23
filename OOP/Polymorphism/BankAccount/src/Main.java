public class Main {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savings = new SavingsAccount(1000.0, 5.0);
        CheckingAccount checking = new CheckingAccount(500.0, 200.0);

        // Perform deposits and withdrawals on savings account
        System.out.println("Savings Account:");
        savings.deposit(200.0);
        savings.withdraw(100.0);
        double interest = savings.calculateInterest();
        System.out.println("Interest earned: " + interest);
        System.out.println("Final balance: " + savings.getBalance() + "\n");

        // Perform deposits and withdrawals on checking account
        System.out.println("Checking Account:");
        checking.deposit(150.0);
        checking.withdraw(300.0);  // Within overdraft limit
        checking.withdraw(500.0);  // Exceeds overdraft limit
        System.out.println("Final balance: " + checking.getBalance());
    }
}