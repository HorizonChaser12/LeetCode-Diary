//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class minAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    static int minAddToMakeValid(String s) {
        int openparen = 0;
        int closeparen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openparen++;
            } else if (s.charAt(i) == ')' && openparen > 0) {
                openparen--;
            } else {
                closeparen++;
            }
        }
        System.out.println(openparen);
        System.out.println(closeparen);
        return closeparen + openparen;
    }
}
