public class rotateList {
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
        ListNode head = new ListNode(0,new ListNode(1,new ListNode(2)));
        int k=4;
        ListNode node = rotateRight(head,k);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode ans = new ListNode();
        int counter=0,size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        if (size<k){

        }
        else{
        while(temp!=null){
            if (counter==size-k){
               while(temp.next!=null){
                   ans=temp;
                   ans.next=temp.next;
                   temp=temp.next;
               }
            }
            temp=temp.next;
            counter++;
        }
        }
        ListNode dummy = ans;
        temp=head;
        counter=0;
        while(ans.next!=null){
            ans=ans.next;
        }
        while(temp!=null && counter!=size-k){
            ans.next=temp;
            ans=ans.next;
            temp=temp.next;
            counter++;
        }
        ans.next=null;
        return dummy;
    }
}
