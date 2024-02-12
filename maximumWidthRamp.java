//https://leetcode.com/problems/maximum-width-ramp/description/
public class maximumWidthRamp {
    public static void main(String[] args) {
        int [] nums = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }
    static int maxWidthRamp(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            int j= nums.length-1;
            while ( j>0 && i<j){
                if (nums[i]<=nums[j]){
                    if (j - i > max) {
                        max = j-i;
                        break;
                    }
                }
                j--;
            }
        }
        return max;

//        A more and far better approach without the use of stack data structure but using the array as a stack to store the ramp positions in an empty array and then calculating the width of both the positions.
//        int n = nums.length, top = 0, ans = 0;
//        int[] stack = new int[n];
//        for (int i = 1; i < n; i++) {
//            if (nums[i] < nums[stack[top]]) {
//                stack[++top] = i;
//            }
//        }
//        for (int i = n - 1; i > ans; i--) {
//            while (top >= 0 && nums[i] >= nums[stack[top]]) {
//                top--;
//            }
//            ans = Math.max(ans, i - stack[top + 1]);
//        }
//        return ans;
    }
}
