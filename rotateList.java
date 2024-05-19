//https://leetcode.com/problems/rotate-list/
public class rotateList {
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
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k=2;
        ListNode node = rotateRight(head,k);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int size = 0;
        ListNode temp = head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        temp = head;
        int counter = 0;
        k = k % size;
        if (k == 0) {
            return head;
        }
        while(k!=0){
            while(temp.next!=null){
                temp=temp.next;
            }
            ans.next=new ListNode(temp.val);
            ans=ans.next;
            temp=head;
            while(counter!=size-1){
                ans.next=new ListNode(temp.val);
                ans=ans.next;
                temp=temp.next;
                counter++;
            }
            head=dummy;
            ans=new ListNode();
            temp=head;
            counter=0;
            k--;
        }
        return dummy.next;
    }
}