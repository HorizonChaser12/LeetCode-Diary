import java.util.Arrays;
//https://leetcode.com/problems/sort-array-by-parity-ii/
public class sortArrayByParity2 {
    public static void main(String[] args) {
        int[] nums ={3,0,4,0,2,1,3,1,3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
//      6ms runtime
        int L = 0;
        int R = 1;
        while (L < nums.length && R < nums.length) {
            while (R < nums.length && (nums[L] % 2 == 0 && L % 2 != 0) || (nums[L] % 2 != 0 && L % 2 == 0)) {
                if (((nums[R] % 2 != 0 && R % 2 == 0) && (nums[L] % 2 == 0 && L % 2 != 0)) || (nums[R] % 2 == 0 && R % 2 != 0) && (nums[L] % 2 != 0 && L % 2 == 0)) {
                    swap(nums,L,R);
                    L++;
                    break;
                }
                R++;
            }
            L++;
        }
        return nums;
    }

//        3ms runtime,skipping places where there is even index and even number and same logic for odd numbers thus making the hassle-free skipping steps and swapping when it is necessary.
//        int n = nums.length;
//        int i = 0, j = n - 1;
//        // Two pointers: i for even indices, j for odd indices
//        while (i < n && j >= 0) {
//            if (nums[i] % 2 == 0) {
//                // Skip even number at even index
//                i += 2;
//            } else if (nums[j] % 2 == 1) {
//                // Skip odd number at odd index
//                j -= 2;
//            } else {
//                // Swap to correct positions
//                swap(nums, i, j);
//            }
//        }
//        return nums;
//    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
