//https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
public class longestContinousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2};
        System.out.println(findLengthOfLCIS(nums));
    }

    static int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }

        ans = Math.max(ans, count);
        return ans;
    }
}
