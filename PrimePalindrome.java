//https://leetcode.com/problems/prime-palindrome/description/
public class PrimePalindrome {
    public static void main(String[] args) {
        int n=9;
        System.out.println(primePalindromes(n));
    }
    static int primePalindromes(int n) {
        if (n <= 2)
            return 2;
//        Skips the even nos. as they are not prime any ways.
        n = n % 2 == 0 ? n + 1 : n; // Start with the next odd number

        while (true) {
            if (checkPallindrome(n) && checkPrime(n)) {
                return n;
            }
            n += 2; // Move to the next odd number
//            For handling long nos.
            if (n > 10_000_000 && n < 100_000_000) // Skip to the next interval
                n = 100_000_001;
        }
    }
    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean checkPallindrome(int n){
        int real=n;
        int m;
        int temp=0;
        while(n>0){
            m=n%10;
            temp=temp*10+m;
            n=n/10;
            if (temp==real){
                return true;
            }
        }
        return false;
    }
}
