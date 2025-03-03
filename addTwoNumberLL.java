import java.math.BigInteger;
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
        addTwoNumberLL.ListNode head1 = new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new ListNode(1)))))))))));
        addTwoNumberLL.ListNode head2 = new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new addTwoNumberLL.ListNode(1, new ListNode(1)))))))))));
        addTwoNumberLL.ListNode node = addTwoNumbers(head1, head2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//       1565 / 1569 testcases passed. Fails due to overflow of Long variable, and you can't actually fix it.
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        ListNode head1 = l1;
//        ListNode head2 = l2;
//        while (head1 != null) {
//            list1.add(head1.val);
//            head1 = head1.next;
//        }
//        while (head2 != null) {
//            list2.add(head2.val);
//            head2 = head2.next;
//        }
//        Collections.reverse(list1);
//        Collections.reverse(list2);
//        long number1 = 0;
//        long number2 = 0;
//        while (!list1.isEmpty()) {
//            number1 = number1 * 10 + list1.getFirst();
//            list1.removeFirst();
//        }
//        while (!list2.isEmpty()) {
//            number2 = number2 * 10 + list2.getFirst();
//            list2.removeFirst();
//        }
//        if (number1==0){
//            return l2;
//        }
//        if (number2==0){
//            return l1;
//        }
//        ListNode head;
//        long sum = number1 + number2;
//        ListNode node;
//        if (sum<Integer.MAX_VALUE){
//            node = new ListNode((int) sum % 10);
//            sum = sum / 10;
//        }
//        else{
//            node = new ListNode();
//        }
//        head = node;
//        ListNode temp = head;
//        while (sum >= Integer.MAX_VALUE) {
//            long temp2 = sum % 10;
//            node.val = (int)temp2;
//            temp.next = node;
//            sum = sum / 10;
//        }
//        while (sum > 0) {
//            node = new ListNode((int) sum % 10);
//            sum = sum / 10;
//            temp.next = node;
//            temp = node;
//        }
//        return head;


//        https://leetcode.com/problems/add-two-numbers/solutions/3675747/beats-100-c-java-python-beginner-friendly/
//        You have to use manual addition idea to work upon this problem.
//        The way I was doing can pass to certain test cases only and the overflow is a major problem you can't fix in my code.
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
