//https://leetcode.com/problems/intersection-of-two-linked-lists/description/
public class intersectionOfTwoLinkedList {
    static class ListNode {
        int val;
        intersectionOfTwoLinkedList.ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, intersectionOfTwoLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
//        intersectionOfTwoLinkedList.ListNode head1 = new intersectionOfTwoLinkedList.ListNode(1, new intersectionOfTwoLinkedList.ListNode(9, new intersectionOfTwoLinkedList.ListNode(1, new intersectionOfTwoLinkedList.ListNode(2, new intersectionOfTwoLinkedList.ListNode(4)))));
//        intersectionOfTwoLinkedList.ListNode head2 = new intersectionOfTwoLinkedList.ListNode(3, new intersectionOfTwoLinkedList.ListNode(2, new intersectionOfTwoLinkedList.ListNode(4)));
        intersectionOfTwoLinkedList.ListNode head1 = new intersectionOfTwoLinkedList.ListNode(4, new intersectionOfTwoLinkedList.ListNode(1, new intersectionOfTwoLinkedList.ListNode(8, new intersectionOfTwoLinkedList.ListNode(4, new intersectionOfTwoLinkedList.ListNode(5)))));
        intersectionOfTwoLinkedList.ListNode head2 = new intersectionOfTwoLinkedList.ListNode(5, new intersectionOfTwoLinkedList.ListNode(6, new intersectionOfTwoLinkedList.ListNode(1, new intersectionOfTwoLinkedList.ListNode(8, new intersectionOfTwoLinkedList.ListNode(4,new intersectionOfTwoLinkedList.ListNode(5))))));

        intersectionOfTwoLinkedList.ListNode node = getIntersectionNode(head1, head2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode temp2 = headB;
        int count1=0;
        int count2=0;
        while(temp.next!=null){
            count1++;
           temp=temp.next;
        }
        while(temp2.next!=null){
            count2++;
            temp2=temp2.next;
        }
        if (temp.val!=temp2.val){
            return null;
        }
        ListNode temp3 ;
        ListNode temp4 ;
        if(count1>count2){
            temp3 = headA;
            temp4 = headB;
        }
        else{
            temp3 = headB;
            temp4 = headA;
        }
        int counter = Math.abs(count1-count2);
        while(counter>0){
            if (temp3 != null) {
                temp3=temp3.next;
            }
            counter--;
        }
        while(temp3!=null && temp4!=null){
//           The error was appearing here cuz there might be nodes with same value but the address of those nodes should be also same to mark it as an intersection point. So, we finally compared it with the node and we got the answer.
            if (temp3==temp4){
                return temp3;
            }
            temp3=temp3.next;
            temp4=temp4.next;
        }
        return null;
    }
}
