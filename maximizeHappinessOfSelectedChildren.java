import java.util.*;
public class maximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 2;
        System.out.println(maximumHappinessSum(arr,k));
    }
    static long maximumHappinessSum(int[] happiness, int k) {
        // Fails for large test cases gotta know how to run it in O(n) time complexity
        // Arrays.sort(happiness);
        // long ans = 0;
        // for(int i=happiness.length-1;i>=0 && k!=0;i--){
        //     if (happiness[i]>=0){
        //        ans=ans+happiness[i];
        //     }
        //     k--;
        //     int j=i;
        //     while(j!=0){
        //         happiness[j-1]--;
        //         j--;
        //     }
        // }
        // return ans;
        Arrays.sort(happiness);
        int currDec = 0;
        long totalHap = 0;
        int n = happiness.length;
        for(int i=n-1;i>=n-k;i--){
            totalHap += Math.max(happiness[i] - currDec++, 0);
        }
        return totalHap;
    }
}
