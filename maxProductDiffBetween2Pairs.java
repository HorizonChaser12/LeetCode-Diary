//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/
public class maxProductDiffBetween2Pairs {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    static int maxProductDifference(int[] nums) {
        int max=0,max1=0,min=Integer.MAX_VALUE,min1=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max1=max;
                max=nums[i];
            }
            else if(nums[i]>max1){
                max1=nums[i];
            }
            if(nums[i]<min){
                min1=min;
                min=nums[i];
            }
            else if(nums[i]<min1){
                min1=nums[i];
            }
        }
        return max*max1-min*min1;
    }
}
