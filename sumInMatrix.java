import java.util.Arrays;
//https://leetcode.com/problems/sum-in-a-matrix/description/
public class sumInMatrix {
    public static void main(String[] args) {
        int[][] nums = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        System.out.println(matrixSum(nums));
    }
    static int matrixSum(int[][] nums) {
        int max;
        int sum=0;
        int col=0;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        while (col<nums[0].length){
            max=0;
            for (int[] num : nums) {
                max = Math.max(max, num[col]);
            }
            sum=sum+max;
            col++;
        }
        return sum;
    }
}
