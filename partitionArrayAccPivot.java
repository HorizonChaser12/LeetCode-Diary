import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
public class partitionArrayAccPivot {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot=2;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }
    static int[] pivotArray(int[] nums, int pivot) {

//        This doesn't work for larger number of elements in array as the complexity is very high.
//        Another thing to note that people are talking about how to solve it in-place without using extra space and thus leading to space complexity of O(1)
        List<Integer> list = getIntegers(nums, pivot);
        for (int i = list.size()-1; i!=0; i--) {
            if (list.get(i)==Integer.MAX_VALUE){
                list.remove(i);
            }
        }
        int[] copy = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            copy[i]=list.get(i);
        }
        return copy;

//        This is the most efficient program I have seen until now with proper and clever use of a variable to store elements in one array.But it is not using inplace.
//        int[] ans=new int[nums.length];
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]<pivot){
//                ans[count]=nums[i];
//                count++;
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==pivot){
//                ans[count]=nums[i];
//                count++;
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>pivot){
//                ans[count]=nums[i];
//                count++;
//            }
//        }
//        return ans;
    }

    private static List<Integer> getIntegers(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(Integer.MAX_VALUE);
        }
        int j=0;
        for (int num : nums) {
            if (num < pivot) {
                list.add(j, num);
                j++;
            }
        }
        int k=j;
        j++;
        int p=0;
        for (int num : nums) {
            if (pivot == num) {
                list.add(k + p, num);
                p++;
                j++;
            }
            if (num > pivot) {
                list.add(j, num);
                j++;
            }
        }
        return list;
    }
}
