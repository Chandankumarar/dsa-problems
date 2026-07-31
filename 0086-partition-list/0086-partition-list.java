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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=new ListNode(-1,null);
        ListNode head2=new ListNode(-1,null);
        ListNode tail1=head1,tail2=head2,t=head;
        while(t!=null){
             if(t.val<x){
                tail1.next=t;
                tail1=tail1.next;
            }
            else{
                tail2.next=t;;
                tail2=tail2.next;
            }
            t=t.next;
        }
        tail2.next=null;
        tail1.next=head2.next;
        return head1.next;

    }
}