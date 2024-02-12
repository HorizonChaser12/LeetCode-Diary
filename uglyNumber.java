//https://leetcode.com/problems/ugly-number/description/
public class uglyNumber {
    public static void main(String[] args) {
        int n=1;
        System.out.println(isUgly(n));
    }
    public static boolean isUgly(int n) {
       if (n<=0){
           return false;
       }
       if (n==1){
           return true;
       }
       while (n>=1) {
           n=checkPrime(n);
           if (n==1){
               return true;
           }
       }
       return false;
    }
    static int checkPrime(int n){
        if (n%2==0 ){
            return n/2;
        } else if (n%3==0) {
            return n/3;
        } else if (n%5==0) {
            return n/5;
        }
        else {
            return 0;
        }
    }
}
