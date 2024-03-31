import java.util.List;

//https://leetcode.com/problems/reorder-list/?envType=daily-question&envId=2024-03-23
public class reorderLists {
    public static class ListNode {
        int val;
        reorderLists.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, reorderLists.ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        reorderLists.ListNode head1= new reorderLists.ListNode(0,new reorderLists.ListNode(1,new reorderLists.ListNode(2,new reorderLists.ListNode(3,new reorderLists.ListNode(4,new reorderLists.ListNode(5,new reorderLists.ListNode(6,new reorderLists.ListNode(7,new reorderLists.ListNode(8,new reorderLists.ListNode(9))))))))));
        reorderLists.ListNode node = reorderList(head1);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    static public ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode temp1 = new ListNode();
        ListNode temp2 = head;
        while(temp!=null){
            temp=temp.next.next;
            temp1.next=temp;
            temp1=temp1.next;
        }
//      Reverse the elements we got in the above list
        ListNode prev = null, next = null;
        while (temp2 != null) {
            next = temp2.next;
            temp2.next = prev;
            prev = temp2;
            temp2 = next;
        }


        return prev;
    }
}
