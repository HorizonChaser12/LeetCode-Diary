import java.util.Arrays;
//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/?envType=daily-question&envId=2024-02-14
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {-27,-30,8,-16,38,30,20,21,-2,-18,40,-29};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    static int[] rearrangeArray(int[] nums) {
//      Simple use of fast and slow pointers with a little extra space complexity. Its hard to align it in O(1) thou cuz of the irregular patterns but will surely try it some other day.
        int[] ans = new int[nums.length];
        int index=0;
        int posindex= 0;
        int negindex = 1;
        while(index<nums.length){
            if (nums[index]>0){
                ans[posindex]=nums[index];
                posindex+=2;
                index++;
            }
            if (index<nums.length && nums[index]<0){
                ans[negindex]=nums[index];
                negindex+=2;
                index++;
            }
        }
        return ans;
    }
}
