//https://leetcode.com/problems/best-sightseeing-pair/description/
public class bestSightSeeingPair {
    public static void main(String[] args) {
        int[] values = {8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(values));
    }
    static int maxScoreSightseeingPair(int[] values) {
//        Works with small data and uses two pointer approach
        int i = 0;
        int j = values.length - 1;
        int innermax = 0;
        while (i<values.length-1) {
            if(i<j){
                innermax = Math.max(innermax, values[i] + values[j] + i - j);
            }
            j--;
            if (j<=0){
                j= values.length-1;
                i++;
            }
        }
        return innermax;
//       A better approach with O(n) complexity
//        int maxScore = 0;  // Maximum score seen so far
//        int maxI = values[0];  // Maximum value of values[i] + i have seen so far
//
//        for (int j = 1; j < values.length; j++) {
//            maxScore = Math.max(maxScore, maxI + values[j] - j);
//            maxI = Math.max(maxI, values[j] + j);
//        }
//
//        return maxScore;
    }
}
