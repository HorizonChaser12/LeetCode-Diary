//https://leetcode.com/problems/house-robber/description/?envType=daily-question&envId=2024-01-21
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    static int rob(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            int temp = sum1;
            sum1 = Math.max(sum1,nums[i]+sum2);
            sum2 = temp;
        }
        return sum1;
    }
}
