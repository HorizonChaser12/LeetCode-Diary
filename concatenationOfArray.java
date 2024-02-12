//https://leetcode.com/problems/concatenation-of-array/
public class concatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        int[] ans = getConcatenation(arr);
        for (int an : ans) {
            System.out.println(an);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] arr1 = new int[nums.length * 2];
        int n= nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr1[i] = nums[i];
            arr1[n] = nums[i];
            n++;
        }
        return arr1;
    }
}
