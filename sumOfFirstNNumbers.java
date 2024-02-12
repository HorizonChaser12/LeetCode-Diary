//https://www.codingninjas.com/studio/problems/sum-of-first-n-numbers_8876068?leftPanelTabValue=PROBLEM
public class sumOfFirstNNumbers {
    public static void main(String[] args) {
        long n=3;
        System.out.println(sumFirstN(n));
    }
    static long sumFirstN(long n) {
        // Write your code here.
        long i=0;
        long sum=0;
        sum=sumof(n, i, sum);
        return sum;

    }
    static long sumof(long x,long i,long sum){
        if(i==x){
            return sum+i;
        }
        return sumof(x, i+1, sum+i);
    }
}
