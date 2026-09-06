public interface Transaction {
    boolean deposit(double amount);
    boolean withdraw(double amount);
}
