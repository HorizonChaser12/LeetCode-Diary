//https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class swapNodes{
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static void main() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode ans = swapPairs(head);
        while(ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    static ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        boolean flag = false;
        while(temp != null && temp.next != null){
            ListNode first = temp;
            ListNode second = temp.next;
            ListNode third = temp.next.next;
            second.next = first;
            first.next = third;
            if(!flag){
                head = second;
                flag = true;
            }
            if(prev != null){
                prev.next = second;
            }
            prev = first;
            temp = third;
        }
        return head;
    }
}
