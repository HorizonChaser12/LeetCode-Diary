import java.util.HashSet;
//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
public class mergeTwo2dArraysBySummingValues {
    public static void main(String[] args) {
        int[][] nums1 = {
                {1, 2},
                {2, 3},
                {4, 5}
        };
        int[][] nums2 = {
                {1, 4},
                {3, 2},
                {4, 1}
        };
        int[][] ans = mergeArrays(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }

    static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        if (nums1.length == 0) return nums2;
        if (nums2.length == 0) return nums1;

        int i = 0, j = 0, nums1Length = nums1.length, nums2Length = nums2.length;

        HashSet<Integer> set = new HashSet<>();

        for (int[] num : nums1) {
            set.add(num[0]);
        }

        for (int[] num : nums2) {
            set.add(num[0]);
        }
        int[][] res = new int[set.size()][2];
        int k = 0;
        while (i < nums1Length && j < nums2Length) {
            if (nums1[i][0] == nums2[j][0]) {
                res[k][0] = nums1[i][0];
                res[k][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
                k++;
            } else if (nums1[i][0] < nums2[j][0]) {
                res[k][0] = nums1[i][0];
                res[k][1] = nums1[i][1];
                k++;
                i++;
            } else {

                res[k][0] = nums2[j][0];
                res[k][1] = nums2[j][1];
                k++;
                j++;

            }
        }
        if (i != nums1Length) {
            while (i < nums1Length) {
                res[k][0] = nums1[i][0];
                res[k][1] = nums1[i][1];
                i++;
                k++;
            }
        }
        if (j != nums2Length) {
            while (j < nums2Length) {
                res[k][0] = nums2[j][0];
                res[k][1] = nums2[j][1];
                j++;
                k++;
            }
        }
        return res;
    }
}
