//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class removeDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
