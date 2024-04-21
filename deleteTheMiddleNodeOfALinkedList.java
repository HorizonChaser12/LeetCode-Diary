//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class deleteTheMiddleNodeOfALinkedList {
    static class ListNode {
        int val;
        deleteTheMiddleNodeOfALinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, deleteTheMiddleNodeOfALinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        deleteTheMiddleNodeOfALinkedList.ListNode head = new deleteTheMiddleNodeOfALinkedList.ListNode(1,new deleteTheMiddleNodeOfALinkedList.ListNode(3,new deleteTheMiddleNodeOfALinkedList.ListNode(4,new deleteTheMiddleNodeOfALinkedList.ListNode(7,new deleteTheMiddleNodeOfALinkedList.ListNode(1,new deleteTheMiddleNodeOfALinkedList.ListNode(2,new deleteTheMiddleNodeOfALinkedList.ListNode(6)))))));
        ListNode Node = deleteMiddle(head);
        while (Node!=null){
            System.out.println(Node.val);
            Node=Node.next;
        }
    }
    static ListNode deleteMiddle(ListNode head) {
        if( head == null || head.next == null ){
            return null;
        }
        ListNode temp = head;
        int size = 0;
        ListNode temp1 = head;
        while(temp1!=null){
            temp1=temp1.next;
            size++;
        }
        int counter = 0;
        while(temp!=null){
            if(counter==size/2 - 1){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            counter++;
        }
        return head;
    }

}
