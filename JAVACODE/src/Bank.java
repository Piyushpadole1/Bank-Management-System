import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bank {
   private final String bankName="HDFC Bank";
   private static ArrayList<Customer> customerList = new ArrayList<>();
   private static ArrayList<Account> accountList = new ArrayList<>();

   public void addCustomer(Customer c){
        customerList.add(c);
       System.out.println("Customer Added Successfully");
   }

    public Customer findCustomer(int customerId){
       for (int i=0;i<customerList.size();i++){
           if(customerList.get(i).getCustomerId()==customerId){
               return customerList.get(i);
           }
       }
       //return customerList.stream().filter(c->c.getCustomerId()==customerId).toList().getFirst();
       return null;
    }
    public void displayAllCustomer(){
       for (int i=0;i<customerList.size();i++){
           System.out.print("Customer Id: "+customerList.get(i).getCustomerId()+" ");
           System.out.print("Customer Name: "+customerList.get(i).getName()+" ");
           System.out.print("Customer Email: "+customerList.get(i).getEmail()+" ");
           System.out.print("Customer Mobile Number: "+customerList.get(i).getPhone()+" ");
       }
    }

    public void addAccount(Account a){
       accountList.add(a);
       System.out.println("Account Added Successfully");
    }

    public Account findAccount(int accountNumber){
        for (int i=0;i<accountList.size();i++){
            if(accountList.get(i).getAccountNumber()==accountNumber){
                return accountList.get(i);
            }
        }
        return null;
    }

    public void displayAllAccounts(){
        for (int i=0;i<accountList.size();i++){
            System.out.print("Account No. :"+accountList.get(i).getAccountNumber()+" ");
            System.out.print("Account Holder :"+accountList.get(i).getCustomer().getName()+" ");
            System.out.print("Balance :"+accountList.get(i).getBalance()+" ");
        }
//        accountList.forEach(c-> System.out.println("Account No. :"+c.getAccountNumber()+" "+
//                                                            "Account Holder :"+c.getCustomer().getName()+" "+
//                                                            "Balance :"+c.getBalance()+" "));
    }

    public void deposit(int accountno,double amount){
       Account c=findAccount(accountno);
       if (c==null){
           System.out.println("Account Not Found");
           return;
       }
       c.deposit(amount);
    }
    public void Withdraw(int accountno,double amount){
        Account a=findAccount(accountno);
        if (a==null){
            System.out.println("Account Not Found");
            return;
        }
        if(a.getAccountType().equals("SavingAccount")){
            ((SavingAccount) a).withdraw(amount);
        } else if (a.getAccountType().equals("CurrentAccount")) {
            ((CurrentAccount) a).withdraw(amount);
        }
    }

    public void transfer(int fromAccountNo, int toAccountNo, double amount ){
       Account from = findAccount(fromAccountNo);
       Account to = findAccount(toAccountNo);

       if (from==null || to==null){
           System.out.println("Invalid Transaction");
           return;
       }
       boolean flag =false;
       if(from.getAccountType().equals("SavingAccount")){
            flag = ((SavingAccount) from).withdraw(amount);
       } else if (from.getAccountType().equals("CurrentAccount")) {
            flag = ((CurrentAccount) from).withdraw(amount);
       }
       if(flag && to.deposit(amount)){
           System.out.println("Transfer Successful!");
       }else{
           System.out.println("Transaction Failure!");
       }
    }
}
