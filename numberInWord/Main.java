//Write a method called printnumberberInWord. The method has one parameter numberber which is the whole
//numberber. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter
//numberber is 0, 1, 2, .... 9 or other for any other numberber including negative numberbers. You can use
//if-else statement or switch statement whatever is easier for you.
//
//NOTE: Method printnumberberInWord needs to be public static for now, we are only using static
//methods.

public class Main {
    public static void main(String[] args) {
        testCaller("IfElse");
        testCaller("Switch");
        testCaller("Pogi ako");
    }
    public static void printnumberInWordSwitch(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO") ;
                break;
            case 1:
                System.out.println("ONE") ;
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX") ;
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void printnumberInWordIfElse(int number){
            if (number == 0) {
                System.out.println("ZERO");
            } else if (number == 1) {
                System.out.println("ONE");
            } else if (number == 2) {
                System.out.println("TWO");
            } else if (number == 3) {
                System.out.println("THREE");
            } else if (number == 4) {
                System.out.println("FOUR");
            } else if (number == 5) {
                System.out.println("FIVE");
            } else if (number == 6) {
                System.out.println("SIX");
            } else if (number == 7) {
                System.out.println("SEVEN");
            } else if (number == 8) {
                System.out.println("EIGHT");
            } else if (number == 9) {
                System.out.println("NINE");
            } else {
                System.out.println("OTHER");
            }
        }

        public static void testCaller(String teknik){
        switch(teknik){
            case "IfElse":
                printnumberInWordIfElse(0);
                printnumberInWordIfElse(1);
                printnumberInWordIfElse(2);
                printnumberInWordIfElse(3);
                printnumberInWordIfElse(4);
                printnumberInWordIfElse(5);
                printnumberInWordIfElse(6);
                printnumberInWordIfElse(7);
                printnumberInWordIfElse(8);
                printnumberInWordIfElse(9);
                printnumberInWordIfElse(-69);
                printnumberInWordIfElse(69);
                break;
            case "Switch":
                printnumberInWordSwitch(0);
                printnumberInWordSwitch(1);
                printnumberInWordSwitch(2);
                printnumberInWordSwitch(3);
                printnumberInWordSwitch(4);
                printnumberInWordSwitch(5);
                printnumberInWordSwitch(6);
                printnumberInWordSwitch(7);
                printnumberInWordSwitch(8);
                printnumberInWordSwitch(9);
                printnumberInWordSwitch(-69);
                printnumberInWordSwitch(69);
                break;
            default:
                System.out.println("Ipinagbabawal na teknik!");
                break;
        }

        }
}