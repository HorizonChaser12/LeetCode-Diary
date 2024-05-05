//https://leetcode.com/problems/middle-of-the-linked-list/
public class middleOfTheLL {
    static class ListNode {
        int val;
        middleOfTheLL.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, middleOfTheLL.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        middleOfTheLL.ListNode head = new middleOfTheLL.ListNode(1,new middleOfTheLL.ListNode(2,new middleOfTheLL.ListNode(3,new middleOfTheLL.ListNode(4,new middleOfTheLL.ListNode(5)))));
        middleOfTheLL.ListNode node = middleNode(head);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode middleNode(ListNode head) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // int mid=size/2;
        // temp=head;
        // while(mid>0){
        //     temp=temp.next;
        //     mid--;
        // }
        // return temp;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next; 
            }
            slow = slow.next;
        }
        return slow;
    }
}
