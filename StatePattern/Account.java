import javax.tools.Diagnostic;

public class Account {
    private Account AccountState;
    private String accountNumber;
    private Double balance;
    private AccountState accountState;
    public double setBalance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account Activated!");
        accountState = new ActiveState();

    }

    public String toString() {
        System.out.println("Current Balance: " + getBalance() + "\nAccount Number: " + getAccountnNumber());
        return "";
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }

    public void deposit(Double deposit) {
        accountState.deposit(deposit, this);
    }

    public void withdraw(Double withdraw) {
        accountState.withdraw(withdraw, this);
    }

    public AccountState getState() {
        return accountState;
    }

    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountnNumber() {
        return accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}
