//https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class mergeNodesInBetweenZeros {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
//        0,3,1,0,4,5,2,0
        ListNode head = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
        ListNode node = mergeNodes(head);
        while (node!= null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while (temp != null) {
                int sum = 0;
                while (temp.val != 0) {
                    sum += temp.val;
                    temp = temp.next;
                }
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                temp=temp.next;
            }
        return ans.next;
    }
}
