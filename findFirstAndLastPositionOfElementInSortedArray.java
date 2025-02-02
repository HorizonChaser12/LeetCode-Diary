import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class findFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target) {
//      Ran and passed the test cases too but the runtime is 2ms due to the use of multiple loops inside the return statement.
//        int start = 0;
//        int end = nums.length-1;
//        if (nums.length==1 && target==nums[0]){
//            return new int[]{0,0};
//        }
//        while (start<=end){
//            int mid = start + (end-start) / 2;
//            if (nums[mid]==target){
//                return find(nums,mid);
//            } else if (nums[mid]>target) {
//                end = mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    static int[] find(int[] arr,int index){
//        int temp =index;
//        int start =index;
//        int end =index;
//        for (int i = 0; i < arr.length; i++) {
//            if (temp!=0 && arr[temp-1]==arr[temp]){
//                while (temp!=0 && arr[temp-1]==arr[temp]){
//                    temp--;
//                }
//                start = temp;
//            }
//        }
//        temp =index;
//        for (int i = 0; i < arr.length; i++) {
//            if (temp!=arr.length-1 && arr[temp+1]==arr[temp]){
//                while (temp!=arr.length-1 && arr[temp+1]==arr[temp]){
//                    temp++;
//                }
//                end = temp;
//            }
//        }
//        return new int[]{start,end};

//      Beats 100% of the users, basic linear Search Rocks LOL!
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                first=i;
                while (i<nums.length-1 && nums[i+1]==target){
                    i++;
                }
                last = i;
                break;
            }
        }
        return new int[] {first,last};
    }
}
