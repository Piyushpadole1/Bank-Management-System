public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, Customer customer) {
        super(accountNumber, customer,"CurrentAccount");
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && super.getBalance()+overdraftLimit-amount>=0){
            super.reduceBalance(amount);
            System.out.println("Transaction Completed : Withdrawal Successfull");
            return true;
        }else{
            System.out.println("Invalid Amount");
            return false;
        }
    }
}
