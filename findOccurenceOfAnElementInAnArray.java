//https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/description/?envType=problem-list-v2&envId=array
import java.util.Arrays;


public class findOccurenceOfAnElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,3,1,7};
        int[] queries = {1,3,2,4};
        int x = 1;
        System.out.println(Arrays.toString(occurrencesOfElement(nums,queries,x)));
    }
    static  int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] freq = new int[nums.length];
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==x){
                freq[k]=i;
                k++;
                count++;
            }
        }
        int[] ans = new int[queries.length];
        Arrays.fill(ans,-1);
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            if (queries[i]<=count){
            ans[i]=freq[queries[i]-1] == -1 ? -1:freq[queries[i]-1];
            }
            else {
                ans[i]=-1;
            }
        }
        return ans;
    }
}


//[-1,-1,1,-1,-1,7,1,-1]
