//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/
public class minOperationsToMakeArrayInc {
    public static void main(String[] args) {
        int[] nums={1,5,2,4,1};
        System.out.println(minOperations(nums));
    }
    static int minOperations(int[] nums) {

//        Doesn't use greedy approach rather this is a brute force approach that works but has high complexity.
//        int steps=0;
//        int i=1;
//            while(i < nums.length){
//                if(nums[i]<=i || nums[i]<nums[i-1]+1){
//                    nums[i]++;
//                    steps++;
//                }
//                if(nums[i]>nums[i-1]){
//                    i++;
//                }
//            }
//        return steps;


//      A far better approach which uses greedy approach and saves time by not incrementing things again and again.
        int count = 0, last = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (last >= nums[i + 1])
                count += ++last - nums[i + 1];
            else
                last = nums[i + 1];
        }
        return count;
    }
}
