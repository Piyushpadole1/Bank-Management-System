public class SavingAccount extends Account{
 private final double minimumBalance=5000;
 private final double interestRate=8;

 public SavingAccount(int accountNumber,Customer customer){
        super(accountNumber,customer,"SavingAccount");
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
