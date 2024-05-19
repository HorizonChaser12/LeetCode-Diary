//https://leetcode.com/problems/remove-nodes-from-linked-list/description/?envType=daily-question&envId=2024-05-06
public class removeNodesFromLinkedList {
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
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(1,new ListNode(1,new removeNodesFromLinkedList.ListNode(1)))));
        ListNode node = removeNodes(head);
        while(node!=null){
            System.out.println(node.val);
            node =node.next;
        }
    }

    static ListNode removeNodes(ListNode head) {
//      Works well for small test cases but due to 2 while loops, fails for higher no. of nodes in the head Linked List.
//        ListNode ans = new ListNode();
//        ListNode dummy = ans;
//        ListNode next = head.next;
//        ListNode currentNode = head;
//        while(currentNode.next!=null){
//            while(next!=null){
//                if (currentNode.val<next.val){
//                    break;
//                }
//                else if (next.next==null){
//                    ans.next=new ListNode(currentNode.val);
//                    ans=ans.next;
//                }
//                next=next.next;
//            }
//            currentNode=currentNode.next;
//            next=currentNode.next;
//
//
//        }
//        ans.next= new ListNode(currentNode.val);
//        return dummy.next;

        head = reverse(head);
        ListNode temp = head;
        int largest = Integer.MIN_VALUE;
        ListNode next = null;
        ListNode prev = null;
        while(temp != null){
            next = temp.next;
            if(temp.val >= largest){
                largest = temp.val;
                prev = temp;
            }else{
                temp.next = null;
                prev.next = next;
            }
            temp = next;
        }
        return reverse(head);
    }

    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
