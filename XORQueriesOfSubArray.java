import java.util.Arrays;
//https://leetcode.com/problems/xor-queries-of-a-subarray/description/
public class XORQueriesOfSubArray {
    public static void main(String[] args) {
        int[] arr = {16};
        int[][] queries = {
                {0, 0},
                {0, 0},
                {0, 0},
        };
        System.out.println(Arrays.toString(xorQueries(arr,queries)));
    }

    static int[] xorQueries(int[] arr, int[][] queries) {
//        Runs in 907ms and works in O(n^2)
//        int[] ans = new int[queries.length];
//        for(int i=0;i< queries.length;i++){
//            ans[i]=arr[queries[i][0]];
//            for (int j = queries[i][0]; j < queries[i][1]; j++) {
//                ans[i]=ans[i]^arr[j+1];
//            }
//        }
//        return ans;

//      Works better and runs in O(n)
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]^arr[i];
        }
        int[] res=new int[queries.length];
        for(int k=0;k<queries.length;k++) {
            int i=queries[k][0];
            int j=queries[k][1];
            if(i==0) {
                res[k]=pre[j];
            } else {
                res[k]=pre[j]^pre[i-1];
            }
        }
        return res;
    }
}
