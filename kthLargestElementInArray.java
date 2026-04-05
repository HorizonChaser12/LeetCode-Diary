//https://leetcode.com/problems/kth-largest-element-in-an-array/
import java.util.*;

public class kthLargestElementInArray {
    static void main() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
    static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(!queue.isEmpty() && queue.peek()>nums[i]){
                System.out.println(queue);
            }
            else {
                queue.add(nums[i]);
            }
        }
        return queue.element();
    }
}
