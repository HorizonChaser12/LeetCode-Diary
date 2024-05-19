//https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/description/?envType=problem-list-v2&envId=mass27dg
public class doubleANumberRepresentedAsALinkedList {
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
        ListNode head = new ListNode(1,new ListNode(8, new ListNode(9)));
        ListNode node = doubleIt(head);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode doubleIt(ListNode head) {
        // This code does work great but fails where the doubled integer crosses the integer range.
        // ListNode temp = head;
        // long number=0;
        // while(temp!=null){
        //     number=number*10+temp.val;
        //     temp=temp.next;
        // }
        // number=number*2;
        // if(number==0){
        //     return new ListNode(0);
        // }
        // List<Integer> list = new ArrayList<>();
        // while(number>0){
        //     list.add((int)number%10);
        //     number=number/10;
        // }
        // Collections.reverse(list);
        // ListNode ans= new ListNode(0);
        // ListNode dummy = ans;
        // while(!list.isEmpty()){
        //     ListNode temp1 = new ListNode(list.get(0));
        //     ans.next=temp1;
        //     ans=ans.next;
        //     list.remove(0);
        // }
        // return dummy.next;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode temp = reverse(head);
        int carry = 0;
        while (temp != null) {
            int sum = temp.val * 2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            temp = temp.next;
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
