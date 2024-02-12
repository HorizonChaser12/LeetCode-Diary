import java.util.Arrays;
//https://leetcode.com/problems/separate-the-digits-in-an-array/description/
public class separateDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
    static int[] separateDigits(int[] nums) {
        int len=0;
        for(int e:nums){
            while(e>0){
                e=e/10;
                len++;
            }
        }
        int[] ans=new int[len];
        int index=len-1;
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            while(n!=0){
                ans[index]=n%10;
                n=n/10;
                index--;
            }
        }
        return ans;
    }
}
