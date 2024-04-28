//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.Arrays;
//need to learn again about the increment operators and how to use them to assign values in-place
public class mergeSortedArr {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//       int i=m-1;
//       int j=n-1;
//       int k=m+n-1;
//       while (j>=0){
//           if(i>=0 && nums1[i]>nums2[j]){
//               nums1[k--]=nums1[i--];
//           }
//           else {
//               nums1[k--]=nums2[j--];
//           }
//       }
//      This is also a working solution but the problem is this uses the inbuilt function to sort the arrays which take nlogn Complexity and thus this ain't the best solution but is quite acceptable.
        int k=m+n-1;
        for (int i = 0; i < n; i++) {
                int temp=nums2[i];
                nums1[k]=temp;
                k--;
        }
        Arrays.sort(nums1);
    }
}
