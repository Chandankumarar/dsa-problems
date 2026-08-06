class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // 1. Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // BUG FIX: Changed fast.next to fast.next.next
        }

        // 2. Reverse the second half of the list
        ListNode curr = slow.next;
        slow.next = null; // Splitting the lists
        ListNode h2 = null;
        while (curr != null) { // BUG FIX: Iterating over curr, not slow
            ListNode t = curr.next;
            curr.next = h2;
            h2 = curr;
            curr = t;
        }

        // 3. Merge both halves alternately
        ListNode curr1 = head, curr2 = h2;
        while (curr1 != null && curr2 != null) {
            ListNode t1 = curr1.next;
            ListNode t2 = curr2.next;

            curr1.next = curr2;
            curr2.next = t1;

            curr1 = t1;
            curr2 = t2;
        }
    }
}
