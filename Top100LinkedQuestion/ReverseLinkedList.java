/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    //头插法
    /*
    public ListNode reverseList(ListNode head) {
        ListNode a = new ListNode(-1);
        ListNode p = head;
        while(p!=null){
            ListNode nex = p.next;
            p.next = a.next;
            a.next = p;
            p = nex;
        }
        return a.next;
    }
    */
    //就地反转法
    /*
    public ListNode reverseList(ListNode head){
        if (head == null)
              return head;
        ListNode a = new ListNode(-1);
        a.next = head;
        ListNode pre = head;
        ListNode nex = head.next;
        while(nex!=null){
            pre.next = nex.next;
            nex.next = a.next;
            a.next = nex;
            nex = pre.next;
        }
        return a.next;
    }
    */
    //递归
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode newHead = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}