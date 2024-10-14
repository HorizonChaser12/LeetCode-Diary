import java.util.Stack;

//https://leetcode.com/problems/maximum-width-ramp/description/
public class maximumWidthRamp {
    public static void main(String[] args) {
        int [] nums = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }
    static int maxWidthRamp(int[] nums) {
//      This doesn't work more because of extra test cases added to it.
//        int max=0;
//        for (int i = 0; i < nums.length; i++) {
//            int j= nums.length-1;
//            while ( j>0 && i<j){
//                if (nums[i]<=nums[j]){
//                    if (j - i > max) {
//                        max = j-i;
//                        break;
//                    }
//                }
//                j--;
//            }
//        }
//        return max;

//      This is the best and learnable code I can get from anything.
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Build a decreasing stack of indices
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        int maxWidth = 0;

        // Step 2: Iterate from right to left and compute max width ramp
        for (int j = n - 1; j >= 0; j--) {
            // Try to find the largest i such that nums[i] <= nums[j]
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }

        return maxWidth;

//        A  far better approach without the use of stack data structure but using the array as a stack to store the ramp positions in an empty array and then calculating the width of both the positions.
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
