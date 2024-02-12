//https://leetcode.com/problems/powx-n/
//Its easy for understanding but the logic is something I want tol earn.
public class powerMath {
    public static void main(String[] args) {
       double x = 2.00000;
       int n = -2;
        System.out.println(myPow(x,n));

    }
    public static double myPow(double x, int n) {
        if(n>=0)
        {
            return power(x,n);
        }
        else
            return (1/power(x,n*-1));

    }
    public static double power(double x,int n)
    {
        if(n==0) return 1;
        if(n==1) return x;

        if(n%2==0){
            double ans =power(x,n/2);
            return ans*ans;
        }
        else{
            double ans =power(x,n/2);
            return ans*ans*x;
        }
    }
}
