//https://www.codingninjas.com/studio/problems/megaprime-numbers_893339
public class megaPrime {
    public static void main(String[] args) {
        int left=2;
        int right=15;
        System.out.println(countMegaPrimeNumber(left,right));
    }
    static int countMegaPrimeNumber(int left, int right)
    {
        // Write your code here.
        int count=0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
               if (checkDigitsPrime(i)){
                   count++;
               }
            }
        }
        return count;
    }
    static boolean checkDigitsPrime(int n){
        while(n>0){
            if (isPrime(n%10)){
                n=n/10;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
