import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/description/
public class validParentheses {
    public static void main(String[] args) {
        String s = "({[)";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            char char1 = s.charAt(i);
            if(!stk.isEmpty()){
                if(stk.peek()=='(' && char1 ==')'){
                    stk.pop();
                }
                else if(stk.peek()=='{' && char1 =='}'){
                    stk.pop();
                }
                else if(stk.peek()=='[' && char1 == ']'){
                    stk.pop();
                }
                else{
                    stk.add(char1);
                }
            }
            else{
                stk.add(char1);
            }
        }
        return stk.isEmpty();
    }
    
}
