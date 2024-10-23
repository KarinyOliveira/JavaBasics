class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal amount exceeds the overdraft limit.");
        }
    }
}