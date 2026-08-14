/* Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.

Before the user enters the number, print the message "Enter number:"

If the user enters an invalid number, break out of the loop and print the minimum
and maximum number.

Hint:
    User an endless while loop
Project Name: minimumAndMaximumChallenge
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max;

        System.out.print("Enter a number: ");
        if(!sc.hasNextInt()){
            printIfFirstInputInvalid();
        }
        else {
            int firstInput = sc.nextInt();
            min = firstInput;
            max = firstInput;
                //took the first input for value of min and max, will now start the loop
                while(true){
                    System.out.print("Enter a number: ");
                    if(!sc.hasNextInt()){
                        printIfInvalidInput(min, max);
                        break;
                    }
                    else{
                        int input = sc.nextInt();
                        if(input < min){
                            min = input;
                        }
                        else if(input > max){
                            max = input;
                        }
                        sc.nextLine();//this line is necessary, but the program still works fine without this line. IDK why
                    }
                }
            }
            sc.close();
        }
    public static void printIfInvalidInput(int min, int max){
        System.out.println("Invalid Value!");
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("You entered a minimum of: " +min);
        System.out.println("You entered a maximum of: " +max);
    }
    public static void printIfFirstInputInvalid(){
        System.out.println("Invalid Value!");
        System.out.println("////////////////////////////////////////////////////////////////////////////////");
        System.out.println("First input is invalid: no minimum or maximum number taken. ");
    }

}