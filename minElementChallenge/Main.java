/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.

        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.

        -Finally, print the minimum element in the array.

        Tips:
        -Assume that the user will only enter numbers, never letters
        -For simplicity, create a Scanner as a static field to help with data input
        -Create a new console project with the name ?eMinElementChallenge?f

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // ask user how many numbers will they enter, then set the index number to variable count
        //read integers(int count) // gets user inputs and stores it in the array. Count = array index
        //findMin(int[] array) >> returns minimum value in the array
        //call findMin() with the array from readIntegers() as the parameter
        System.out.println("How many array index do you want? ");//gets the parameter count that we'll pass to readIntegers()
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("The lowest number you have entered is: " +findMin(readIntegers(count)));


        //these statement calls are from my original solution
        //int [] inputArrays = readIntegers(count);//set the value of input arrays to user inputs
        //inputArrays = findMin(inputArrays); //set the value of inputArrays to the sorted one(decreasing order) from findMin() function
        //System.out.println("This is the lowest number you've entered: " +inputArrays[inputArrays.length-1] );

    }
    public static int[] readIntegers(int count){
        int[] inputArrays = new int[count];
        System.out.println("Enter" +count +"numbers (int onleh): ");
        for(int i = 0; i < inputArrays.length; i++){
            inputArrays[i] = sc.nextInt();
            sc.nextLine();
        }
        return inputArrays;
    }

    public static int findMin(int[] inputsArray){
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < inputsArray.length; i++){
            if(inputsArray[i] < temp){
                temp = inputsArray[i];
            }
        }
        return temp;
    }
    /*
    public static int[] findMin(int[] inputsArray){     //this is my original solution, using the sorting arrays method
        int[] findMinArray = new int[inputsArray.length];

        //to copy findMinArray to inputsArray NOT referencing
        for(int i = 0; i < findMinArray.length; i++){
            findMinArray[i] = inputsArray[i];
        }

        //this is the same as the while and for loops we used for sorting arrays, the idea is, we'll return the last
        //index from the array since it's in decreasing order. Hence, the minimum value index from the array
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
                for(int i = 0; i < findMinArray.length-1; i++){
                    if(findMinArray[i] < findMinArray[i+1]){
                        temp = findMinArray[i];
                        findMinArray[i] = findMinArray[i+1];
                        findMinArray[i+1] = temp;

                        flag = true;
                    }
                }
        }
        return findMinArray;
    }
     */

}