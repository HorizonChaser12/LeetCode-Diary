//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class guessNumberHigherOrLower{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(guessNumber(n));
    }

    public static int guessNumber(int n) {
       int start=0;
       int end=n;
       int mid=0;
       if (guess(n)==0){
           return n;
       }
       while (end>=start){
           mid=start+(end-start)/2;
           if (guess(mid)==0){
               return mid;
           }
           if (guess(mid)==-1){
               end=mid-1;
           } else if (guess(mid)==1) {
               start=mid+1;
           }
       }
       return mid;
    }
    static int guess(int n){
        int pick = 1;
        if (n>pick){
            return -1;
        } else if (n<pick) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
