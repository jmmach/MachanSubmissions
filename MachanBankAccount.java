import java.util.Scanner;
 
public class MachanBankAccount {
    // Attributes
    String accountHolder;
    int accountNumber;
    double balance;
 
    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
 
    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing " + amount + "... New Balance: " + balance);
    }
 
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawing " + amount + "... New Balance: " + balance);
        }
    }
 
    // Display balance method
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
 
public class MachanBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Creating an account
        BankAccount myAccount = new BankAccount("John Doe", 123456, 5000.0);
        myAccount.displayBalance();
 
        // Performing deposit
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);
 
        // Performing withdrawal
        System.out.print("\nEnter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);
 
        myAccount.displayBalance();
    }
}