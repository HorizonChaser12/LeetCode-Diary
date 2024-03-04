//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=daily-question&envId=2024-03-03
public class RemoveNthNodeFromTheEndOfList {
    public static void main(String[] args) {
//        no code in the main as I don't have the driver code for running the LL from Leetcode so that's all.
    }
    private static class ListNode{
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value=value;
        }
        public ListNode(int value,ListNode next){
            this.value=value;
            this.next=next;
        }
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        ListNode node1;
        if (node.next==null){
            node=null;
            return node;
        }
        int size=0;
        while(node!=null){
            node=node.next;
            size++;
        }
        if(size<1){
            node.next=null;
            return head;
        }
        node = head;
        ListNode prev = null;
        int pos = size - n;
        if(pos == 0) return head.next;

        for(int i = 0; i < pos; i++) {
            prev = node;
            node = node.next;
        }
        prev.next = node.next;
        node = null;
        return head;
    }
}
