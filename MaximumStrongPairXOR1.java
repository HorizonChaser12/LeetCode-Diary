//https://leetcode.com/problems/maximum-strong-pair-xor-i/description/
public class MaximumStrongPairXOR1 {
    public static void main(String[] args) {
        int[] nums = {10,100};
        System.out.println(maximumStrongPairXor(nums));
    }
    static int maximumStrongPairXor(int[] nums) {
        int max=0;
        int mod=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i],nums[j])){
                    mod = nums[i] ^ nums[j];
                }
                if(max < mod){
                    max=mod;
                }
            }
        }
        return max;
    }
}
