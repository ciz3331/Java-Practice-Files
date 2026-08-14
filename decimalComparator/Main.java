//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//EXAMPLES OF INPUT/OUTPUT:
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); ? should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(3.175, 3.176); ? should return false since numbers are not equal up to 3 decimal places
//* areEqualByThreeDecimalPlaces(3.0, 3.0); ? should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); ? should return false since numbers are not equal up to 3 decimal places.

import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1754523452343,3.176964567467546567));
        //convertAndPrint(-3.1231567890,-3.1239696966969696969);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum,double secondNum) {
        //multiply the numbers to 100, then convert to string so the decimals will round down
        firstNum *= 100;
        secondNum *= 100;
        int iFirstNum = (int) firstNum;
        int iSecondNum = (int) secondNum;
        String SfirstNum = String.valueOf(iFirstNum);
        String SsecondNum = String.valueOf(iSecondNum);
        //System.out.println(iFirstNum);
        //stem.out.println(iSecondNum);
        if(iFirstNum == iSecondNum){
            return true;
        }else{
            return false;
        }
    }

}

//String.format("%.3f", a))