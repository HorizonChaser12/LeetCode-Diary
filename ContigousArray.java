import java.util.Arrays;
//https://leetcode.com/problems/contiguous-array/description/?envType=daily-question&envId=2024-03-16
public class ContigousArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1};
        System.out.println(findMaxLength(nums));
    }
    static int findMaxLength(int[] nums) {
//      This is a stolen code from the solution page and the most common way of solving it was using hashmap and I will look over another solution whenever this question arises again.
//       My approach is still in the submission page of this question.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int maxLength = 0;
        int sum = 0;
        int[] firstIndex = new int[2 * nums.length + 1]; // Range of possible sums is from -n to n
        Arrays.fill(firstIndex, -1); // Initialize all elements to -1
        firstIndex[nums.length] = 0; // 0 is encountered at index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (firstIndex[sum + nums.length] != -1) {
                maxLength = Math.max(maxLength, i + 1 - firstIndex[sum + nums.length]);
            } else {
                firstIndex[sum + nums.length] = i + 1;
            }
        }
        return maxLength;
    }
}
