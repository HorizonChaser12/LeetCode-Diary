import java.util.Arrays;
//https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/
//Code fully works in the LeetCode website but I dont know why the last critical node is not getting marked in this code editor.
public class findMinMaxNodesBetweenCriticalPoints {
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
        ListNode head = new ListNode(5,new ListNode(3,new ListNode(1,new ListNode(2, new ListNode(5,new ListNode(1,new ListNode(1,new ListNode(2))))))));
        int[] ans = nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(ans));
    }
    static int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode temp = head.next;
        int prev = head.val;
        int first = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int prevcric = Integer.MAX_VALUE;
        int counter = 1;
        while(temp.next!=null){
            counter++;
            if (temp.val>temp.next.val && temp.val>prev){
                if (first==Integer.MAX_VALUE){
                    first = counter;
                }
                else if (Math.abs(counter-prevcric)<min){
                    min=Math.abs(counter-prevcric);

                }
                prevcric=counter;
            }
            else if ( temp.val<temp.next.val && temp.val<prev){
                if (first==Integer.MAX_VALUE){
                    first = counter;
                }
                else if (Math.abs(counter-prevcric)<min){
                    min=Math.abs(counter-prevcric);

                }
                prevcric=counter;
            }
            prev=temp.val;
            temp=temp.next;
        }
        return min == Integer.MAX_VALUE ? new int[]{-1,-1} :new int[]{min,Math.abs(first-prevcric)};
    }

}
