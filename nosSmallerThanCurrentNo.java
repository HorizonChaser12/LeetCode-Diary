import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class nosSmallerThanCurrentNo {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] ans= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
