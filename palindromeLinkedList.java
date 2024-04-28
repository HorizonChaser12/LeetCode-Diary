import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/palindrome-linked-list/
//The problem with this code is this is a question of LL, but we are using different data structures and its properties to get to our solution.So,below is the link to a solution where 4 approaches are given to show how it can be done without using extra space as well as the other approaches run faster.
//https://leetcode.com/problems/palindrome-linked-list/solutions/4908031/interview-approach-4-approach-list-stack-recursion-two-pointer-approach/
public class palindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, palindromeLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        palindromeLinkedList.ListNode head= new palindromeLinkedList.ListNode(1,new palindromeLinkedList.ListNode(0,new palindromeLinkedList.ListNode(0)));
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(ListNode head) {
//        ListNode temp = head;
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        while (temp != null) {
//            list.add(temp.val);
//            list2.add(temp.val);
//            temp = temp.next;
//        }
//        Collections.reverse(list);
//        return list.equals(list2);

//      A good solution using only LL operations.
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }
        fast=reverse(slow);
        ListNode temp = head;
        while(fast!=null && temp!=null){
            if (temp.val!=fast.val){
                return false;
            }
            temp=temp.next;
            fast=fast.next;
        }
        return true;
    }
    static ListNode reverse (ListNode head){
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
