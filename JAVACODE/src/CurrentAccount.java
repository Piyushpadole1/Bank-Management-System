public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && super.getBalance()+overdraftLimit-amount>=0){
            super.reduceBalance(amount);
            System.out.println("Transaction Completed : Withdrawal Successfull");
        }else{
            System.out.println("Invalid Amount");
        }
    }
}
