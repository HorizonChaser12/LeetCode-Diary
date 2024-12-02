//https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/description/
//https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/description/
//Second one is the same but with higher constraints.
public class shortestSubarrayWithORatLeastK2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 32, 21};
        int k = 55;
        System.out.println(minimumSubarrayLength(nums, k));
    }

    static int minimumSubarrayLength(int[] nums, int k) {
//      Time limit exceeded for this code as it uses 2 loops and not enough optimisation in the sliding window.
//      714 / 718 testcases passed
        int fast = 0;
        int slow = 0;
        int min = Integer.MAX_VALUE;
        while (slow < nums.length) {
            int OR = nums[slow];
            while (fast < nums.length) {
                OR |= nums[fast];
                if (OR >= k) {
                    min = Math.min((fast - slow) + 1, min);
                }
                fast++;
            }
            slow++;
            fast = slow;
        }
        return min == Integer.MAX_VALUE ? -1 : min;

    }
}
