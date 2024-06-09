//https://leetcode.com/problems/largest-element-in-an-array-after-merge-operations/description/
public class largestElementArrayAfterMergeOperations {
    public static void main(String[] args) {
        int[] nums = {2,3,7,9,3};
        System.out.println(maxArrayValue(nums));
    }

    static long maxArrayValue(int[] nums) {
//        I couldn't even achieve this solution maybe due to rusting and not getting a habit of coding from the past weeks. Will surely try to think more.
//        long ans=0L;
//        long num[]=new long[nums.length];
//        for(int i=0;i<nums.length;i++){
//            num[i]=nums[i];
//        }
//        for(int i=nums.length-1;i>0;i--){
//            if(num[i]>=num[i-1]){
//                num[i-1]=num[i]+num[i-1];
//            }
//        }
//        for(Long i:num){
//            ans=Math.max(i,ans);
//        }
//        return ans;


//      A better code with less time complexity and is indeed a better greedy solution.
        final int n = nums.length;
        long result = nums[n - 1];
        long current = nums[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            if (current >= nums[i - 1]) {
                current += nums[i - 1];
            } else {
                current = nums[i - 1];
            }
            result = Math.max(result, current);
        }

        return result;
    }
}
