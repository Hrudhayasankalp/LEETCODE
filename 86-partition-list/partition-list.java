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
        ListNode start = new ListNode();
        ListNode end = new ListNode();
        ListNode temp=head;

        ListNode s=start;
        ListNode e=end;
        while(temp!=null){
            if(temp.val<x){
                s.next=temp;
                s=s.next;
            }
            else{
                e.next=temp;
                e=e.next;
            }
            temp=temp.next;
        }
        e.next=null;
        s.next=end.next;

        return start.next;
    }
}