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
        reverseLinkedList2.ListNode head = new reverseLinkedList2.ListNode(1, new reverseLinkedList2.ListNode(2, new reverseLinkedList2.ListNode(3, new reverseLinkedList2.ListNode(4, new reverseLinkedList2.ListNode(5)))));
        int left = 2;
        int right = 4;
        reverseLinkedList2.ListNode node = reverseBetween(head, left, right);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp1 = head;
        int counter = 0;
        while (temp1 != null) {
            if (counter == left-1) {
                break;
            }
            counter++;
            temp1 = temp1.next;

        }
        counter=0;
        ListNode temp2 = head;
        while (temp2 != null) {
            if (counter == right) {
                break;
            }
            counter++;
            temp2 = temp2.next;
        }

        return head;
    }
}
