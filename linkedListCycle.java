//https://leetcode.com/problems/linked-list-cycle/
//I couldn't replicate the description but the answer is correct.Check description if you want to check the logic and stuff.
public class linkedListCycle {
    public static class ListNode {
        int val;
        linkedListCycle.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, linkedListCycle.ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        linkedListCycle.ListNode head = new linkedListCycle.ListNode(3,new linkedListCycle.ListNode(2,new linkedListCycle.ListNode(0,new linkedListCycle.ListNode(-4))));
        System.out.println(hasCycle(head));
    }
    static boolean hasCycle(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==Integer.MAX_VALUE)
            {
                return true;
            }
            temp.val=Integer.MAX_VALUE;
            temp=temp.next;
        }
        return false;
    }
}
