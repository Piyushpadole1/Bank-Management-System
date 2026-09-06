public class SavingAccount extends Account{
 private double minimumBalance;
 private final double interestRate=8;

 public SavingAccount(int accountNumber,Customer customer,double minimumBalance){
        super(accountNumber,customer,"SavingAccount");
        this.minimumBalance=minimumBalance;
 }
 public boolean withdraw(double amount){
        if(amount > 0 && getBalance()-amount>=minimumBalance){
            super.reduceBalance(amount);
            System.out.println("Transaction completed : Withdrawal successfull");
            return true;
        }else{
            System.out.println("Invalid Transaction");
            return false;
        }
 }
 public void calculateInterest(){
     double interest =super.getBalance()*interestRate/100;
     super.addInterest(interest);
 }
}
