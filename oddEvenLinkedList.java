//https://leetcode.com/problems/odd-even-linked-list/
public class oddEvenLinkedList {
    static class ListNode {
        int val;
        oddEvenLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, oddEvenLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        oddEvenLinkedList.ListNode head = new oddEvenLinkedList.ListNode(1,new oddEvenLinkedList.ListNode(2,new oddEvenLinkedList.ListNode(3,new oddEvenLinkedList.ListNode(4,new oddEvenLinkedList.ListNode(5)))));
        oddEvenLinkedList.ListNode node = oddEvenList(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    static ListNode oddEvenList(ListNode head) {
        if( head == null || head.next == null ){
            return head;
        }
        ListNode fast= head.next;
        ListNode slow= head;
        ListNode evenhead=fast;
        while(fast!=null && fast.next!=null){
            slow.next = slow.next.next;
            fast.next = fast.next.next;
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=evenhead;
        return head;
    }
}
