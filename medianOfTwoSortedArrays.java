import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int start = 0;
        int end = nums1.length-1;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        while (start < end && index!=nums2.length) {
            int mid = start + (end - start) / 2;
            if (nums2[index] > list.get(mid)) {
                start = mid+1;
            } else if (nums2[index] < list.get(mid)) {
                end = mid-1;
            }
            if (list.get(start)<nums2[index] && list.get(end)>nums2[index]){
                list.add(mid, nums2[index]);
                index++;
            }
            System.out.println(list);
        }

        if (list.size() % 2 == 0) {
            median = (double) (list.get(list.size() / 2) + list.get(list.size() / 2 + 1)) / 2;
        } else {
            median = list.get(list.size() / 2);
        }
        return median;
    }
}
