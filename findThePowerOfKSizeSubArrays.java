import java.util.Arrays;
//https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/?envType=daily-question&envId=2024-11-16
public class findThePowerOfKSizeSubArrays {
    public static void main(String[] args) {
        int[] nums = {1,4};
        int k = 1;
        System.out.println(Arrays.toString(resultsArray(nums, k)));
    }

    static int[] resultsArray(int[] nums, int k) {
        if (k==1){
            return nums;
        }
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        int left = 0;
        int right = k - 1;
        while (left<nums.length-k+1){
            for (int i = left; i < right; i++) {
                if (nums[i]+1!=nums[i+1]){
                        ans[index]=-1;
                        index++;
                        break;
                }
                else if (i==right-1){
                    ans[index]=nums[i+1];
                    index++;
                }
            }
            left++;
            right++;
        }
        return ans;
    }
}
