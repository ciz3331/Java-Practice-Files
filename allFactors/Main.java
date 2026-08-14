//Write a method named printFactors with one parameter of type int named number. If number
//is < 1, the method should print "Invalid Value". The method should print all factors of
//the number. A factor of a number is an integer which divides that number wholly (i.e.
//without leaving a remainder). For example, 3 is a factor of 6 because 3 fully divides 6
//without leaving a remainder. In other words 6 / 3 = 2.
//
//EXAMPLE INPUT/OUTPUT:
//* printFactors(6); ? should print 1 2 3 6
//* printFactors(32); ? should print 1 2 4 8 16 32
//* printFactors(10); ? should print 1 2 5 10
//* printFactors(-1); ? should print "Invalid Value" since number is < 1
//
//HINT: Use a while or for loop.
//
//NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
//
//For example, the printout for printFactors(10); can be:
//
//1
//2
//5
//10
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number to get its factors: ");
        int num = sc.nextInt();
        printFactors(num);
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        } else {
            // I just wanna try do while loop and continue/break
            int i = 0;
            do {
                i++;
                if (num % i != 0) {
                    continue;
                } else {
                    System.out.println(i);
                }
            } while (i <= num);
        }
    }
}