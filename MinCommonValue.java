//https://leetcode.com/problems/minimum-common-value/?envType=daily-question&envId=2024-03-09

public class MinCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4};
        System.out.println(getCommon(nums1,nums2));
    }
    static int getCommon(int[] nums1, int[] nums2) {
//      Runs in 15ms and is much slower than the other solutions as the test cases are large, and I am using the contains check to find the common element.
//        HashSet<Integer> set = new HashSet<>();
//        for (int j : nums1) {
//            set.add(j);
//        }
//        for (int j : nums2) {
//            if (set.contains(j)) {
//                return j;
//            }
//        }
//        return -1;

//      A better solution that surpasses my code and runs at 2ms.Pretty efficient use of while loops.I mean I can think of these interesting ways but my solution was thought and wrote in hardly 5 mins nad was purely bruteforce.
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }

        return -1;
    }
}
