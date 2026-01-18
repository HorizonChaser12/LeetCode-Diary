//https://leetcode.com/problems/teemo-attacking/description/
public class teemoAttacking {
    public static void main(String[] args) {
        int[] timeSeries = {1,3,5,7,9,11,13,15};
        int duration = 3;
        System.out.println(findPoisonedDuration(timeSeries,duration));
    }
    static int findPoisonedDuration(int[] timeSeries, int duration) {
        int gap ;
        int ans = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            gap = timeSeries[i]-timeSeries[i-1];
            if(gap>=duration){
                ans += duration;
            }
            else {
                ans += gap;
            }
        }
        return ans;
    }
}
