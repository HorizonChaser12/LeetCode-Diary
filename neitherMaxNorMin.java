//https://leetcode.com/problems/neither-minimum-nor-maximum/
public class neitherMaxNorMin {
    public static void main(String[] args) {
        int[] nums={3,30,24};
        System.out.println(findNonMinOrMax(nums));
    }
    static int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        int ans=nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int i=0;
        while(i<=nums.length){
            if(ans!=max && ans!=min){
                return ans;
            }
            else {
                ans=nums[i++];
            }
        }
        return -1;
    }
}
