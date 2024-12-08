import java.util.HashSet;
//https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description/?envType=daily-question&envId=2024-12-06
public class maximumNumberOfIntegersToChooseFromARange1 {
    public static void main(String[] args) {
        int[] banned = {11};
        int n = 7, maxSum = 50;
        System.out.println(maxCount(banned,n,maxSum));
    }
    static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        int sum = 0,count =0;
        for (int i = 1; i < n+1; i++) {
            if (!set.contains(i)){
                sum+=i;
                count++;
            }
            if (sum>maxSum){
                count--;
                sum-=i;
            }
        }
        return count;
    }
}
