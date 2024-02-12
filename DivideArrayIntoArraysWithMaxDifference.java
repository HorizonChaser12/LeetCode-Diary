import java.util.Arrays;
//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/?envType=daily-question&envId=2024-02-01
public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] nums = {17,15,20,16,15,10,20,19,17};
        int k=2;
        int[][] ans = divideArray(nums,k);
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int[][] ans = new int[nums.length/3][3];
        for (int i = 0,m=0; i < nums.length; i=i+3,m++) {
            ans[m][0] = nums[i];
            for(int j=1; j<3; j++){
                if(nums[i+j]-ans[m][0]<=k){
                    ans[m][j]=nums[i+j];
                }
                else {
                    return new int[][]{};
                }
            }
        }
        return ans;
    }
}

// Intuition
//  * As the given array is unsorted, inorder to find maximum possibility sorting will give the best chance of making the subarray, so we can use any sorting techniques
//  * After sorting it, now we need to split it into groups of 3 with max-difference as k
//  * So I created a 2 for-loop, as usual i and j, this time I incremented i by i+3 and j by 1 and additionally one more variable m for iterating through the result array
//  * I initialised the first sub-array element directly res[m][0] = nums[i];
//  * Then for the second and third element in the subarray I compared with res[m][0] diff should be less than k..
