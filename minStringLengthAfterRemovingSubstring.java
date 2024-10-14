import java.util.Stack;
//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/?envType=daily-question&envId=2024-10-07
public class minStringLengthAfterRemovingSubstring {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
    static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek()=='A' && s.charAt(i)=='B'){
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek()=='C' && s.charAt(i)=='D') {
                stack.pop();
            }
            else {
                stack.add(s.charAt(i));
            }
        }
        return stack.size();
    }
}
