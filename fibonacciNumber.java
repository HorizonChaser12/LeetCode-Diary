//https://leetcode.com/problems/fibonacci-number/description/
public class fibonacciNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    static int fib(int n) {
        if (n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
