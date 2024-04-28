//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class mergeTwoSortedLists {
    static class ListNode {
        int val;
        mergeTwoSortedLists.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, mergeTwoSortedLists.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        mergeTwoSortedLists.ListNode head1 = new mergeTwoSortedLists.ListNode(2);
        mergeTwoSortedLists.ListNode head2 = new mergeTwoSortedLists.ListNode(1);
        mergeTwoSortedLists.ListNode node = mergeTwoLists(head1, head2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null && list2 == null) {
//            return null;
//        }
//        if (list1==null){
//            return list2;
//        }
//        else if (list2==null){
//            return list1;
//        }
//        ListNode ans;
//        if (list1.val <= list2.val) {
//            ans = new ListNode(list1.val);
//            list1 = list1.next;
//        } else {
//            ans = new ListNode(list2.val);
//            list2 = list2.next;
//        }
//        ListNode lol = ans;
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                ans.next = new ListNode(list1.val);
//                list1 = list1.next;
//            } else {
//                ans.next = new ListNode(list2.val);
//                list2 = list2.next;
//            }
//            ans = ans.next;
//        }
//        while (list2 != null) {
//            ans.next = new ListNode(list2.val);
//            list2 = list2.next;
//            ans = ans.next;
//        }
//        while (list1 != null) {
//            ans.next = new ListNode(list1.val);
//            list1 = list1.next;
//            ans = ans.next;
//        }
//        return lol;


//        A little bit clean code
        ListNode ans = new ListNode();
        ListNode head=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                head.next=list1;
                list1=list1.next;
                head=head.next;
            }
            else{
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
        }
        while(list1!=null){
            head.next=list1;
            list1=list1.next;
            head=head.next;
        }
        while(list2!=null){
            head.next=list2;
            list2=list2.next;
            head=head.next;
        }
        return ans.next;
    }

}
