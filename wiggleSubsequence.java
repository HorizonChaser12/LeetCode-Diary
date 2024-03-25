import java.util.Arrays;
//https://leetcode.com/problems/wiggle-subsequence/description/
public class wiggleSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(wiggleMaxLength(nums));
    }
    static int wiggleMaxLength(int[] nums) {
        int[] wiggle = new int[nums.length-1];
        int j=0;
        int count=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            wiggle[j]=nums[i+1]-nums[i];
            j++;
        }
        System.out.println(Arrays.toString(wiggle));
        for(int i=0;i<wiggle.length-1;i++){
            if (wiggle[i]>0){
                if (wiggle[i+1]<0){
                    count++;
                }
                else if (count>max){
                    max=count;
                }
                else{
                   count=0;
                }
            }
            else if (wiggle[i]<0){
                if (wiggle[i+1]>0){
                    count++;
                }
                else if (count>max){
                    max=count;
                }
            }
        }
        return count+2;
    }
}
