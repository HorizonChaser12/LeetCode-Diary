//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
public class longestStrictlyIncreasingOrDecreasing {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3};
        System.out.println(longestMonotonicSubarray(nums));
    }

    static int longestMonotonicSubarray(int[] nums) {
        int decreasing = 0;
        int increasing = 0;
        int longestincreasing = 0;
        int longestdecreasing = 0;
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = nums[i-1];
            if (prev<curr){
                increasing++;
                decreasing=0;
                longestincreasing=Math.max(increasing,longestincreasing);
            }
            else if(curr<prev){
                decreasing++;
                increasing=0;
                longestdecreasing=Math.max(decreasing,longestdecreasing);
            }
            else{
                increasing=0;
                decreasing=0;
            }
        }
        return 1+Math.max(longestdecreasing,longestincreasing);
    }
}
