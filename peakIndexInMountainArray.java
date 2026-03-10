// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr  = {0,1,0};
        System.out.println(peakIndexInMountainArrays(arr));


    }
    static int peakIndexInMountainArrays(int[] nums) {
        int start  = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if (mid<nums.length && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
                return mid;
            }
            if(nums[mid+1]>nums[mid]){
                start = mid+1;
            }
            else if(nums[mid-1]>nums[mid]){
                end = mid;
            }
        }
        return start;
    }
    
}
