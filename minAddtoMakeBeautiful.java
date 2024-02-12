//https://leetcode.com/problems/minimum-addition-to-make-integer-beautiful/description/
public class minAddtoMakeBeautiful {
    public static void main(String[] args) {
        long n=88;
        int target=6;
        System.out.println(makeIntegerBeautiful(n,target));
    }
    static long makeIntegerBeautiful(long n, int target) {
        long ans=n;
        long k=1;
        while(digitsum(ans)>target){
            ans=ans/10+1;
            k=k*10;
        }
        return k*ans-n;
    }
    static long digitsum(long n){
        long sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
