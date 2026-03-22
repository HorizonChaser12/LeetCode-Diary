//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class maximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
    static double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        int start = 0;
        int end = k-1;
        double ans = Integer.MIN_VALUE;
        double temp = 0;
        int i = 0;
        while(i<=end){
            temp += nums[i];
            i++;
        }
        ans = temp / k;
        while(end+1<nums.length){
            end++;
            temp+=nums[end];
            temp-=nums[start];
            start++;
            ans = Math.max(temp/k, ans);
        }
        return ans;
    }
}
