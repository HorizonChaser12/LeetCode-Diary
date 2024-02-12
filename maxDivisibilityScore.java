//https://leetcode.com/problems/find-the-maximum-divisibility-score/description/
public class maxDivisibilityScore {
    public static void main(String[] args) {
        int[] nums={31,91,47,6,37,62,72,42,85};
        int[] divisors={95,10,8,43,21,63,26,45,23,69,16,99,92,5,97,69,33,44,8};
        System.out.println(maxDivScore(nums,divisors));
    }
    static int maxDivScore(int[] nums, int[] divisors) {
        int max=0,ans=divisors[0];
        for(int i:divisors){
            int c=0;
            for(int j:nums){
                if(j%i==0)
                    c++;
            }
            if(c>max||(c==max&&ans>i)){
                ans=i;
                max=c;
            }
        }
        return ans;
    }
}
