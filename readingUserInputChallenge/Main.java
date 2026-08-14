/* Read 10 numbers from the console entered by the user and print the  sum of those
numbers. Create a Scanner.

User the hasNextInt() method from the scanner to check if the user has entered an int value.

If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you
have read 10 numbers.

User the nextInt() method to get the number and add it to the sum.

Before the user enters each number, print the message "Enter number #x: " where x represents the count,
i.e. 1, 2, 3, 4, etc.

For example, the first message printed to the user would be "Enter number #1:", the next "Enter
number #2:" and so on.

Hint:
    Use a while loop
    User a counter variable for counting valid numbers.
    Close the scanner after you don't need it anymore.
    Create a project with the name readingUserInputChallenge.

*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        sumOfInputs();
    }

    public static void sumOfInputs() {
        Scanner sc = new Scanner(System.in);
        int i = 1, sum = 0, counter = 0;

        while(i <= 10) {
            //to Promp for input

            System.out.print("Enter number #" + i + ": ");

            if (sc.hasNextInt()) {
                sum += sc.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
            i++;

        }
            System.out.println("Count of valid numbers entered: " +counter);
            System.out.println("The sum of the numbers you've entered is: " + sum);
            sc.close();
    }
}
