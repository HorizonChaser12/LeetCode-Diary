//https://www.naukri.com/code360/problems/find-length-of-loop_8160455?leftPanelTabValue=PROBLEM
public class findLengthOfLoopLL {
    static class Node {
        public int data;
        public Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow = head, fast = head;
        int c = 1;
        boolean loop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loop = true;
                break;
            }
        }
        if (loop == true) {
            fast = fast.next;
            while (slow != fast) {
                c += 1;
                fast = fast.next;
            }
        } else {
            return 0;
        }
        return c;
    }
}

