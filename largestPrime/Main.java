/*Write a method named getLargestPrime with one parameter of type int named number.
        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
        The method should calculate the largest prime factor of a given number and return it.
        EXAMPLE INPUT/OUTPUT:
        * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
        * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
        * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
        * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        * getLargestPrime (-1); should return -1 since the parameter is negative
        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
        NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
        NOTE: Do not add a main method to the solution code.

 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get it's largest factor: ");
        int num = sc.nextInt();

        System.out.println(num + "'s largest factor (excluding 1 and the number itself) is: " + getLargestPrime(num));
    }

    public static int getLargestPrime(int num) {
        if (num <= 1) {
            return -1;
        }
        int factor = -1;
        for (int i = 2; i < num; i++) {// i = 2 and i < num effectively removes 1 and number itself from the process.
            if ((num % i) == 0) {
                factor = i;
            }
        }
        return factor;//will return -1 if there's no any factor found
    }
}