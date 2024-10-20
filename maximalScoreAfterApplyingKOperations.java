import java.util.Arrays;
//https://leetcode.com/problems/maximal-score-after-applying-k-operations/description/?envType=daily-question&envId=2024-10-14
//This is not solved.
public class maximalScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        int[] nums = {756902131,995414896,95906472,149914376,387433380,848985151};
        int k = 6;
        System.out.println(maxKelements(nums, k));
    }

    static long maxKelements(int[] nums, int k) {
//       Sorting isn't a good choice for this code due to:
//       sorting the array initially isn't the most efficient way to repeatedly pick the largest element, as you might need to re-sort or perform additional checks each time.


//      this code does work but for 32th test case it fails due to TLE due to the use of multiple sorting.
//      this cant be solved without using a heap.
        long score = 0;
        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            int maxElement = nums[nums.length - 1];
            score += maxElement;
            nums[nums.length - 1] = (maxElement + 2) / 3;
        }
        return score;
    }
}
