import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3}, nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//       So this approach does pass all the test case due to the reason that sorting here through the collections framework takes O(nlogn) and then the manual addition of both the arrays takes O(m+n).And thus the total time complexity is O(log (m+n)).
//       But a better solution can be made using the binary search and without the use of any kind of sorting algorithm.
        double median = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
//        int start = 0;
//        int end = nums1.length-1;
//        int index = 0;
//        while (start < end && index!=nums2.length) {
//            int mid = start + (end - start) / 2;
//            if (nums2[index] > list.get(mid)) {
//                start = mid+1;
//            } else if (nums2[index] < list.get(mid)) {
//                end = mid-1;
//            }
//            if (list.get(start)<nums2[index] && list.get(end)>nums2[index]){
//                list.add(mid, nums2[index]);
//                index++;
//            }
//            System.out.println(list);
//        }
        Collections.sort(list);
        if (list.size() % 2 == 0) {
            median = (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        } else {
            median = list.get(list.size() / 2);
        }
        return median;
    }
}
