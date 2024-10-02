import java.util.Arrays;
//https://leetcode.com/problems/largest-number/description/?envType=daily-question&envId=2024-09-18
public class largestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumbers(nums));
    }

    static String largestNumbers(int[] nums) {
//      Actual code that works.Need to learn about custom sorting.Without that its a little hard to compare numbers which are part away from the limit of Integers as well as the use of Arrays.sort(custom sort) is needed to be learned to help tackle issues which then can lead it to O(nlogn) complexity rather than what it is now i.e O(n^2)
        String ans = "";
        // Bubble sort logic: Sort the array based on custom comparison
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                String first = Integer.toString(nums[j]);
                String second = Integer.toString(nums[j + 1]);
                // Compare concatenated strings directly instead of parsing them as integers
                if ((first + second).compareTo(second + first) < 0) {
                    // Swap nums[j] and nums[j + 1] if the order is incorrect
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        // Build the final answer string
        for (int num : nums) {
            ans += Integer.toString(num);
        }
        // Edge case: if the result starts with '0', return "0"
        if (ans.startsWith("0")) {
            return "0";
        }
        return ans;

    }
}
