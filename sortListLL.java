import java.util.Arrays;
//https://leetcode.com/problems/sort-list/description/
//Does the work, but it is not a good solution as the question should be solved within the range of LinkedList, but we are using multiple arrays and its function of sort to make the program work. I will add a solution link below to help me find more ways to solve this question without using the arrays or maybe a recursive approach.
//https://leetcode.com/problems/sort-list/solutions/46767/java-solution-with-strict-o-1-auxiliary-space-complexity/
//https://leetcode.com/problems/sort-list/solutions/166324/c++-and-java-legit-solution.-O(nlogn)-time-and-O(1)-space!-No-recursion!-With-detailed-explaination/
public class sortListLL {
    static class ListNode {
        int val;
        sortListLL.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, sortListLL.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        sortListLL.ListNode head = new sortListLL.ListNode(4,new sortListLL.ListNode(2,new sortListLL.ListNode(1,new sortListLL.ListNode(3))));
        sortListLL.ListNode node = sortList(head);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    static ListNode sortList(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr = new int[size];
        ListNode temp1 = head;
        int i=0;
        while(temp1!=null){
            arr[i]=temp1.val;
            temp1=temp1.next;
            i++;
        }
        Arrays.sort(arr);
        i=0;
        ListNode temp2 = head;
        while(temp2!=null){
            temp2.val=arr[i];
            i++;
            temp2=temp2.next;
        }
        return head;
    }
}
