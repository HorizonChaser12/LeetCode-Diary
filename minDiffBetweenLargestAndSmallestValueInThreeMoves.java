import java.util.Arrays;
//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/
//Could not come up with an intuition of how to solve this program.Later found out that for finding the greedy solution you have to think of how 3 moves can be used rather than which numbers should be changed to get the minimum.
//Will be attaching a solution link for later on walkthrough.
//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/solutions/5406010/3-solutions-tutorial-o-n-included-minimum-difference-between-largest-and-smallest-value/
public class minDiffBetweenLargestAndSmallestValueInThreeMoves {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        System.out.println(minDifference(nums));
    }
    static int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[nums.length - 1] - nums[0];
        for(int i = 0; i <= 3; i++) {
            ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
        }
        return ans;
    }
}
