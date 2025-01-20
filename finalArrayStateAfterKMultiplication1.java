import java.util.Arrays;
//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/?envType=daily-question&envId=2024-12-16
public class finalArrayStateAfterKMultiplication1 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int k=5,multiplier=2;
        System.out.println(Arrays.toString(getFinalState(nums,k,multiplier)));
    }
    static int[] getFinalState(int[] nums, int k, int multiplier) {
        int min;
        int index=0;
        while(k!=0){
            min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                    index=i;
                }
            }
            nums[index]=nums[index]*multiplier;
            k--;
        }
        return nums;
    }
}
