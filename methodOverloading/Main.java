public class Main {
    public static void main(String[] args)
    {
        awit(69,"CJ");
        awit(69, "awtsu");
    }
    public static void awit(String name,int awit){
        System.out.println("Player " + name +" score is" +awit);
    }
    public static void awit(int awit,String name){
        System.out.println("pelayer " + name +" score is" +awit);
    }
}
//Java checks if an identifier is different from the others from the parameters(their order too) NOT by method
// identifier or return type.

//If 2 methods have the same name and exactly the same parameters but different in order and you want to call one of
//these methods, Java chooses the method where parameter's data type order matches the argument order(Checks from top to bottom).