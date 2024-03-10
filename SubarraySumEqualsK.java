//https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103?leftPanelTabValue=PROBLEM
public class SubarraySumEqualsK {
    public static void main(String[] args) {
       int[] nums = {3,1,2,4};
       int k = 6;
       System.out.println(subarraySum(nums,k));
    }
    static int subarraySum(int[] arr, int s) {
        int L=0,R=0;
        int count=0;
        int sum=0;
        while(R<arr.length){
            sum+=arr[R];
            if(sum==s){
                count++;
                R++;
            }
            else if(sum<s){
                R++;
            }
            else if(sum>s){
                sum-=arr[L];
                L++;
                sum-=arr[R];
            }
        }
        return count;
    }
}
