public class SavingAccount extends Account{
 private double minimumBalance;
 private final double interestRate=8;

 public SavingAccount(int accountNumber,Customer customer,double minimumBalance){
        super(accountNumber,customer);
        this.minimumBalance=minimumBalance;
 }
 public void withdraw(double amount){
        if(amount > 0 && getBalance()-amount>=minimumBalance){
            super.reduceBalance(amount);
            System.out.println("Transaction completed : Withdrawal successfull");
        }else{
            System.out.println("Invalid Transaction");
        }
 }
 public void calculateInterest(){
     double interest =super.getBalance()*interestRate/100;
     super.addInterest(interest);
 }
}
