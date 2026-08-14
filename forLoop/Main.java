// This program finds and prints the first 3 prime numbers starting from 1069
// (checking each number one by one and stopping once 3 primes are found).
public class Main {
    public static void main(String[] args) {
        int num = 0;

         for(int i = 1069; num<3; i++){
             if(isPrime(i)){
                 System.out.println(+i +" is a Prime Number");
                 num++;
             }
         }
    }
    public static boolean isPrime(int n){
        if( n <= 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}