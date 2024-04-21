//https://leetcode.com/problems/linked-list-cycle-ii/description/
//It's like the same as of the 1st part but there is a slight change that before it used to return a boolean value but here we need to give the node and by minor changes to the same code we passed all test cases.
public class linkedListCycle2 {
    public static class ListNode {
        int val;
        linkedListCycle2.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, linkedListCycle2.ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static void main(String[] args) {
            linkedListCycle2.ListNode head = new linkedListCycle2.ListNode(3, new linkedListCycle2.ListNode(2, new linkedListCycle2.ListNode(0, new linkedListCycle2.ListNode(-4))));
            linkedListCycle2.ListNode node = detectCycle(head);
            while (node != null) {
                System.out.println(node.val);
                node = node.next;
            }
        }

        static ListNode detectCycle(ListNode head) {
            ListNode temp=head;
            while(temp!=null){
                if(temp.val==Integer.MAX_VALUE)
                {
                    return temp;
                }
                temp.val=Integer.MAX_VALUE;
                temp=temp.next;
            }
            return null;
        }
    }
}
