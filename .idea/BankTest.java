class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: " + balance
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, 5000);

        try {
            account.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}