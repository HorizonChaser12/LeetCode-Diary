import java.util.Arrays;
//https://leetcode.com/problems/maximum-gap/description/
public class maximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGaps(nums));
    }
    static int maximumGaps(int[] nums) {
//        Runs ar 37ms and there is a solution with 7ms.If I ever come back to this question then I should be able to solve it in 7ms or at least know the approach!
        if(nums.length<2){
            return 0;
        }
        int maxDiff=0;
        Arrays.sort(nums);
        for(int i=0;i< nums.length-1;i++){
            maxDiff=Math.max(maxDiff,Math.abs(nums[i]-nums[i+1]));
        }
        return maxDiff;
    }
}
