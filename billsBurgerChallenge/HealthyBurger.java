public class HealthyBurger extends BaseBurger{
    private int pickles = 5;
    private int avocado = 6;

    HealthyBurger(String meat, int price, String name){
        super("Brown eye bread roll", meat, price, name);
    }
    HealthyBurger(String meat, int price) {
        this(meat, price, "Angel's Healthy Burger");
    }


    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5, String hbaddition6){
        super.greetingsInfos();
        System.out.println("Base Burger Price = $" +super.getBasePrice()
                +"\nAdditionals: ");
        int grandTotal = super.getBasePrice();


        for(int i = 1; i <= 6; i++){
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
            else if(i == 4){
                add = addition4;
            }
            else if(i == 5){
                add = hbaddition5;
            }
            else{
                add = hbaddition6;
            }

            //to print respective sentences and add price of additionals to basePrice
            if(add == "lettuce"){
                System.out.println(add +"= $" +super.getLettuce());
                grandTotal += super.getLettuce();
            }
            else if (add == "tomato") {
                System.out.println(add +"= $" +super.getTomato());
                grandTotal += super.getTomato();
            }
            else if(add == "carrot"){
                System.out.println(add +"= $" +super.getCarrot());
                grandTotal += super.getCarrot();
            }
            else if(add == "chili"){
                System.out.println(add +"= $" +super.getChili());
                grandTotal += super.getChili();
            }
            else if(add == "pickles"){
                System.out.println(add +"= $" +this.pickles);
                grandTotal += this.pickles;
            }
            else if(add == "avocado"){
                System.out.println(add +"= $" +this.avocado);
                grandTotal += this.avocado;
            }
        }
        System.out.println("Grand Total : " +grandTotal);
    }
    //method overloading for printToBuy()
    public void printToBuy(){
        printToBuy("","","","","","");
    }
    public void printToBuy(String addition1){
        printToBuy(addition1, "","","","", "");
    }
    public void printToBuy(String addition1, String addition2){
        printToBuy(addition1, addition2, "","", "", "");
    }
    public void printToBuy(String addition1, String addition2, String addition3){
        printToBuy(addition1, addition2, addition3, "", "", "");
    }
    @Override
    public void printToBuy(String addition1, String addition2, String addition3, String addition4) {
        printToBuy(addition1, addition2, addition3, addition4, "", "");
    }
    public void printToBuy(String addition1, String addition2, String addition3, String addition4, String hbaddition5){
        printToBuy(addition1, addition2, addition3, addition4, hbaddition5, "");
    }
}
