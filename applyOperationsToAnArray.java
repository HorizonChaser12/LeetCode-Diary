import java.util.Arrays;
//https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
public class applyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
    static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
        int zeroIndex=0;
        int numIndex =0;
        while (numIndex<nums.length  && zeroIndex<nums.length){
            if (nums[zeroIndex]!=0){
                zeroIndex++;
                numIndex=zeroIndex;
            }
            else if (nums[numIndex]<=0){
                numIndex++;
            }
            else{
                int temp = nums[zeroIndex];
                nums[zeroIndex]=nums[numIndex];
                nums[numIndex]=temp;
                zeroIndex++;
            }
        }
        return nums;
    }
}
