import java.util.Stack;
//https://leetcode.com/problems/longest-valid-parentheses/description/
public class longestValidParentheses {
    public static void main(String[] args) {
        String s="(()";
        System.out.println(longestValidParenthesess(s));
    }
    static int longestValidParenthesess(String s) {
        int n = s.length();
        int result = 0;

        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(')
                stk.push(i);
            else{
                if(!stk.empty())
                    stk.pop();

                if(!stk.empty())
                    result = Math.max(result,i-stk.peek());
                else stk.push(i);
            }
        }

        return result;
    }
}
