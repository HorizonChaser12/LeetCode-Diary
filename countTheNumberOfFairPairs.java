import java.util.*;

public class countTheNumberOfFairPairs {
    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3, upper = 6;
        System.out.println(countFairPairs(nums, lower, upper));
    }

    static long countFairPairs(int[] nums, int lower, int upper) {
//      Sliding Window Approach but fails due to large constraints
//      43/54 test cases passed and the TLE.
//        Set<List<Integer>> uniquePairs = new HashSet<>();
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            while (right > left) {
//                int sum = nums[left] + nums[right];
//                if (sum >= lower && sum <= upper) {
//                    uniquePairs.add(Arrays.asList(left, right));
//                }
//                right--;
//            }
//            left++;
//            right = nums.length - 1;
//        }
//        return uniquePairs.size();



        Arrays.sort(nums); // Step 1: Sort the array to use two-pointer technique effectively. Time: O(n log n)

        // Step 2: Calculate pairs with sums <= upper and sums < lower.
        long pairsWithUpper = findLessThanEqualTo(nums, upper); // Count pairs <= upper
        long pairsWithLowerMinus1 = findLessThanEqualTo(nums, lower - 1); // Count pairs < lower

        // Step 3: The fair pairs within [lower, upper] is the difference
        return pairsWithUpper - pairsWithLowerMinus1;
    }

    private static long findLessThanEqualTo(int[] nums, int targetSum) {
        int n = nums.length;
        long pairs = 0;
        int left = 0;
        int right = n - 1;

        // Step 4: Two-pointer approach to count pairs <= targetSum
        while (left < right) {
            if (nums[left] + nums[right] <= targetSum) {
                pairs += (right - left); // Add all pairs between left and right
                left++; // Move left pointer to explore new pairs
            } else {
                right--; // Decrease right pointer to lower the sum
            }
        }

        return pairs;
    }
}
