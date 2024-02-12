//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
    static int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int fast=0;
        int slow=0;
        while(fast<n){
            sum+=nums[fast];
            while (target <= sum){
                min=Math.min(min,fast-slow + 1);
                sum-=nums[slow];
                slow++;
            }
            fast++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
