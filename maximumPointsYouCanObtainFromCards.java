//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
public class maximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {96,90,41,82,39,74,64,50,30};
        int k = 8;
        System.out.println(maxScore(cardPoints,k));
    }
    static int maxScore(int[] cardPoints, int k) {
//        This might work for some of the test cases. 16 / 40 testcases passed.
//        int total_sum = 0;
//        int n=cardPoints.length;
//        for (int i = 0; i < n; i++) {
//            total_sum+=cardPoints[i];
//        }
//        if (k==cardPoints.length){
//            return total_sum;
//        }
//        int start =0;
//        int end = cardPoints.length-1;
//        int max =0;
//        while (k!=0){
//            if (cardPoints[start]>cardPoints[end]){
//                max+=cardPoints[start];
//                start++;
//            }
//            else {
//                max+=cardPoints[end];
//                end--;
//            }
//            k--;
//        }
//        return max;

//        runtime-2641ms. Although for my small brain it did passed, all the test cases but, I couldn't have thought of this solution in any way. Like without the hints the question is like nowhere can be completed.
        int total_sum = 0;
        int n=cardPoints.length;
        for (int i = 0; i < n; i++) {
            total_sum+=cardPoints[i];
        }
        if (k==cardPoints.length){
            return total_sum;
        }
        int start =0;
        int end = n-k;
        int max =0;
        int sum;
        while (start<cardPoints.length && end<=cardPoints.length) {
            sum =0;
            for (int j = start; j < end; j++) {
                sum+=cardPoints[j];
            }
            end++;
            start++;
            if (sum!=0){
            max=Math.max(max,total_sum-sum);
            }
        }
        return max;
    }
}
