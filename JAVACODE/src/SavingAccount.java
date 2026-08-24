public class SavingAccount extends Account{
 private double minimumBalance;
    public SavingAccount(int accountNumber,Customer customer,double minimumBalance){
        super(accountNumber,customer);
        this.minimumBalance=minimumBalance;
    }
   public void withdraw(double amount){
        if(amount>0&&getBalance()-amount>=minimumBalance){
            //Withdrawal accepted
        }else{
            //withdrawal rejected
        }
   }

}
