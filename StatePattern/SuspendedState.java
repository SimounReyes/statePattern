public class SuspendedState implements AccountState {
    public void deposit(Double depositBal, Account account) {
        System.out.println("You cannot withdraw on a suspended account!");
        account.toString();
    }

    public void withdraw(Double withdrawBal, Account account) {
        System.out.println("You cannot withdraw on a suspended account!");
        account.toString();
    }

    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    public void activate(Account account) {
        System.out.println("Account is activated!");
        account.setState(new ActiveState());
    }

    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }

}
