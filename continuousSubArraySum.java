//https://leetcode.com/problems/continuous-subarray-sum/description/?envType=daily-question&envId=2024-06-08/
public class continuousSubArraySum {
    public static void main(String[] args) {
        int[] nums = {23,6,9};
        int k = 6;
        System.out.println(checkSubarraySum(nums,k));
    }
    static boolean checkSubarraySum(int[] nums, int k) {
//      This code works in O(n*2) time complexity so because of that it can't pass 5 more test cases cuz of the no. of elements in the array and the integer itself.
//      passes 94/99 test cases.
//      HashMap Solution is needed.
//        int fast=1;
//        int slow=0;
//        int sum;
//        while(slow<nums.length){
//            sum=nums[slow];
//            while(fast<nums.length){
//                sum=sum+nums[fast];
//                if(sum%k==0){
//                    return true;
//                }
//                fast++;
//            }
//            slow++;
//            fast=slow+1;
//        }
//        return false;


//      Using prefix sum and sliding window.
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Edge Case , consecutive zeros always give true answer
            if (nums[i - 1] == 0 && nums[i] == 0) {
                return true;
            }

            sum += nums[i];

            if (sum % k == 0) { // Check if the cumulative sum is divisible by k
                return true;
            }

            int j = 0;
            int tempSum = sum;

            while ((i - j) > 1 && tempSum >= k) {
                tempSum -= nums[j];
                j++;

                if (tempSum % k == 0) { // Check if temporary sum is divisible by k
                    return true;
                }
            }
        }
        // If no valid subarray is found, return false
        return false;
    }
}
