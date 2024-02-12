//https://leetcode.com/problems/max-pair-sum-in-an-array/description/
public class maxPairSumArray {
    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};
        System.out.println(maxSum(nums));
    }
    static int maxSum(int[] nums) {
        int max=-1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (checkMaxDigit(nums[i])==checkMaxDigit(nums[j])){
                   max=Math.max(nums[i]+nums[j],max);
                }
            }
        }
        return max;
    }
    static int checkMaxDigit(int n){
        int max=0;
        while(n!=0){
            max = Math.max(max, n % 10);
            n=n/10;
        }
        return max;
    }
}
