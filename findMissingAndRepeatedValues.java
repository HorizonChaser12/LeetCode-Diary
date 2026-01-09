import java.util.Arrays;
//https://leetcode.com/problems/find-missing-and-repeated-values/description/?envType=daily-question&envId=2025-03-06
public class findMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValue(grid)));
    }
    static int[] findMissingAndRepeatedValue(int[][] grid) {
//      Easy Approach as Test Cases are low.
//      Get a better approach to solve this!
        int[] arr = new int[(grid.length*grid.length)+1];
        for (int[] row : grid) {
            for (int num : row) {
                arr[num]++;
            }
        }
        int repeated=0,missing=0;
        for (int num = 1; num <= grid.length* grid.length; num++) {
            if (arr[num] == 2) repeated = num;
            if (arr[num] == 0) missing = num;
        }
        return new int[]{repeated,missing};
    }
}
