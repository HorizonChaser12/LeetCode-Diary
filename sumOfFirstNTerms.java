//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
public class sumOfFirstNTerms {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));
    }
    static int sumOfSeries(int n) {
        // code here
       if (n==0){
           return 0;
       }
       else{
           int sum =n*n*n;
           n--;
           return sumOfSeries(n)+sum;
       }
    }
}
