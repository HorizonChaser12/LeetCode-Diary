import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/reverse-linked-list/description/
public class reverseLinkedList {
    static class ListNode {
        int val;
        reverseLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, reverseLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        reverseLinkedList.ListNode head = new reverseLinkedList.ListNode(1, new reverseLinkedList.ListNode(2, new reverseLinkedList.ListNode(3, new reverseLinkedList.ListNode(4, new reverseLinkedList.ListNode(5)))));
        reverseLinkedList.ListNode node = reverseList(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode reverseList(ListNode head) {
//        This is a naive approach as this includes using inbuilt functions to rewrite the values in the LL.
//        if (head == null) {
//            return null;
//        }
//        List<Integer> list;
//        list = new ArrayList<>();
//        ListNode temp = head;
//        while (temp != null) {
//            list.add(temp.val);
//            temp = temp.next;
//        }
//        Collections.reverse(list);
//        ListNode ans = new ListNode(list.get(0));
//        ListNode tail = ans;
//        for (int i = 1; i < list.size(); i++) {
//            tail.next = new ListNode(list.get(i));
//            tail = tail.next;
//        }
//        return ans;

//      A good solution
        ListNode temp=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }
}
