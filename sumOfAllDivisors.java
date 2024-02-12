//https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?leftPanelTabValue=PROBLEM
public class sumOfAllDivisors {
    public static void main(String[] args) {
        int n=3;
        System.out.println(sumOfAllDivisorss(n));
    }
    static int sumOfAllDivisorss(int n){
        // Write your code here.
        int sum=0;
        for(int i=1;i<=n;i++){
            for (int j = 1; j * j <= i; j++) {
                if(i%j==0){
                    if (i / j == j){
                        sum += j;
                    }
                    else{
                        sum += j + i / j;
                    }

                }
            }
        }
        return sum;
    }
}
