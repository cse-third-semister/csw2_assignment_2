abstract class Account {
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double b = getBalance();
        setBalance(b + amount);
        b = getBalance();

        // Simulate accruing monthly interest
        b += b * interestRate / 12;
        setBalance(b );
    }

    @Override
    public boolean withdraw(double amount) {
        double b = getBalance();
        if (b >= amount) {
            b -= amount;
            setBalance(b);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return false;
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        double b = getBalance();
        b += amount;
        setBalance(b);
    }

    @Override
    public boolean withdraw(double amount) {
        double b = getBalance();
        if (b + overdraftLimit >= amount) {
            b -= amount;
            setBalance(b);
            return true;
        } else {
            System.out.println("Withdrawal exceeds available balance and overdraft limit.");
            return false;
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount(12345678, 100, 0.00); // 5% interest rate

        // Deposit and withdraw operations
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);

        // Display account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());

        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount(87654321, 100, 50); // Overdraft limit of $1000

        // Deposit and withdraw operations
        currentAccount.deposit(50);
        currentAccount.withdraw(200);

        // Display account details
        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
    }
}
