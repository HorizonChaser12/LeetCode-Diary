import java.util.Arrays;
//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25
public class maxDiffBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        int[] nums = {90};
        int k = 1;
        System.out.println(minimumDifference(nums,k));
    }
    static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = k-1;
        while (end < nums.length && start <= end) {
            int diff = nums[end] - nums[start];
            min = Math.min(min, diff);
            start +=1;
            end += 1;
        }
        return min;
    }
}
