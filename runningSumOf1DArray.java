//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class runningSumOf1DArray {
    public static void main(String[] args){
        int[] num={3,1,2,10,1};
        int[] realAns=runningSum(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(realAns[i]);
        }

    }
    public static int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                arr[i]=nums[i];
            }
            else {
                arr[i]=nums[i]+arr[i-1];
            }
        }
        return arr;
    }
}
