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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode head2 = null;
        ListNode slow = head;
        ListNode fast = head;
        
        // 1. Reverse the first half while finding the middle
        while (fast != null && fast.next != null) {
            ListNode temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp.next = head2;
            head2 = temp;
        }
        
        // 2. Handle odd-length lists: skip the middle element
        if (fast != null) {
            slow = slow.next;
        }
        
        // 3. Compare the reversed first half with the second half
        head = slow; 
        while (head != null && head2 != null) {
            if (head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        
        return true;
    }
}
