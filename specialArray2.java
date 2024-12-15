//https://leetcode.com/problems/special-array-ii/description/
import java.util.Arrays;

public class specialArray2 {
    public static void main(String[] args) {
        int[] nums = {10,8,8,9};
        int[][] queries = {
                {2,3},
                {0,1},
                {2,3},
                {1,3},
                {2,2},
        };
        System.out.println(Arrays.toString(isArraySpecial(nums, queries)));
    }

    static boolean[] isArraySpecial(int[] nums, int[][] queries) {
//      535 / 536 testcases passed, pure brute force solution.
//        boolean[] ans = new boolean[queries.length];
//        Arrays.fill(ans, true);
//        int index = 0;
//        for (int i = 0; i < queries.length; i++) {
//            int startRange = queries[i][0];
//            int endRange = queries[i][1];
//            for (int j = startRange; j < endRange; j++) {
//                int first = nums[j];
//                int second = nums[j + 1];
//                if ((first % 2 == 0 && second % 2 == 0) || (first%2!=0 && second%2!=0)) {
//                    ans[index]=false;
//                    break;
//                }
//            }
//            index++;
//        }
//        return ans;

//      A beautiful approach and a dumb thinking of mine that couldn't think of Prefix sum to get a solution like this.
        boolean[] ans = new boolean[queries.length];
        int[] prefix = new int[nums.length];
        prefix[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                // new violative index found
                prefix[i] = prefix[i - 1] + 1;
            } else {
                prefix[i] = prefix[i - 1];
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            ans[i] = prefix[end] - prefix[start] == 0;
        }
        return ans;
    }
}