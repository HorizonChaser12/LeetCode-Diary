import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int k=8;
        System.out.println(Arrays.toString(firstAndLastPosition(arr,k)));
    }
    static int[] firstAndLastPosition(int[] nums, int target) {
        // Write your code here.
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
