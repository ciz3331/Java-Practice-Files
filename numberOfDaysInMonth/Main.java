//NOTE:  Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution.
//
//Write another method getDaysInMonth with two parameters month and year. Both of type int.
//
//If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1.
//
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days
//in month 2 (February). You should check if the year is a leap year using the method isLeapYear described above.
//
//Examples of input/output:
//* getDaysInMonth(1, 2020); ? should return 31 since January has 31 days.
//* getDaysInMonth(2, 2020); ? should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//* getDaysInMonth(2, 2018); ? should return 28 since February has 28 days if it's not a leap year and 2018 is not
// a leap year.
//* getDaysInMonth(-1, 2020); ? should return -1 since the parameter month is invalid.
//* getDaysInMonth(1, -2020); ? should return -1 since the parameter year is outside the range of 1 to 9999.
//
//HINT: Use the switch statement.
//
//NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2000));
        System.out.println(isLeapYear(2020));

        //if((month < 1 || month > 12) || (year < 1 || year > 9999))  // (month < 1 or month > 12) OR (year < 1 and year > 99999)
        //if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999))  // 1<=month<=12 inclusive && 1<=year<=9999 inclusive (inclusive mathematically means &&)
    }

    public static boolean isLeapYear(long year){
        if(year >= 1 && year <= 9999) {             //determines first if year is in interval 1 to 9999
            if((year % 4) == 0){                    //divisible by 4
                if(((year % 100) == 0) && ((year % 400) != 0)){             //divisible by 100 and not by 400
                    return false;}
                else
                    return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {// (month < 1 or month > 12) AND (year < 1 and year > 99999)
            return -1;
        }
        else if(isLeapYear(year)){
            switch(month){
                case 2:
                    return 29;
                //break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                //break;
                case 4: case 6: case 9: case 11:
                    return 30;
                //break;
                default:
                    return -1;
                //break;
            }}
        else if(isLeapYear(year) == false){
            switch(month){
                case 2:
                    return 28;
                //break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                //break;
                case 4: case 6: case 9: case 11:
                    return 30;
                //break;
                default:
                    return -1;
                //break;
            }}
        else{
            return -1;
        }
    }
}

//1<month<12 == return -1
//1<year<9999 == return -1
//January, March, May, July, August, October, and December == 31 days
//April, June, September, and November == 30 days
//feb = 29 days if leap year, 28 otherwise