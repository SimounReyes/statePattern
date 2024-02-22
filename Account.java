import javax.tools.Diagnostic;

public class Account{
    private static final Account AccountState = null;
    private String accountNumber;
    private Double balance;
    private AccountState accountState;
    public double setBalance;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
        
    }
    public Account(){

    }
    public String toString(){
        return "Current Balance: " + getBalance() +"\nAccount Number" + getAccountnNumber();
    }

    public void suspend(){
        accountState.suspend(this);
    }
    public void activate(){
        accountState.activate(this);
    }
    public void close(){
        accountState.close(this);
    }
    public void deposit(Double deposit){
        accountState.deposit(deposit);
    }
    public void withdraw(Double withdraw){
        accountState.withdraw(withdraw);
    }

    public AccountState getState(){
        return accountState;
    }
    public void setState( AccountState accountState){
        this.accountState = accountState;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountnNumber(){
        return accountNumber;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public Double getBalance(){
        System.out.println(balance+"as");
        return balance;
    }
}