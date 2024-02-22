public class SuspendedState implements AccountState{
    public void deposit(Double depositBal){
    }
    public void withdraw(Double withdrawBal){
    }
    public void suspend(Account account){

    }
    public void activate(Account account){
        System.out.println("Account is activated!");
        account.setState( new ActiveState());
    }
    public void close(Account account){
        
    }
    /*public String toString(){
        Account account = new Account();
        return "Current Balance: " + account.getBalance() +"\nAccount Number" + account.getAccountnNumber();
    }*/
}