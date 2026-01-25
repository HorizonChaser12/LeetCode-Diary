//https://leetcode.com/problems/trionic-array-i/submissions/1906982387/?envType=daily-question&envId=2026-02-03
public class trionicArray1 {
    public static void main(String[] args) {
        int[] nums = {7,8,9,6,6,1,1,7};
        System.out.println(isTrionic(nums));
    }
    static boolean isTrionic(int[] nums) {
        int j = 0;
        boolean flag1 = false;
        for(int i=j;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                j=i;
                if (i==0){
                    return false;
                }
                else{
                flag1 = true;
                }
                break;
            }
            if (nums[i]==nums[i+1]){
                return false;
            }

        }
        boolean flag2 = false;
        while(j<nums.length-1){
            if (nums[j]<nums[j+1]){
                flag2=true;
                break;
            }
            if(nums[j]==nums[j+1]){
                return false;
            }
            j++;
        }
        for(int i=j;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return flag1 && flag2;
    }
}
