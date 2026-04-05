import java.util.Arrays;
//https://leetcode.com/problems/count-elements-with-at-least-k-greater-values/?envType=problem-list-v2&envId=quickselect
public class countElementsWithAtLeastKGreater {
    static void main() {
        int[] nums = {3,1,2};
        int k = 1;
        System.out.println(countElements(nums,k));
    }
    static int countElements(int[] nums, int k) {
        if(k==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int threshold = nums[nums.length - k];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < threshold) {
                ans++;
            }
        }
        return ans;
    }
}
