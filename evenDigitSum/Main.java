//Write a method named getEvenDigitSum with one parameter of type int called number. The method should
//return the sum of the even digits within the number. If the number is negative, the method should
//return -1 to indicate an invalid value.
//
//EXAMPLE INPUT/OUTPUT:
//* getEvenDigitSum(123456789); ? should return 20 since 2 + 4 + 6 + 8 = 20
//* getEvenDigitSum(252); ? should return 4 since 2 + 2 = 4
//* getEvenDigitSum(-22); ? should return -1 since the number is negative

public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(455552222));
    }
    public static int getEvenDigitSum(int num){
        if(num < 0){
            return -1;
        }
        int sum = 0;
        while(num != 0){
        //for(;num != 0; num /= 10){ // I'm not confident with num != 0 being tested before discarding the last digit
            if( ((num % 10) % 2) == 0){
                sum += num % 10;
            }
            num /= 10;
        }
        return sum;
        //get last digit if it is even >> if( (n % 2) == 0)
        //sum += n % 10
    }
}