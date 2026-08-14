public class BaseBurger {
    private String rollType;
    private String meat;
    private String name;
    private int basePrice;

    //additions - not included in constructor
    private static int lettuce = 1;
    private static int tomato =  2;
    private static int carrot =  3;
    private static int chili =   4;

    //Constructors
    BaseBurger(String rollType, String meat, int basePrice, String name){
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }
    BaseBurger(String rollType, String meat, int price){
        this(rollType,meat,price, "Angel's Burger");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printToBuy(String addition1, String addition2, String addition3, String addition4){
        greetingsInfos();
        System.out.println("Base Burger Price= $" +this.basePrice
                    +"\nAdditionals: ");


        for(int i = 1; i <= 4; i++){
            String add;//to take the parameters one by one

            //set string add to each parameter one at a time to process in order
            if(i == 1){
                add = addition1;
            }
            else if(i == 2){
                add = addition2;
            }
            else if(i == 3){
                add = addition3;
            }
            else{
                add = addition4;
            }

            //to print respective sentences and add price of additionals to basePrice
            if(add == "lettuce"){
                    System.out.println(add +"= $" +this.lettuce);
                    basePrice += this.lettuce;
            }
            else if (add == "tomato") {
                    System.out.println(add +"= $" +this.tomato);
                    basePrice += this.tomato;
            }
            else if(add == "carrot"){
                System.out.println(add +"= $" +this.carrot);
                basePrice += this.carrot;
            }
            else if(add == "chili"){
                System.out.println(add +"= $" +this.chili);
                basePrice += this.chili;
            }
        }
        System.out.println("Grand Total : " +this.basePrice);
    }
    //method overloading for printToBuy()
    public void printToBuy(){
        printToBuy("","","","");
    }
    public void printToBuy(String addition1){
        printToBuy(addition1, "","","");
    }
    public void printToBuy(String addition1, String addition2){
        printToBuy(addition1, addition2, "","");
    }
    public void printToBuy(String addition1, String addition2, String addition3){
        printToBuy(addition1, addition2, addition3, "");
    }
    //5th and 6th parameter will not be passed to 4-parameter printToBuy
    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5){
        System.out.println("You are ordering a base Burger, only 4 additionals are allowed.\nYour order is now cancelled");
    }
    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5, String hbaddition6){
        System.out.println("You are ordering a base Burger, only 4 additionals are allowed.\nYour order is now cancelled");
    }

    public int getBasePrice(){return this.basePrice;}

    public static int getLettuce() {
        return lettuce;
    }

    public static int getTomato() {
        return tomato;
    }

    public static int getCarrot() {
        return carrot;
    }

    public static int getChili() {
        return chili;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    //greetings and prints roll type, meat and name of burger. Will be called
    // by printToBuy()
    public void greetingsInfos(){
        System.out.println("Wecome to Angel's Burger!"
                            +"\nYou have ordered: " +this.name
                            +"\nRoll Type: " +this.rollType
                            +"\nMeat: " +this.meat
                            +"\n\n//////////////////////////////////////////////////////////////////////////////////////////");
    }
}
