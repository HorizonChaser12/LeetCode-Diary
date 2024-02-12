import java.util.Arrays;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/
public class sumOfEvenNumberAfterQueries {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {
                {1,0},
                {-3,1},
                {-4,0},
                {2,3},
                };
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums,queries)));
    }
    static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans=new int[nums.length];
        int sum=0;
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum = sum + nums[i];
            }
        }
        for (int row = 0; row < queries.length; row++) {
            int temp= nums[queries[row][1]];
            if (temp%2==0){
                sum-=temp;
                temp=temp+queries[row][0];
                if (temp%2==0){
                    sum=sum+temp;
                }
            }
            else{
                temp=temp+queries[row][0];
                if (temp%2==0){
                    sum=sum+temp;
                }
            }
            ans[index]=sum;
            index++;
            nums[queries[row][1]]=temp;
            }
        return ans;
    }
}
