public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User(1, "John Doe", "john.doe@example.com");

        // Create an account for the user
        Account account = new Account(1001, 500.0, user);

        // Display initial account balance
        System.out.println("Initial balance: " + account.getBalance());

        // Deposit money
        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Create another account
        Account account2 = new Account(1002, 300.0, user);

        // Create a transaction from account to account2
        Transaction transaction = new Transaction(1, 150.0, "transfer", account, account2);

        // Display transaction details
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Transaction amount: " + transaction.getAmount());
        System.out.println("Transaction type: " + transaction.getType());
        System.out.println("From Account: " + transaction.getFromAccount().getAccountNumber());
        System.out.println("To Account: " + transaction.getToAccount().getAccountNumber());
        System.out.println("Transaction date: " + transaction.getDate());
    }
}
