/**  
* Title: RemoveLinkedListElement.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019Äê1ÔÂ27ÈÕ  
* @version 1.0  
*/  


package easy;
import DataStructure.*;

public class RemoveLinkedListElement {
	public ListNode removeElements(ListNode head, int val) {
        if(head==null) {
            return head;
        }
        while(head!=null && head.val == val) {
            head = head.next;
        }
        ListNode n = head;
        while(n!=null && n.next!=null) {
            if(n.next.val == val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return head;
    }
	public ListNode removeElements1(ListNode head, int val) {
        ListNode x= new ListNode(0);
        x.next=head;
        ListNode y=x;
        while(x.next!=null){
            if(x.next.val==val){
                x.next=x.next.next;
            }
            else{
                x=x.next;
            }
        }
        return y.next!=null?y.next:null;
    }
}
