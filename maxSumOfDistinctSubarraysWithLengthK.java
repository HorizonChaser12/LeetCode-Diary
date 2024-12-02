//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/?envType=daily-question&envId=2024-11-19
import java.util.HashSet;
public class maxSumOfDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int[] nums = {9, 9, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }

    static long maximumSubarraySum(int[] nums, int k) {
//        This is my initial code which solved 66/93 test cases and later on leaded to TLE.
//        HashSet<Integer> set;
//        int left = 0;
//        int right = k-1;
//        long max = 0;
//        while (left!=nums.length && right<nums.length){
//            set = new HashSet<>();
//            long sum = 0;
//            for (int i = left; i < right+1; i++) {
//                if (!set.contains(nums[i])){
//                    set.add(nums[i]);
//                    sum+=nums[i];
//                }
//                else {
//                    sum=0;
//                    break;
//                }
//            }
//            max=Math.max(sum,max);
//            left++;
//            right++;
//        }
//        return max;


//      I have generated using my OG code through ChatGPT.Make sure to learn it.
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        long max = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            // Initialize the set if we are starting a new window
            if (right - left + 1 > k) {
                // Remove the leftmost element from the window
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // If the element is already in the set, reset the window
            if (set.contains(nums[right])) {
                while (nums[left] != nums[right]) {
                    set.remove(nums[left]);
                    sum -= nums[left];
                    left++;
                }
                left++;
            } else {
                // Add current element to the window
                set.add(nums[right]);
                sum += nums[right];
                // Check if the window size matches k
                if (right - left + 1 == k) {
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }
}
