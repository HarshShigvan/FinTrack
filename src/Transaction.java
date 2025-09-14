import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private double amount;
    private String type; // e.g., "deposit", "withdraw", "transfer"
    private LocalDateTime date;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(int transactionId, double amount, String type, Account fromAccount, Account toAccount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.date = LocalDateTime.now();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}
