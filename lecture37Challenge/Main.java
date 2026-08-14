// Entry point of the program. Creates VipCustomer objects using each of the
// three available constructors (0, 2, and 3 parameters) to demonstrate
// constructor overloading and chaining, printing each customer's details
// after creation.
public class Main {
    public static void main(String[] args) {
        /*bankAccount CJ = new bankAccount();//Cj is the object
        //sets
        CJ.setBalance(69);
        CJ.setAccountNumber(69696969);
        CJ.setCustomerName("CJ Fogi");
        CJ.setEmail("CJpogingpogi@gmail.com");
        CJ.setPhoneNumber("+639-123456");

        //gets
        System.out.println("Customer name: " +CJ.getCustomerName());
        System.out.println("Account Number: " +CJ.getAccountNumber());
        System.out.println("Total Balance: " +CJ.getBalance());
        System.out.println("Email: " +CJ.getEmail());
        System.out.println("Phone Number: " +CJ.getPhoneNumber());

        //withdraw and deposit
        System.out.println("/////////////////////////////////////");
        System.out.println();
        CJ.deposit(1);

        System.out.println("Customer CJ will now try to withdraw 69,000 Petot.");
        CJ.withdraw(69_000);
        System.out.println("/////////////////////////////////////");
        System.out.println();

        System.out.println("Customer CJ is now furious but still Fogi, he will now try");
        System.out.println("to withdraw 69 Petot. ");
        CJ.withdraw(69);
        */

        //For lecture 38
        VipCustomer CjPogi0 = new VipCustomer();
        System.out.println();
        System.out.println("0 parameter name: " +CjPogi0.getName());
        System.out.println("0 parameter credit Limit:" +CjPogi0.getCreditLimit());
        System.out.println("0 parameter email address:" +CjPogi0.getEmailAddress());
        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        VipCustomer CjPogi2 = new VipCustomer("CJ Pogi Forevah", "6969");
        System.out.println();
        System.out.println("2 parameter name: " +CjPogi2.getName());
        System.out.println("2 parameter credit Limit:" +CjPogi2.getCreditLimit());
        System.out.println("2 parameter email address:" +CjPogi2.getEmailAddress());
        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        VipCustomer CjPogi3 = new VipCustomer("CJ Hokage", "-69", "brokenwallet@heartheartmail.com");
        System.out.println();
        System.out.println("3 parameter name: " +CjPogi3.getName());
        System.out.println("3 parameter credit Limit:" +CjPogi3.getCreditLimit());
        System.out.println("3 parameter email address:" +CjPogi3.getEmailAddress());
        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");




    }



}