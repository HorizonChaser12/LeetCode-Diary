//https://leetcode.com/problems/smallest-index-with-equal-value/description/
public class smallestIndexWEqualValue {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(smallestEqual(nums));
    }
    static int smallestEqual(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                if(i<smallest && i!=smallest){
                    smallest=i;
                }
            }
        }
        return smallest<Integer.MAX_VALUE ? smallest : -1;
    }
}
