// https://leetcode.com/problems/find-peak-element/description/
public class findPeakElement {

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(findPeakElements(nums));
    }
    static int findPeakElements(int[] nums) {
        int start = 0;
        int end  = nums.length-1;
        if (nums.length==1) {
            return 0;
        }
        while(start<end){
            int mid = start + (end - start) / 2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                end = mid;
            }
            else if(nums[mid]<= nums[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}