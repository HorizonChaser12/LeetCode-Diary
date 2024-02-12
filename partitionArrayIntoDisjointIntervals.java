//https://leetcode.com/problems/partition-array-into-disjoint-intervals/description/
public class partitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        int[] nums = {5,0,3,8,6};
        System.out.println(partitionDisjoint(nums));
    }
    static int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int maxLeft = nums[0];
        int currMax = nums[0];
        int partitionIndex = 0;
        for (int i = 1; i < n; i++) {
            currMax = Math.max(currMax, nums[i]);
            if (nums[i] < maxLeft) {
                maxLeft = currMax;
                partitionIndex = i;
            }
        }
        return partitionIndex + 1;
    }
}
