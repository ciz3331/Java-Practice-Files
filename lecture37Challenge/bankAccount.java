// Represents a bank account for a customer, storing their personal details
// and balance, and allowing deposits and withdrawals.
public class bankAccount {
    private int AccountNumber;
    private int Balance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    //set and get for account number
    public void setAccountNumber(int accountNumber){
        this.AccountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.AccountNumber;
    }

    //set and get for customer name
    public void setCustomerName(String customerName){
        this.CustomerName = customerName;
    }
    public String getCustomerName(){
        return this.CustomerName;
    }

    //set and get for Email
    public void setEmail(String email){
        String lowerCaseEmail = email.toLowerCase();
        this.Email = lowerCaseEmail;
    }
    public String getEmail(){
        return this.Email;
    }

    //set and get for phone number
    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.PhoneNumber;
    }

    //set and get for balance
    public void setBalance(int balance){
        this.Balance = balance;
    }
    public int getBalance(){
        return this.Balance;
    }

    //customer deposit and withdraw funds
    public void deposit(int pasokMoney){
       this.Balance += pasokMoney;
       System.out.println();
       System.out.println("System Message: You have deposited: " +pasokMoney +". Your new balance is: " +this.Balance);
    }

    public void withdraw(int waleyMoney){
        if(this.Balance < waleyMoney){
            System.out.println();
            System.out.println("Insufficient Funds!");
        }
        else{
            this.Balance -= waleyMoney;
            System.out.println();
            System.out.println("System Message: You have withdrawn: " +waleyMoney +". Your new balance is: " +this.Balance);
        }
    }





}
