//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/?envType=daily-question&envId=2024-03-12
public class RemoveZeroSumNodesFromLinkedList {
    public static class ListNode {
        int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode head= new ListNode(1,new ListNode(-1));
        ListNode node = removeZeroSumSublists(head);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    static ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr= new int[size];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        int L=0;
        int R=1;
        while(L<arr.length && L<R){
            int sum=0;
            sum=sum+arr[L];
            while(R<arr.length){
                sum=sum+arr[R];
                if(sum==0){
                    while(R!=L-1){
                        arr[R]=0;
                        R--;
                    }
                    break;
                }
                R++;
            }
            L++;
            R=L+1;
        }
        i=0;
        while(i<arr.length && arr[i]==0){
                i++;
        }
        if (i==arr.length){
            return null;
        }
        ListNode temp1 = new ListNode(arr[i]);
        i++;
        head=temp1;
        while(i<arr.length){
            if (arr[i]!=0){
                temp1.next=new ListNode(arr[i]);
                temp1=temp1.next;
            }
            i++;
        }
        return head;
    }
}
