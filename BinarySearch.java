//https://leetcode.com/problems/binary-search/description
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,12,18,28,29,30,35,36,40,45};
        int target = 3;
        System.out.println(search(nums,target));
    }
    static  int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
