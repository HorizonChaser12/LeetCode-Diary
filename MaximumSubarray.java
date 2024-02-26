//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-7 ,-8 ,-16 ,-4 ,-8 ,-5 ,-7 ,-11 ,-10 ,-12 ,-4 ,-6 ,-4 ,-16 ,-10 };
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
//      Basically even if we have a sum in the negative space we know that 0 is still greater than any negative number so we just entirely allocate the sum to 0 because of this reason.
        int R=0;
        long max=Long.MIN_VALUE;
        if (nums.length==1){
            return nums[0];
        }
        int sum=0;
        while(R<nums.length){
            sum=sum+nums[R];
            if(sum>max){
                max=sum;
            }
            if (sum < 0) {
                sum = 0;
            }
            R++;
        }
        return (int)max;
    }
}
