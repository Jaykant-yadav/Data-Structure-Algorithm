package DSA;
import java.util.*;

public class basicMath {
    public static void checkPrime(int num){
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                System.out.println("non-Prime");
            }
        }
        System.out.println("Prime");
    }
    //Sieve of Eratosthenes Algo
    public static int countPrime(int num) {
        boolean isPrime[] = new boolean[num + 1];//[n+1] 
        Arrays.fill(isPrime, true);//n=10 -> [true, true, true...............true+11th times]

        int count = 0;
        for(int i=2; i<num; i++) {//[2, 3, 5, 7] -> 4
            if(isPrime[i]){
                count++;
                for(int j=i*2; j<num; j=j+i){//[2, 4, 6, 8, 10], [9] -> discarded element
                    isPrime[j] = false;
                }
            }
        }
        return count; //10 -> 4
    }
    public static void main(String[] args) {
        int num = 10;
        // checkPrime(num);
        System.out.println(countPrime(num));
    }
}
