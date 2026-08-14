import java.util.*;

// This program reads 5 numbers from the user and prints their average
// (the sum of all the numbers divided by how many there are).
// Example: inputs 1, 2, 3, 4, 5 -> sum = 15 -> average = 15 / 5 = 3.0

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] myInputArray = new double[5];
        getInputArray(myInputArray);
    }
    public static void getInputArray(double[] inputArray){
        double total = 0;
        System.out.println("Type " +inputArray.length +" number/s: ");

        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = sc.nextDouble();
            sc.nextLine();

            total += inputArray[i];
        }
        System.out.println(total/(inputArray.length));

    }
}