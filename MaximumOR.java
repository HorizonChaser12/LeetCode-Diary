//https://leetcode.com/problems/maximum-or/
public class MaximumOR {
    public static void main(String[] args) {
        int[] nums = {8,1,2};
        int k=2;
        System.out.println(maximumOr(nums,k));
    }
    static long maximumOr(int[] A, int k) {
        int n = A.length, right[] = new int[n], left = 0;
        long res = 0;
        for (int i = n - 2; i >= 0; --i) {
            right[i] = right[i + 1] | A[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, left | (long)A[i] << k | right[i]);
            left |= A[i];
        }
        return res;
    }
}
