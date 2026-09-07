import java.util.Random;
import java.util.Scanner;

public class Main{
    static int generateAcountNumber(){
        Random rand = new Random();
        // Range: 10,000,000 to 99,999,999
        int min = 10000000;
        int max = 99999999;
        return rand.nextInt(max - min + 1) + min;
    }

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Bank b=new Bank();
       while(true){
           System.out.println("1. Create Customer");
           System.out.println("2. Create Savings Account");
           System.out.println("3. Create Current Account");
           System.out.println("4. Deposit");
           System.out.println("5. Withdraw");
           System.out.println("6. Transfer");
           System.out.println("7. Check Balance");
           System.out.println("8. Customer Details");
           System.out.println("9. Account Details");
           System.out.println("10. Display All Customers");
           System.out.println("11. Display All Accounts");
           System.out.println("0. Exit");
           System.out.println();
           System.out.println("Enter the Option ");
           int choice=sc.nextInt();
           sc.nextLine();
           switch(choice){
               case 1:
                   System.out.println("Enter Your Name:");
                   String name=sc.nextLine();
                   System.out.println("Enter your Phone Number");
                   String phone=sc.nextLine();
                   System.out.println("Enter Your Email Id");
                   String email=sc.nextLine();
                   Customer c=new Customer(name,phone,email);
                   b.addCustomer(c);
                   break;

               case 2:
                   boolean flag = true;
                   int accNo =0;
                   while(flag){
                       accNo = generateAcountNumber();
                       //checking if this accNo is valid or not using a checker fun which should be present in Account class
                       flag = b.checker(accNo);
                   }
                   System.out.println("Enter Customer id");
                   int custid=sc.nextInt();
                   Customer cust=b.findCustomer(custid);
                   if(cust==null){
                       System.out.println("Customer not present");
                   }else{
                       SavingAccount sa=new SavingAccount(accNo,cust);
                       b.addAccount(sa);
                   }
                   break;

               case 3:
                   boolean flag1 = true;
                   int accountNo =0;
                   while(flag1){
                       accountNo = generateAcountNumber();
                       //checking if this accNo is valid or not using a checker fun which should be present in Account class
                       flag1 = b.checker(accountNo);
                   }
                   System.out.println("Enter Customer id");
                   int customerid=sc.nextInt();
                   Customer customer=b.findCustomer(customerid);
                   if(customer==null){
                       System.out.println("Customer not present");
                   }else{
                       CurrentAccount ca=new CurrentAccount(accountNo,customer);
                       b.addAccount(ca);
                   }
                   break;

               case 4:
                   System.out.println("Enter Account Number : ");
                   int acno=sc.nextInt();
                   System.out.println("Enter Amount");
                   double amount=sc.nextDouble();
                   b.deposit(acno,amount);
                   break;

               case 5:
                   System.out.println("Enter Account Number : ");
                   int accno=sc.nextInt();
                   System.out.println("Enter Amount");
                   double amt=sc.nextDouble();
                   b.Withdraw(accno,amt);
                   break;

               case 6:
                   System.out.println("Enter From Account Number ");
                   int from=sc.nextInt();
                   System.out.println("Enter To Account Number ");
                   int to=sc.nextInt();
                   System.out.println("Enter the Amount ");
                   double ammount=sc.nextDouble();
                   b.transfer(from,to,ammount);
                   break;

               case 7:
                   System.out.println("Enter Account Number ");
                   int acccountNo=sc.nextInt();
                   if (b.getBalance(acccountNo)!=-1){
                       System.out.println("Balance :"+b.getBalance(acccountNo));
                   }
                   break;

               case 8:
                   System.out.println("Enter Customer id");
                   int customerrid=sc.nextInt();
                   Customer customerr=b.findCustomer(customerrid);
                   if(customerr==null){
                       System.out.println("Customer not present");
                   }else{
                      customerr.displayCustomerDetails();
                   }
                   break;

               case 9:
                   System.out.println("Enter Account Number");
                   int acoountno=sc.nextInt();
                   Account acc=b.findAccount(acoountno);
                   if (acc==null){
                       System.out.println("Invalid Account");
                   }else {
                       acc.displayAccountDetails();
                   }
                   break;

               case 10:
                   System.out.println("The total Customers are :");
                   b.displayAllCustomer();
                   break;

               case 11:
                   System.out.println("The total Accounts are :");
                   b.displayAllAccounts();
                   break;

               case 0:
                   return ;
           }
       }
    }
}