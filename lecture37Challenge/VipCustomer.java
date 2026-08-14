// Represents a VIP customer with a name, credit limit, and email address.
// Demonstrates constructor overloading: the class can be built with 0, 2, or
// 3 arguments, and the simpler constructors chain to the 3-parameter one
// using default values for anything not provided.
public class VipCustomer {
    private String Name;
    private String CreditLimit;
    private String EmailAddress;

    //constructors
    public VipCustomer(String name, String creditLimit, String emailAddress){
        System.out.println("You called constructor with 3 parameters");
        this.Name = name;
        this.CreditLimit = creditLimit;
        this.EmailAddress = emailAddress;
    }
    public VipCustomer(){
        this("default Name", "default Credit Limit", "default emailAddress");
        System.out.println("You called constructor with 0 parameters");
    }
    public VipCustomer(String name, String creditLimit){
        this(name, creditLimit, "default email address" );
        System.out.println("You called constructor with 2 parameters, email address is set to default");
    }


    //getters
    public String getName(){
        return this.Name;
    }
    public String getCreditLimit(){
        return this.CreditLimit;
    }
    public String getEmailAddress(){
        return this.EmailAddress;
    }
}
