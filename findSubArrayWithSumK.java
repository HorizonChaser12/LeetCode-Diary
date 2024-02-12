//https://leetcode.com/problems/subarray-sum-equals-k/description/

public class findSubArrayWithSumK {
    public static void main(String[] args) {
        int[] a={-1,-1,1};
        int k=0;
        System.out.println(subArrayWithK(a,k));
    }
    static int subArrayWithK(int[] a,int k){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                if (sum==k){
                    count++;
                }
                }
            }
        return count;
    }
}
