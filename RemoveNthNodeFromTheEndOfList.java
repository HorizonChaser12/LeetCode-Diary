//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=daily-question&envId=2024-03-03
public class RemoveNthNodeFromTheEndOfList {
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
            ListNode head = new ListNode(1, new ListNode(2));
            int x = 2;
            ListNode node = removeNthFromEnd(head, x);
            while (node != null) {
                System.out.println(node.val);
                node = node.next;
            }
        }

    static ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode node = head;
//        ListNode node1;
//        if (node.next==null){
//            node=null;
//            return node;
//        }
//        int size=0;
//        while(node!=null){
//            node=node.next;
//            size++;
//        }
//        if(size<1){
//            node.next=null;
//            return head;
//        }
//        node = head;
//        ListNode prev = null;
//        int pos = size - n;
//        if(pos == 0) return head.next;
//
//        for(int i = 0; i < pos; i++) {
//            prev = node;
//            node = node.next;
//        }
//        prev.next = node.next;
//        node = null;
//        return head;

        if(head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while(i!=n){
            fast = fast.next;
            i++;
        }
        if (fast == null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
