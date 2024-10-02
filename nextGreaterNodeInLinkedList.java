//https://leetcode.com/problems/next-greater-node-in-linked-list/description/
public class nextGreaterNodeInLinkedList {

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
        ListNode head = new ListNode(2,new ListNode(7,new ListNode(4, new ListNode(3, new ListNode(5)))));
        int[] node = nextLargerNodes(head);
        for (int i = 0; i < node.length; i++) {
            System.out.println(node[i]);
        }
    }
    static int[] nextLargerNodes(ListNode head) {
//      code works well but the runtime is high and from the submission section we can see that the use of stacks and array can further improve the runtime.
        ListNode temp = head;
        int size = 0;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        int[] ans = new int[size];
        int i = 0;
        while (head != null) {
            ListNode temp2 = head.next;
            while (temp2 != null) {
                if (temp2.val > head.val) {
                    ans[i] = temp2.val;
                    break;
                }
                temp2 = temp2.next;
            }
            i++;
            head = head.next;
        }
        return ans;
    }
}
