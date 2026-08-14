//Write a method named hasSharedDigit with two parameters of type int. Each
//number should be within the range of 10 (inclusive) - 99 (inclusive). If one
//of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both
//numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//EXAMPLE INPUT/OUTPUT:
//* hasSharedDigit(12, 23); ? should return true since the digit 2 appears in both numbers
//* hasSharedDigit(9, 99); ? should return false since 9 is not within the range of 10-99
//* hasSharedDigit(15, 55); ? should return true since the digit 5 appears in both numbers

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(-12,75));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }
        int A1 = 0, A2 = 0, B1 = 0, B2 = 0;
        //will create loop each both num1 and num2
        A1 = num1 % 10;
        //while(num1 != 0){ // we don't need loops in this case since the number of digits per number is only 2.
            A2 = (num1 /= 10) % 10;
        //}
        B1 = num2 % 10;
        //while(num2 != 0){
            B2 = (num2 /= 10) % 10;
        //}
        if((A1 == B1) || (A1 == B2) || (A2 == B1) || (A2 == B2)){
            return true;
        }
        return false;
    }
}