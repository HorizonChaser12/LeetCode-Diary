import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInASortedArray {
    public static void main(String[] args) {
        Integer[] nums = {7 ,8 ,8 ,10 ,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(nums));
        System.out.println(singleNonDuplicate((ArrayList<Integer>) list));
//        System.out.println(singleNonDuplicate(nums));
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
        int n= nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
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
    static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int start = 0;
        int end= arr.size()-1;
        int n= arr.size();
        if (n == 1) return arr.get(0);
        if (arr.get(0) != arr.get(1)) return arr.get(0);
        if (arr.get(n-1) != arr.get(n-2)) return arr.get(n-1);
        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if(!Objects.equals(arr.get(mid), arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))){
                return arr.get(mid);
            }
            if(arr.get(mid).equals(arr.get(mid + 1)) && mid%2==0){
                start=mid+1;
            }
            else if (arr.get(mid).equals(arr.get(mid - 1)) && mid%2==0 ){
                end=mid-1;
            }
            else if (arr.get(mid).equals(arr.get(mid - 1)) && mid%2!=0){
                start=mid+1;
            }
            else if (arr.get(mid).equals(arr.get(mid + 1)) && mid%2!=0){
                end=mid-1;
            }
        }
        return -1;
    }
}
