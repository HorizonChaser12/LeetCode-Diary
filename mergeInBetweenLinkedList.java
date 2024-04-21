//https://leetcode.com/problems/merge-in-between-linked-lists/description/?envType=daily-question&envId=2024-03-20
public class mergeInBetweenLinkedList {
    static class ListNode {
        int val;
        mergeInBetweenLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, mergeInBetweenLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        mergeInBetweenLinkedList.ListNode head1 = new mergeInBetweenLinkedList.ListNode(0, new mergeInBetweenLinkedList.ListNode(1, new mergeInBetweenLinkedList.ListNode(2, new mergeInBetweenLinkedList.ListNode(3, new mergeInBetweenLinkedList.ListNode(4, new mergeInBetweenLinkedList.ListNode(5, new mergeInBetweenLinkedList.ListNode(6, new mergeInBetweenLinkedList.ListNode(7, new mergeInBetweenLinkedList.ListNode(8, new mergeInBetweenLinkedList.ListNode(9))))))))));
        mergeInBetweenLinkedList.ListNode head2 = new mergeInBetweenLinkedList.ListNode(1000000, new mergeInBetweenLinkedList.ListNode(1000001, new mergeInBetweenLinkedList.ListNode(1000002)));
        mergeInBetweenLinkedList.ListNode node = mergeInBetween(head1, 3, 5, head2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//      Runs in 2ms
        ListNode temp = list1;
        int pointer = 0;
        ListNode tempNode = new ListNode();

        while (temp != null) {
            if (pointer == b + 1) {
                tempNode = temp;
                temp = temp.next;
                ListNode head = tempNode;
                while (temp != null) {
                    head.next = temp;
                    head = head.next;
                    temp = temp.next;
                }
            } else {
                pointer++;
                temp = temp.next;
            }
        }
        temp = list1;
        pointer = 0;
        while (temp != null) {
            if (pointer == a - 1) {
                while (list2 != null) {
                    temp.next = list2;
                    list2 = list2.next;
                    temp = temp.next;
                    if (list2 == null) {
                        temp.next = tempNode;
                        break;
                    }
                }
            }
            pointer++;
            temp = temp.next;
        }
        return list1;


//       Same approach but runs a little faster than my code i.e. 1ms
//        ListNode temp = list1, tempprev = temp;
//        int i = 0 ;
//        while(i < a){
//            tempprev = temp;
//            temp = temp.next;
//            i++;
//        }
//        if(a == b){
//            temp = temp.next;
//            tempprev.next = list2;
//            while(tempprev.next != null){
//                tempprev = tempprev.next;
//            }
//            tempprev.next = temp;
//            return list1;
//        }
//        else{
//            while(i < b){
//                temp = temp.next;
//                i++;
//            }
//        }
//        tempprev.next = list2;
//        while(tempprev.next != null){
//            tempprev = tempprev.next;
//        }
//        tempprev.next = temp.next;
//        return list1;
    }
}
