import java.util.List;
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//Okay the idea of making another node and then reversing the last part to make it look like the order is reversed can't be done because of the above statement given in the Question.
//https://leetcode.com/problems/reorder-list/?envType=daily-question&envId=2024-03-23
public class reorderLists {
    public static class ListNode {
        int val;
        reorderLists.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, reorderLists.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        reorderLists.ListNode head1 = new reorderLists.ListNode(1, new reorderLists.ListNode(2, new reorderLists.ListNode(3, new reorderLists.ListNode(4, new reorderLists.ListNode(5)))));
        reorderList(head1);
        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }

    static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, next = null;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev; // prev now points to the head of the reversed second half
        while (secondHalf.next != null) {
            next = firstHalf.next;
            prev = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = next;

            firstHalf = next;
            secondHalf = prev;
        }
    }
}
