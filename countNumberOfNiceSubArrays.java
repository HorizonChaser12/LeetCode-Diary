//https://leetcode.com/problems/count-number-of-nice-subarrays/description/?envType=daily-question&envId=2024-06-22
//Work of art of using simple stuff but using pattern and logical thinking to tackle this problem without sliding windows and in One Pass.
//Do look the submission page to work out for a more informative and beautiful answers.
public class countNumberOfNiceSubArrays {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums, k));
    }

    static int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }

    static int helper(int[] nums, int k) {
        int fast = 0;
        int slow = 0;
        int count = 0;
        int odd = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 != 0) {
                odd++;
            }
            while (odd > k) {
                if (nums[slow] % 2 != 0) {
                    odd--;
                }
                slow++;
            }
            count += fast - slow + 1;
            fast++;
        }
        return count;
    }
}
