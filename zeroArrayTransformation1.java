//https://leetcode.com/problems/zero-array-transformation-i/
public class zeroArrayTransformation1 {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        int[][] queries = {
                {0,2},
        };
        System.out.println(isZeroArray(nums,queries));
    }
    static boolean isZeroArray(int[] nums, int[][] queries) {
//      Passes 665/667 test cases.
//        for (int i = 0; i < queries.length; i++) {
//            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//               if (nums[j]==0){
//                   continue;
//               }
//               else {
//                   nums[j]--;
//               }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=0){
//                return false;
//            }
//        }
//        return true;

//       this is a solution I have copied from the solution tab as I didn't have an idea of how to solve the question with a different approach.
        int n = nums.length;
        long[] temp = new long[n + 1];

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            temp[left]++;
            temp[right + 1]--;
        }

        long num = 0;
        for (int i = 0; i < n; i++) {
            num += temp[i];
            if (num < nums[i]) {
                return false;
            }
        }

        return true;
    }
}
