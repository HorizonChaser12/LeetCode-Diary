import java.util.Arrays;
//https://leetcode.com/problems/largest-perimeter-triangle/description/
public class largestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums={3,2,3,4};
        System.out.println(nums.length);
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                ans=Math.max(ans,nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        return ans;
    }
}
