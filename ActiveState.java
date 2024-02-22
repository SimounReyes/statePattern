public class ActiveState implements AccountState{
    public void deposit(Double depositBal){
        Account account = new Account();
        System.out.println(account.getBalance()+"help");
        System.out.println(account.getAccountnNumber());
        System.out.println(account.toString());
    }
    public void withdraw(Double withdrawBal){
        Account account = new Account();
        account.setBalance =- withdrawBal;
        System.out.println(account.toString());
    }
    public void suspend(Account account){
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
    }
    public void activate(Account account){
        System.out.println("Account is already activated!");
    }
    public void close(Account account){
        System.out.println("Account is closed!");
        account.setState( new ClosedState()); 
    }
   /*public String toString(){
        Account account = new Account();
        return "Current Balance: " + account.getBalance() +"\nAccount Number" + account.getAccountnNumber();
    }*/

}