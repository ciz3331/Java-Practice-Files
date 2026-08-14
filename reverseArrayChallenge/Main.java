import java.util.Arrays;
import java.util.Scanner;

/*
-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ?eReverseArrayChallenge?f
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("How many inputs do you want? ");
      int indexCount = sc.nextInt();
      sc.nextLine();
      int[] myArray = getInputArray(indexCount);
      System.out.println("You have entered: " +Arrays.toString(myArray));
      reverse(myArray);



    }
    public static int[] getInputArray(int count){
        int [] tempArray = new int[count];
        System.out.println("Input the array indexes: ");
        for(int i = 0; i < tempArray.length; i++){
            tempArray[i] = sc.nextInt();
            sc.nextLine();
        }
        return tempArray;
    }

    public static void reverse(int[] myArray){
        int temp = 1;
        int[] reverse = new int[myArray.length];


        for(int i = 0; i < reverse.length; i++){
            reverse[i] = myArray[myArray.length - temp];
            temp++;
        }
        System.out.println(Arrays.toString(reverse));
        //Index starts at 0

        // i=0; temp =1 >> gets reverse[0] = myArray[5-1]//
            //                  index0      index4(last index)
        // i=1; temp =2 >> gets reverse[1] = myArray[5-2]
        //                      index1       index3(second to the last)
        // i =2; temp =3 >> gets reverse[2] = myArray[5-3]
        //                       index2        index2(third to the last)
        // i =3; temp = 4 >> gets reverse[3] = myArray[5-4]
        //                      index3          index1(second to the last)
        // i =4; temp = 5 >> gets reverse[4] = myArray[5-5]
        //                        index4          index(1st index)





    }
    /*
    public static void reverse(int[] myArray){
        int[] reversedArray = new int[myArray.length];
        int ikotWhile = myArray.length;
        //for(int j = 0; j < reversedArray.length; j++){    // the 1st index will be put to the last index in every loop
        for(int j = 0; j < reversedArray.length -1; j++){

            int temp;
            for (int i = 0; i < myArray.length - 1; i++) { //i sets the index we're swapping
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
            }

            reversedArray[j] = myArray[ikotWhile-1]; //reversed array will get the last index
            ikotWhile--;
       }
       System.out.println("Reverse array is: " +Arrays.toString(reversedArray));
    }
     */



}