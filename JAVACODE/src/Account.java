public abstract class Account implements Transaction {
    private int accountNumber;
    private Customer customer;
    private double balance;
    public Account(int accountNumber,Customer customer){
        this.accountNumber=accountNumber;
        this.customer=customer;
        this.balance=0;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
            if (amount>0){
                balance+=amount;
                System.out.println("Amount Deposited Successfully");
            }else {
                System.out.println("Invalid Amount.");
            }
    }
    public abstract void withdraw(double amount);
}
