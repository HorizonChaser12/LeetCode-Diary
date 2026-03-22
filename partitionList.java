//https://leetcode.com/problems/partition-list/description/?envType=problem-list-v2&envId=linked-list
public class partitionList {
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
        ListNode head = new ListNode(1,new ListNode(4,new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        int x = 3;
        ListNode node = partition(head,x);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    static ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                dummy.next = new ListNode(temp.val);
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.val>=x){
                dummy.next = new ListNode(temp.val);
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}
