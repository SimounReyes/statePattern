public interface AccountState {

    public void deposit(Double depositBal, Account account);

    public void withdraw(Double withdrawBal, Account account);

    public void suspend(Account account);

    public void activate(Account account);

    public void close(Account account);
    // public String toString();
}
