import java.util.Arrays;
//https://leetcode.com/problems/minimum-absolute-difference-queries/description/
public class minAbsoluteDifferenceQueries {
    public static void main(String[] args) {
        int[] nums = {10,6,10,2,7};
        int[][] queries = {
                {0,2},
                {2,4},
                {0,4},
                {0,4},
                {0,3},
        };
        System.out.println(Arrays.toString(minDifference(nums,queries)));
    }
    static int[] minDifference(int[] nums, int[][] queries) {
//        Passes 45/60 test cases but fails for large constraints of elements in both nums and queries area.
        int[] ans = new int[queries.length];
        int i=0;
        for (int[] query : queries) {
            ans[i] = findmin(nums, query[0], query[1]);
            i++;
        }
        return ans;

//        Approach:
//        Here 1 <= nums[i] <= 100, which kind of helps us to solve it easily.
//        Create a count array which stores the count of each number from 1 to 100 till ith index for each index.
//        Traverse the queries array, each query will have a low and high index / range.
//        3.1 Traverse all numbers from 1 to 100 and get the count of each of them from low index to high index. It can easily be done using count array (constant time).
//        3.2 Store those numbers in a list, which have count > 0 in the given range, because it means that these numbers are present.
//        3.3 If -> the size of list is equal to 1, make answer of this query as -1, because we don't have any distinct pair to calculate the difference.
//        3.4 Else -> travese all the elements from lowest to highest and get the minimum difference, it will be obvious to traverse the list elements in increasing or decreasing order, because then only we will get any pair with minimum absolute difference.
//        Return the answer array formed.

//        This is the accepted code that has a complexity of O((m+n)*100) where m=queries.length and n=nums.length
//        this utilizes the constraint that the value of nums[i] will always be under or equal to 100 and thus
//        int n = nums.length;
//        int[][] count = new int[n + 1][100];
//        int q = queries.length;
//        int ans[] = new int[q];
//
//        for(int i = 0; i < n; ++i) {
//            for(int j = 0; j < 100; ++j)
//                count[i + 1][j] = count[i][j];
//
//            ++count[i + 1][nums[i] - 1];
//        }
//
//        for(int i = 0; i < q; ++i) {
//            int low = queries[i][0];
//            int high = queries[i][1] + 1;
//            List<Integer> present = new ArrayList<>();
//            int min = 100;
//
//            for(int j = 0; j < 100; ++j)
//                if(count[high][j] - count[low][j] != 0)
//                    present.add(j);
//
//            for(int j = 1; j < present.size(); ++j)
//                min = Math.min(min, present.get(j) - present.get(j - 1));
//
//            if(present.size() == 1)
//                min = -1;
//
//            ans[i] = min;
//        }
//
//        return ans;
    }
    static int findmin(int[] nums,int index1,int index2){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <= index2; i++) {
            for (int j = index1; j <=index2; j++) {
                int temp=min;
                min=Math.min(min,Math.abs(nums[index1]-nums[j]));
                if (min==0){
                    min=temp;
                }
            }
            index1++;
            }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
