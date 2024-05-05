import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/
//The code is correct,its just that I couldn't recreate the environment that LeetCode made to test this code.
public class implementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(20);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }

    static class MyQueue {
        private Stack<Integer> stack;
        private Stack<Integer> stack2;

        public MyQueue() {
            stack = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            int popele = stack2.pop();
            while (!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            return popele;
        }

        public int peek() {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            int topele = stack2.peek();
            while (!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            return topele;
        }

        public boolean empty() {
            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 *
 */

}
