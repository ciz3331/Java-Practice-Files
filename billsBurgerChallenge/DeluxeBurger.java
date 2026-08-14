public class DeluxeBurger extends BaseBurger{
    private int chips = 25;
    private int drinks = 24;

    DeluxeBurger(String rollType, String meat, int price, String name){
        super(rollType, meat, price, name);
    }
    DeluxeBurger(String rollType, String meat, int price){
        this(rollType, meat, price, "Angel's deluxe burger w/ Chips and Drinks");
    }


    public void printToBuy(){
        super.greetingsInfos();
        System.out.println("Base Burger Price= $" +super.getBasePrice()
                            +"\nDeluxe Chips = $" +this.chips
                            +"\nDeluxe Drinks = $" +this.drinks
                            +"\nGrand Total = " +(super.getBasePrice() +this.chips +this.drinks) );
    }
    //Method Overloading
    public void printToBuy(String addition1){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
    public void printToBuy(String addition1, String addition2){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
    public void printToBuy(String addition1, String addition2, String addition3){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
    @Override
    public void printToBuy(String addition1, String addition2, String addition3, String addition4){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5, String hbaddition6){
        System.out.println("Deluxe burger automatically adds Chips and Drinks as additionals. No other additionals are allowed!"
                +"\nYour order is now canlled");
    }
}
