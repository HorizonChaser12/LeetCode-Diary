import java.util.Arrays;
//https://leetcode.com/problems/sum-of-distances/description/?envType=daily-question&envId=2026-04-23
public class sumOfDistances {
    public static void main(String[] args) {
        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));
    }
    static long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    sum+=Math.abs(i-j);
                }
            }
            ans[index]=sum;
            index++;
        }
        return ans;
    }
}
