/**  
* Title: RemoveNthNodeFromEndOfList.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018年11月25日  
* @version 1.0  
*/

//使用两个指针cur、pre，其中cur比pre先行n步，当cur到达末尾时，pre所指的下一个元素即是要删除的元素。
import DataStructure.*;
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {    
        ListNode begin=head;
        ListNode pre=head;
        while(n>0) {
        	begin=begin.next;
        	n--;
        }
        if(begin==null) { //此时已经超到末尾，证明n等于链表的长度
        	return pre.next;
        }
        while(begin.next!=null) {   
        	begin=begin.next;
        	pre=pre.next;
        }
        pre.next=pre.next.next;
        return head;
    }
}
