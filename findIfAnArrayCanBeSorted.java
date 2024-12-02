import java.util.Arrays;
//https://leetcode.com/problems/find-if-array-can-be-sorted/description/
//Did come up with the logic but lacked in storing the bits in a definite space which lead to multiple instance of swapping wrong.Took a little help from chatGPT and it was done.
public class findIfAnArrayCanBeSorted {
    public static void main(String[] args) {
        int[] nums = {75,34,30};
        System.out.println(canSortArray(nums));
    }
    static boolean canSortArray(int[] nums) {
        int[] freq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            freq[i] = Integer.bitCount(nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (freq[j] == freq[j + 1] && nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        int[] dup = Arrays.copyOf(nums,nums.length);
        Arrays.sort(dup);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==dup[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
