//https://leetcode.com/problems/array-partition/?envType=problem-list-v2&envId=sorting
import java.util.Arrays;

public class arrayPartition {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    static int arrayPairSum(int[] nums) {
//      This is brute force that is working without any issues but there can be an optimal solution to this. Complexity is O(n log n)
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0;i<nums.length;i+=2){
            max += Math.min(nums[i],nums[i+1]);
        }
        return max;
    }
}
