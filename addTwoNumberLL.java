import java.util.*;
//https://leetcode.com/problems/add-two-numbers/description/
public class addTwoNumberLL {
    static class ListNode {
        int val;
        addTwoNumberLL.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, addTwoNumberLL.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        addTwoNumberLL.ListNode head1 = new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9))))))))));
        addTwoNumberLL.ListNode head2 = new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9, new addTwoNumberLL.ListNode(9))))))))));
        addTwoNumberLL.ListNode node = addTwoNumbers(head1, head2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode head1 = l1;
        ListNode head2 = l2;
        while (head1 != null) {
            list1.add(head1.val);
            head1 = head1.next;
        }
        while (head2 != null) {
            list2.add(head2.val);
            head2 = head2.next;
        }
        Collections.reverse(list1);
        Collections.reverse(list2);
        long number1 = 0;
        long number2 = 0;
        while (!list1.isEmpty()) {
            number1 = number1 * 10 + list1.get(0);
            list1.remove(0);
        }
        while (!list2.isEmpty()) {
            number2 = number2 * 10 + list2.get(0);
            list2.remove(0);
        }
        if (number1==0){
            return l2;
        }
        if (number2==0){
            return l1;
        }
        ListNode head;
        long sum = number1 + number2;
        System.out.println(sum);
        ListNode node;
        if (sum<Integer.MAX_VALUE){
            node = new ListNode((int) sum % 10);
            sum = sum / 10;
        }
        else{
            node = new ListNode();
        }
        head = node;
        ListNode temp = head;
        while (sum >= Integer.MAX_VALUE) {
            sum = sum / 10;
        }
        while (sum > 0) {
            node = new ListNode((int) sum % 10);
            sum = sum / 10;
            temp.next = node;
            temp = node;
        }
        return head;
    }
}
