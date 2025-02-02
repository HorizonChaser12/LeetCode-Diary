public class Pow {
    public static void main(String[] args) {
        double x =2.00000;
        int n=-2;
        System.out.println(myPow(x,n));
    }
    static double myPow(double x, int n) {
        double ans = x;
        if (n>0){
            return recursivePositive(x,n,ans);
        }
        else{
            return recursiveNegative(1/x,Math.abs(n),1/ans);
        }
    }
    static double recursivePositive(double x, int n,double ans){
        if(n==1){
            return ans;
        }
        ans*=x;
        n--;
        return recursivePositive(x,n,ans);
    }
    static double recursiveNegative(double x, int n,double ans){
        if(n==1){
            return ans;
        }
        ans*=x;
        n--;
        return recursiveNegative(x,n,ans);
    }
}
