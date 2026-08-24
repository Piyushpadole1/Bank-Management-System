public class Main{
   public static void main(String[] args) {
        Customer customer1=new Customer(
                101,
                "Piyush",
                "9850770976",
                "piyushpadole1432@gmail.com");

        customer1.displayCustomerDetails();
       System.out.println();
        customer1.setName("Satish");
        customer1.setEmail("satishpadole1234@gmail.com");
        customer1.setPhone("7066052451");
       customer1.displayCustomerDetails();
    }
}