//https://leetcode.com/problems/maximum-score-after-splitting-a-string/solutions/6210760/beats-100-proof-concise-code-java-beginner-freindly/?envType=daily-question&envId=2025-01-01
public class maximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    static int maxScore(String s) {
        int sum =0;
        int zeroes =0;
        int ones =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                ones++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='0'){
                zeroes++;
            }
            else{
                ones--;
                sum=Math.max(zeroes+ones,sum);
            }
        }
        return sum;
    }
}
//    I couldn't find a logic and later on followed the below logic to know about the solution over here.
//    Step 1: Loop to count the total digit 1 on a string. Call sumOne.
//    Step 2: Init sumZero = 0. Loop again, if the current position is 0, sumZero++. Otherwise, sumOne--. maxScore = max(maxScore, sumZero + sumOne)
