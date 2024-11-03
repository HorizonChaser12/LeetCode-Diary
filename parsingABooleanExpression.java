import java.util.Stack;
//https://leetcode.com/problems/parsing-a-boolean-expression/description/?envType=daily-question&envId=2024-10-20
public class parsingABooleanExpression {
    public static void main(String[] args) {
        String s = "!(f)";
        System.out.println(parseBoolExpr(s));
    }

    static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char curr = expression.charAt(i);
            if (curr == '&' || curr == '|' || curr == '!') {
                operators.add(curr);

            } else if (curr == 't' || curr == 'f' || curr == '(') {
                stack.add(curr);

            } else if (curr == ')') {
                popAndEvaluate(stack, operators);
            }
        }
        return stack.pop() == 't';
    }

    static void popAndEvaluate(Stack<Character> vals, Stack<Character> ops) {
        boolean res = vals.pop() == 't';
        while(!vals.isEmpty() && vals.peek() != '('){
            boolean nxt = vals.pop() == 't';
            if(ops.peek() == '&')res = res & nxt;
            if(ops.peek() == '|')res = res | nxt;
        }
        if(ops.peek() == '!')res = !res;
        ops.pop();
        vals.pop();
        vals.add(res ? 't' : 'f');
    }
}
