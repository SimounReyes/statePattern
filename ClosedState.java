public class ClosedState implements AccountState{
    public void deposit(Double depositBal){
        System.out.println("You cannot deposit on closed account!");
        toString();
    }
    public void withdraw(Double withdrawBal){
        System.out.println("You cannot withdraw on a closed account!");
        toString();
    }
    public void suspend(Account account){
        System.out.println(" You cannot suspend a closed account!");
    }
    public void activate(Account account){
        System.out.println("You cannot activate a closed account!");
    }
    public void close(Account account){
        
    }
    public String toString(){
        Account account = new Account();
        return "Current Balance: " + account.getBalance() +"\nAccount Number" + account.getAccountnNumber();
    }
}