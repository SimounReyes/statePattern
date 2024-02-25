public class ActiveState implements AccountState {
    public void deposit(Double depositBal, Account account) {
        System.out.println("P" + depositBal + " is deposited in your account!");
        account.setBalance(account.getBalance() + depositBal);
        account.toString();
    }

    public void withdraw(Double withdrawBal, Account account) {
        System.out.println("P" + withdrawBal + " is withdrawn to your account!");
        account.setBalance(account.getBalance() - withdrawBal);
        account.toString();
    }

    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
    }

    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }

}
