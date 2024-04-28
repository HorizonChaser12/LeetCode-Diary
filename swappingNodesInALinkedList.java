//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
//Swapping the values is quite easy, but previously I thought of swapping the nodes.So, below I will provide a link on how to swap the nodes, you have to check it out in the near future.
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/solutions/3525464/o-n-o-1-interview-safe-solution-actually-swap-the-nodes-easy-to-read-code/
public class swappingNodesInALinkedList {
    static class ListNode {
        int val;
        swappingNodesInALinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, swappingNodesInALinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int k=2;
        ListNode node = swapNodes(head,k);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode slow =head;
        ListNode fast = head;
        int val = 0;
        int val2 = 0;
        int counter=0;
        while (slow!=null){
            counter++;
            if (counter == k ){
                val=slow.val;
                break;
            }
            slow=slow.next;
        }
        counter=0;
        while (fast!=null){
            counter++;
            if (counter == size-k+1){
                val2=fast.val;
                break;
            }
            fast=fast.next;
        }
        int hehe = val;
        slow.val=val2;
        fast.val=hehe;

        return head;
    }
}
