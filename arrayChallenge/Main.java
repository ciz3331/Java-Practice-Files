// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] mainArray = getIntegers(5);
        printArray( sortIntegers(mainArray));

    }

    //this function will return an array of user inputs
    public static int[] getIntegers(int x) {
        System.out.println("Enter " + x + " numbers: ");
        int[] inputsArray = new int[x];

        for (int i = 0; i < x; i++) {
            inputsArray[i] = sc.nextInt();
            sc.nextLine();
        }
        return inputsArray;
    }

    public static void printArray(int[] mainArray) {
        System.out.println("You have entered: (in decreasing order ");
        for (int i = 0; i < mainArray.length; i++) {
            System.out.print(mainArray[i] + " ");
        }
    }
    //sorts the parameter array in decreasing order
    public static int[] sortIntegers(int[] mainArray) {
        int[] sortArray = new int[mainArray.length];
        sortArray = mainArray;

        //boolean flag and temporary variable
        int temp;
        boolean flag = true;

        while(flag){
            flag = false;

                //for loop to check the whole array once
                for(int i = 0; i < sortArray.length-1; i++){
                    if(sortArray[i] < sortArray[i+1]){
                        temp = sortArray[i];
                        sortArray[i] = sortArray[i+1];
                        sortArray[i+1] = temp;

                        //once this for loop is done checking the whole array once, it will go back to the while statement
                        //on top since we've set the flag to true in this loop. If ever the if-statement under this for loop won't be true
                        //in a whole session of checking the
                        //whole array, then we're done and the integer is sorted out already. Hence, this "flag = true statement
                        //won't be executed, ending the while-loop above.
                        flag = true;
                    }
                }
        }



        return sortArray;

    }

}


















/*
    public static int[] sortIntegers(int[] mainArray){
        int greater = 0;
        int lesser = 0;
        //int sort = 0;
        //int[] sortArray = new int[sort];
        int[] greaterArray = new int[greater];
        int[] lesserArray = new int[lesser];

        //sorts out greater and lesser numbers from 1st slot of mainArray
        for(int i = 0; i < mainArray.length; i++){
            if (mainArray[i] < mainArray[i+1]) {

                greater++;
                greaterArray[greater] = mainArray[i];
            }
            else if (mainArray[i] > mainArray[i]){

                lesser++;
                lesserArray[lesser] = mainArray[i+1];
            }
        }

        System.out.println("GreaterArray: " +greaterArray);
        System.out.println("LesserArray: " +lesserArray);
        return greaterArray;
    }

 */
