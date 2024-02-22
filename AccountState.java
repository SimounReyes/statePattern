public interface AccountState {
    double setBalance = 0;
    public void deposit(Double depositBal);
    public void withdraw(Double withdrawBal);
    public void suspend(Account account);
    public void activate(Account account);
    public void close(Account account);
    //public String toString();
}