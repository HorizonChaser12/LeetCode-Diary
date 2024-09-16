public class splitLinkedListIntoParts {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3)));
        int k =5;
        ListNode[] node = splitListToParts(head,k);
        int i=0;
        while(i!=node.length){
            System.out.println(node[i].val);
            i++;
        }

    }

    static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode current = head;
        int size=0;
        while(current!=null){
            size++;
            current=current.next;
        }
        int divisions = size / k;
        int remainingPart = size%k;
        current = head;
        ListNode prev = current;
        return new ListNode[]{new ListNode(2),new ListNode(3)};
    }
}
