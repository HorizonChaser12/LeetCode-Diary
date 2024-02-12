//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class maxCountofPosAndNeg {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));
    }

//    Brute Force Approach
//    static int maximumCount(int[] nums) {
//        int pos=0;
//        int neg=0;
//        for (int num : nums) {
//            if (num > 0) {
//                pos++;
//            } else if (num < 0) {
//                neg++;
//            }
//        }
//        return Math.max(pos, neg);
//    }


//    Approach
//    Count the first index of negative integer
//    Find the no. of leading zeros after the first index of negative integer
//    Find the maximum in both
//    Complexity
//    Time complexity: O(logN)
//    Space complexity: O(1)
    static int maximumCount(int[] nums) {
        int i = 0, j = nums.length - 1, ans = -1;
        while(i <= j) {
            int mid = j + (i - j) / 2;
            if(nums[mid] < 0) {
                ans = mid;
                i = mid + 1;
            }
            else if(nums[mid] >= 0) {
                j = mid - 1;
            }
        }
        int idxOfPos = ans + 1;
        while(idxOfPos < nums.length && nums[idxOfPos] == 0) idxOfPos++;

        return Math.max(ans + 1, nums.length - idxOfPos);
    }
}
