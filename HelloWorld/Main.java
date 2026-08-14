// This program prints a greeting, then does a small arithmetic exercise:
// it computes three numbers, sums them, subtracts the sum from 1000,
// and prints the final result.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myFirstNumber = (10 + 5) +(2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myTotalLess1k = 1000 - myTotal;

        System.out.println(myTotalLess1k);
    }
}