//https://leetcode.com/problems/build-array-from-permutation/
public class arrayWithPermutations {
    public static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        int[] ans=buildArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] buildArray(int[] nums){
        int[] arr1=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr1[i]=nums[nums[i]];
        }
        return arr1;
    }
}
