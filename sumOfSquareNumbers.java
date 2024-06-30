//https://leetcode.com/problems/sum-of-square-numbers/description/?envType=daily-question&envId=2024-06-17
public class sumOfSquareNumbers {
//    The intuition can be understood with an example: Lets take a number 36 which has a sqrt of 6. So we will check for the sum of squares below 6 as we know anything above 6 can never result in 36 as square. So keeping 6 as the upper limit and 0 as the lower we iterate from both ends adjusting the values till we reach the solution.
    public static void main(String[] args) {
        int c = 4;
        System.out.println(judgeSquareSum(c));
    }
    static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (int)Math.sqrt(c);
        while(start<=end){
            long sum = start*start + end*end;
            if (sum==c){
                return true;
            }
            else if (sum>c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
