//Initially I couldn't figure the logic or Intuition behind it. The below solution shows the correct logic for solving this problem.
//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/solutions/6008345/beats-100-00-for-loop-explained-with-example/
public class minNumberOfChangesToMakeBinaryStringBeautiful {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(minChanges(s));
    }

    static int minChanges(String s) {
        int steps = 0;
        for (int i = 0; i < s.length(); i=i+2) {
            if (s.charAt(i)!=s.charAt(i+1)){
                steps++;
            }
        }
        return steps;
    }
}
