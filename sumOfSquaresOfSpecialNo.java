//https://leetcode.com/problems/sum-of-squares-of-special-elements/
public class sumOfSquaresOfSpecialNo {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(sumOfSquares(nums));
    }
    static int sumOfSquares(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int n= nums.length;
        int sum=0;
        int j=1;
        for (int i = 0; i < n+1; i++) {
            if (n%j==0 && j<=nums.length){
                sum=sum+nums[i]*nums[i];
            }
            j++;
        }
        return sum;
    }
}
