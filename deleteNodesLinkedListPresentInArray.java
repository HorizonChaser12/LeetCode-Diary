import java.util.HashSet;
//https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?envType=daily-question&envId=2024-09-06
public class deleteNodesLinkedListPresentInArray {
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
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int[] nums = {1,2,3};
        ListNode node = modifiedList(nums,head);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

    static ListNode modifiedList(int[] nums, ListNode head) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        while(head!=null){
            if (!set.contains(head.val)){
                dummy.next=new ListNode(head.val);
                dummy=dummy.next;
            }
            head=head.next;
        }
        return ans.next;
    }
}
