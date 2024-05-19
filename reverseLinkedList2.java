//https://leetcode.com/problems/reverse-linked-list-ii/description/
public class reverseLinkedList2 {
    static class ListNode {
        int val;
        reverseLinkedList2.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, reverseLinkedList2.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        reverseLinkedList2.ListNode head = new reverseLinkedList2.ListNode(1, new reverseLinkedList2.ListNode(2, new reverseLinkedList2.ListNode(3,new reverseLinkedList2.ListNode(4,new reverseLinkedList2.ListNode(5)))));
        int left = 3;
        int right = 4;
        reverseLinkedList2.ListNode node = reverseBetween(head, left, right);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next==null || left==right){
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode ans=dummy;
        ListNode temp1 = head;
        int counter = 0;
        while (temp1 != null) {
            if (counter == left-1) {
                break;
            }
            else{
                dummy.next=new ListNode(temp1.val);
                dummy=dummy.next;
            }
            counter++;
            temp1 = temp1.next;

        }
        counter=0;
        ListNode temp2 = head;
        int haw = right;
        while (temp2 != null) {
            if (counter == right-1) {
                dummy.next=new ListNode(temp2.val);
                dummy=dummy.next;
                right--;
                counter=left-1;
                temp2=temp1;
            }
            counter++;
            assert temp2 != null;
            temp2 = temp2.next;
        }
        dummy.next=new ListNode(temp1.val);
        dummy=dummy.next;
        temp2=head;
        counter=0;
        while(temp2!=null){
            if (counter!=haw){
                temp2=temp2.next;
                counter++;
            }
            else{
                dummy.next=new ListNode(temp2.val);
                dummy=dummy.next;
                temp2=temp2.next;
            }
        }
        return ans.next;
    }
}
