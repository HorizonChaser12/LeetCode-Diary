//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/?envType=problem-list-v2&envId=stack
import java.util.Stack;

public class removeAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    static String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stk.isEmpty() && stk.peek()==s.charAt(i)){
                stk.pop();
            }
            else {
                stk.add(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        for (char c : stk) {   // stack iteration preserves order
            str.append(c);
        }
        return str.toString();
    }
}
