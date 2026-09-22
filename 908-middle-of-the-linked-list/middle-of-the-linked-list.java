/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode fast;
        ListNode slow;
        fast=slow=head;
        while(fast!=null){
            fast=fast.next;
            if(fast==null) break;
            slow=slow.next;
            fast=fast.next;
            if(fast==null) break;
        }
        return slow;
    }
}