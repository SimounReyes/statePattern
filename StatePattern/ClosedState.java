public class ClosedState implements AccountState {
    public void deposit(Double depositBal, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        account.toString();
    }

    public void withdraw(Double withdrawBal, Account account) {
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

    public void suspend(Account myAccount) {
        System.out.println(" You cannot suspend a closed account!");
    }

    public void activate(Account myAccount) {
        System.out.println("You cannot activate a closed account!");
    }

    public void close(Account myAccount) {
        System.out.println("Account is already closed!");
    }

}
