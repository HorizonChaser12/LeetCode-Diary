//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
public class maximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {9,1,3,4};
        System.out.println(maxAscendingSum(nums));
    }
    static int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max=Math.max(nums[i],max);
        }
        for (int i = 0; i < nums.length-1; i++) {
            int sum=0;
            if (nums[i]<nums[i+1]){
                int j = i;
                sum+=nums[j];
                while (j<nums.length-1 && nums[j]<nums[j+1]){
                    sum+=nums[j+1];
                    j++;
                }
                max=Math.max(sum,max);
                i=j;
            }
        }
        return max;
    }
}
