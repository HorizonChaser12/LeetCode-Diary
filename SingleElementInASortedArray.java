//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums) {
//      using two pointers method
//      The following are for some certain test cases as the edge cases are adjustable .
//        int n= nums.length;
//        if (n == 1) return nums[0];
//        if (nums[0] != nums[1]) return nums[0];
//        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

//        int start=0;
//        int end=1;
//        while(end<nums.length-1){
//            if(nums[start]==nums[end]){
//                start=end+1;
//                end=end+2;
//            }
//            else{
//                return nums[start];
//            }
//        }
//        return -1;

//      using binary search
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid+1] && mid%2==0){
                start=mid+1;
            } else if (nums[mid]==nums[mid-1] && mid%2==0) {
                end=mid-1;
            } else if (nums[mid]==nums[mid-1] && mid%2!=0 ){
                start=mid+1;
            } else if (nums[mid]==nums[mid+1] && mid%2!=0 ) {
                end=mid-1;
            }
        }
        return -1;
    }
}
