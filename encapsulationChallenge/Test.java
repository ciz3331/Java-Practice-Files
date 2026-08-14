public class Test {
    private int integer;
    private double doble;

    Test(int integer, double doble){
        this.integer = integer;
        this.doble = doble;

        if(this.integer < this.doble){
            System.out.println("yiz");
        }
        else{
            System.out.println("Nope");
        }
    }


}
