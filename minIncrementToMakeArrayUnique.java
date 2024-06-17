import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/?envType=daily-question&envId=2024-06-14
public class minIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
    static int minIncrementForUnique(int[] nums) {
//       Works for 55/63 test cases. But due to large test cases this complexity dies anyway . Got to think of another way such that I don't need to use Arrays.sort or any kind of Sorting function as it leads to more complexity.
//       Update 2, finally works by reading some hints in the discussion page and I will write it below too for future understandings.
//       remembering what is the maximum value found before , as the array is sorted this next number must be atleast greater than max , hence you dont need to increment by 1 anymore , just make it max+1 and the count is increased by max+1-nums[i]
//        works in 37ms lol
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int steps = 0;
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=max){
                steps+=max-nums[i]+1;
                nums[i]=max+1;
            }
            max = Math.max(nums[i],max);
        }
        return steps;

//        The best 4ms optimal answer with using only array and intuition.
//        int n = nums.length;
//        int max = 0;
//        int minIncrements = 0;
//
//        // Find maximum value in array to determine range of frequencyCount array
//        for (int val : nums) {
//            max = Math.max(max, val);
//        }
//
//        // Create a frequencyCount array to store the frequency of each value in nums
//        int[] frequencyCount = new int[n + max];
//
//        // Populate frequencyCount array with the frequency of each value in nums
//        for (int val : nums) {
//            frequencyCount[val]++;
//        }
//
//        // Iterate over the frequencyCount array to make all values unique
//        for (int i = 0; i < frequencyCount.length; i++) {
//            if (frequencyCount[i] <= 1) continue;
//
//            // Determine excess occurrences, carry them over to the next value,
//            // ensure single occurrence for current value, and update minIncrements.
//            int duplicates = frequencyCount[i] - 1;
//            frequencyCount[i + 1] += duplicates;
//            frequencyCount[i] = 1;
//            minIncrements += duplicates;
//        }
//
//        return minIncrements;
    }
}
