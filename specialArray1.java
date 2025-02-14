//https://leetcode.com/problems/special-array-i/description/?envType=daily-question&envId=2025-02-01
public class specialArray1 {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        System.out.println(isArraySpecial(nums));
    }
    static boolean isArraySpecial(int[] nums) {
        if (nums.length==1){
            return true;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]%2==0 && nums[i+1]%2!=0 || nums[i]%2!=0 && nums[i+1]%2==0){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
