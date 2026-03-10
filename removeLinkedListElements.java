// https://leetcode.com/problems/remove-linked-list-elements/description/
public class removeLinkedListElements {
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
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(1,new ListNode(1)))));
        int val = 1;
        ListNode node = removeElements(head,val);
        while(node!=null){
            System.out.println(node.val);
            node =node.next;
        }
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode dummy = prev;
        while(curr!=null){
            if (curr.val == val) {
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
