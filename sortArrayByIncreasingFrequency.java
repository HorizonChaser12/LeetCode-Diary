import java.util.Arrays;
//https://leetcode.com/problems/sort-array-by-increasing-frequency/?envType=daily-question&envId=2024-07-23
public class sortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {2,3,1,3,2};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    static int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int count = 0;
        System.out.println(Arrays.toString(nums));
        for (int i=0;i<nums.length;i++){
            int fix=nums[i];
            while(nums[i+1]==fix){
                count++;
                i++;
            }

        }
        return ans;
    }
}
