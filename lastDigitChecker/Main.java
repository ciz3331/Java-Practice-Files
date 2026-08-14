/*Write a method named hasSameLastDigit with three parameters of type int.
        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
        EXAMPLE INPUT/OUTPUT:
        * hasSameLastDigit (41, 22, 71); ? should return true since 1 is the rightmost digit in numbers 41 and 71
        * hasSameLastDigit (23, 32, 42); ? should return true since 2 is the rightmost digit in numbers 32 and 42
        * hasSameLastDigit (9, 99, 999); ? should return false since 9 is not within the range of 10-1000
        Write another method named isValid with one parameter of type int.
        The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
        EXAMPLE INPUT/OUTPUT
        * isValid(10); ? should return true since 10 is within the range of 10-1000
        * isValid(468); ? should return true since 468 is within the range of 10-1000
        * isValid(1051); ? should return false since 1051 is not within the range of 10-1000
        NOTE: All methods need to be defined as public static as we have been doing so far in the course.
        NOTE: Do not add a main method to the solution code.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for isValid function: " );
        int num = sc.nextInt();
        System.out.println(num +" is in the boundary of 10 and 1000 (inclusive of bounds):" +isValid(num));

        System.out.println("///////////////////////The next numbers are for hasSameLastDigit function //////////////////////////");
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        System.out.println("2 or 3 of these numbers have the same digits where 10>= numbers <=1000: " +hasSameLastDigit(num1, num2, num3));

    }
    public static boolean hasSameLastDigit( int num1, int num2, int num3){
        if((num1 < 10) || (num1 > 1000) || (num2 < 10) || (num2 > 1000) || (num3 < 10) || (num3 > 1000)){
            return false;
        }
        if( ((num1 % 10) == (num2 % 10)) || ((num1 % 10) == (num3 % 10)) || ((num2 % 10) == (num3 % 10)) ){
            return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if( (num >= 10) && (num <= 1000)){
            return true;
        }
        return false;
    }
}