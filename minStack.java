import java.util.Stack;
//https://leetcode.com/problems/min-stack/
public class minStack {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        private int min;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();

        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (stack.isEmpty()) return;
            int popped = stack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            if (stack.isEmpty()) return -1;
            return stack.peek();
        }

        public int getMin() {
            if (minStack.isEmpty()) return -1;
            return minStack.peek();
        }
    }
}
