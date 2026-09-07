public abstract class Account implements Transaction {
    private int accountNumber;
    private Customer customer;
    private double balance;
    private String accountType;
    public Account(){};

    public String getAccountType() {
        return accountType;
    }

    public Account(int accountNumber, Customer customer, String accountType){
        this.accountNumber=accountNumber;
        this.customer=customer;
        this.balance=0;
        this.accountType=accountType;
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
    public boolean deposit(double amount){
            if (amount>0){
                balance+=amount;
                System.out.println("Amount Deposited Successfully");
                return true;
            }else {
                System.out.println("Invalid Amount.");
                return false;
            }
    }
    public abstract boolean withdraw(double amount);
    public void displayAccountDetails(){
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Customer Name : "+this.customer.getName());
        System.out.println("Balance : "+this.balance);
    }
    protected void reduceBalance(double amount){
        this.balance=this.balance-amount;
    }

    protected void addInterest(double amount){
        this.balance=this.balance+amount;
    }


}
