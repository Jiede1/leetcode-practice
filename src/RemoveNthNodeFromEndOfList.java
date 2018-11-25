/**  
* Title: RemoveNthNodeFromEndOfList.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018��11��25��  
* @version 1.0  
*/

//ʹ������ָ��cur��pre������cur��pre����n������cur����ĩβʱ��pre��ָ����һ��Ԫ�ؼ���Ҫɾ����Ԫ�ء�
import DataStructure.*;
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {    
        ListNode begin=head;
        ListNode pre=head;
        while(n>0) {
        	begin=begin.next;
        	n--;
        }
        if(begin==null) { //��ʱ�Ѿ�����ĩβ��֤��n��������ĳ���
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
