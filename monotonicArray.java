//https://leetcode.com/problems/monotonic-array/description/?envType=daily-question&envId=2023-09-29
public class monotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(isMonotonic(nums));
    }
    static boolean isMonotonic(int[] nums) {
        if (nums[0]<nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                    if(nums[i]<nums[i-1]){
                        return false;
                    }

                }
            }
        else{
            for(int i=1;i<nums.length;i++){
                    if(nums[i]>nums[i-1]){
                        return false;
                    }

                }
            }
        return true;
    }
}
