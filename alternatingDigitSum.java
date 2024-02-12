//https://leetcode.com/problems/alternating-digit-sum/description/
public class alternatingDigitSum {
    public static void main(String[] args) {
        int n= 10;
        System.out.println(alternateDigitSum(n));
    }
    static int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;
        if (findsize(n)%2==0){
            sign=0;
        }
        while(n>0){
            if(sign==1){
               sum=sum+n%10;
               sign=0;
            }
            else{
                sum=sum-n%10;
                sign = 1;
            }
            n=n/10;
        }
        return sum;
    }
    static int findsize(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
