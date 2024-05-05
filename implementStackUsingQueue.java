import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
//https://leetcode.com/problems/implement-stack-using-queues/description/
public class implementStackUsingQueue {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(20);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }

//    This solution does get accepted but we are asked to do it only with queue but here we are using deque.
//    static class MyStack {
//        Deque<Integer> queue;
//
//        public MyStack() {
//            queue = new ArrayDeque<>();
//        }
//
//        public void push(int x) {
//            queue.add(x);
//        }
//
//        public int pop() {
//            return queue.removeLast();
//        }
//
//        public int top() {
//            return queue.peekLast();
//        }
//
//        public boolean empty() {
//            return queue.isEmpty();
//        }

//  This solution is the actual correct solution to work and does only use queue.
    static class MyStack {
        Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
        }

        public int pop() {
            for(int i = 1; i<q.size(); ++i) {
                q.add(q.remove());
            }
            return q.remove();
        }

        public int top() {
            for(int i = 1; i<q.size(); ++i) {
                q.add(q.remove());
            }
            int x = q.remove();
            q.add(x);
            return x;
        }

        public boolean empty() {
            if(q.size() > 0) return false;
            return true;
        }
    }
}
