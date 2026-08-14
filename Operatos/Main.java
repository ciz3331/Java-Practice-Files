// This program does an arithmetic exercise on two numbers, then demonstrates
// single-line if statements (no braces) and the boolean NOT operator.

// firstNum and secondNum are the two starting values

// thirdNum = ((firstNum + secondNum) * 25) % 40
// i.e. add the two numbers, multiply by 25, then take the remainder of
// dividing by 40 (modulo)

// Prints thirdNum

// If thirdNum is 20 or less, print a warning message
// (note: no braces, so only the very next line belongs to this if)

// bool is a simple flag set to false

// If bool is NOT true (i.e. bool is false), print a message
// (again, no braces - only the next line is controlled by this if)
public class Main {
    public static void main(String[] args) {

        double firstNum = 20;
        double secondNum = 80;

        double thirdNum = ((firstNum + secondNum) * 25) % 40;
        System.out.println(thirdNum);
        if(thirdNum <= 20)
            System.out.println("Total was over the limit");

        boolean bool = false;
        if(!bool)
            System.out.print("bool is false");
    }
}