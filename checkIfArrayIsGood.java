import java.util.Arrays;
//https://leetcode.com/problems/check-if-array-is-good/
public class checkIfArrayIsGood {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        System.out.println(isGood(nums));
    }
    static boolean isGood(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] != i+1){
                return false;
            }
        }
        return nums[n - 1] == n - 1;
    }
}
