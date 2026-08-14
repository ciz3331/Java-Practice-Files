// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            sum += number;
            System.out.println("Even number " +number);
            if(count >= 5){
                break;
            }
        }
        System.out.println(sum);
    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}