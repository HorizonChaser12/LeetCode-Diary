import java.util.Arrays;
//https://leetcode.com/problems/left-and-right-sum-differences/description/
public class leftAndRightSumDifference {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    static int[] leftRightDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        leftsum[0]=0;
        rightsum[rightsum.length-1]=0;
        for(int i=1;i<leftsum.length;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        for(int i=rightsum.length-2;i>=0;i--){
            rightsum[i]=rightsum[i+1]+nums[i+1];
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
    }
}
