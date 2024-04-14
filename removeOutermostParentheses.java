//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class removeOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        int counter=0;
        int first = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                if (counter==0){
                    first = i;
                }
                counter++;
            }
            else if(s.charAt(i)==')'){
                counter--;
            }
            if(counter==0){
                ans.append(s,first+1,i);
            }
            i++;
        }
        return ans.toString();
    }
}
