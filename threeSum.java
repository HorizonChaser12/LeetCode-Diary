//https://leetcode.com/problems/3sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {3, 0, -2, -1, 1, 2};
        System.out.println(threeSums(nums));
    }

    static List<List<Integer>> threeSums(int[] nums) {
//      One of the best solution and I figured mostly by following one guy on discussion page.
//        Here it goes:
//        Sort the given array in non-decreasing order.
//        Loop through the array from index 0 to n-1.
//        For each iteration, set the target as -nums[i].
//        Set two pointers, j=i+1 and k=n-1.
//        While j<k, check if nums[j]+nums[k]==target.
//        If yes, add the triplet {nums[i], nums[j], nums[k]} to the result and move j to the right and k to the left.
//        If no, move either j or k based on the comparison of nums[j]+nums[k] with target.
//        To avoid duplicate triplets, skip the iterations where nums[i]==nums[i-1] and also skip the iterations where nums[j]==nums[j-1] or nums[k]==nums[k+1].
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) return list;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {
                    break;
                }
            }
        }
        return !list.isEmpty() ? list : new ArrayList<>();
    }
}
