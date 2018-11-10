package src_Jiede1;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import DataStructure.ListNode;

public class AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if(l1 == null || l2 == null) return null;
		 ListNode listNode = new ListNode((l1.val+l2.val)%10);
		 ListNode head = listNode;
		 while(l1.next != null && l2.next != null) {
			 int data=0;
			 if((l1.val+l2.val)>=10) {
				 data=l1.next.val+l2.next.val+1;
			 }
			 else {
				 data=l1.next.val+l2.next.val;
			 }
			 ListNode status = new ListNode(data%10);
			 listNode.next = status;
			 listNode = status;
			 
			 if (l1.next != null) l1 = l1.next;
			 if (l2.next != null) l2 = l2.next;
		 }
		 if((l1.val+l2.val)>=10)
		     listNode.next = new ListNode(1);
		 
		 if(l1.next == null && l1.next != null) listNode.next = new ListNode(l2.next.val);
			if(l2.next == null && l1.next != null) listNode.next = new ListNode(l1.next.val);
		 
		 return head;
		 
	 } 	
	 public static void main(String[] args) {
		 ListNode node = new ListNode(0);
	     //node.next = new ListNode(8);
	     //node.next.next = new ListNode(9);

	     ListNode node1 = new ListNode(7);
	     node1.next = new ListNode(3);
	     //node1.next.next = new ListNode(9);

	     ListNode result = new AddTwoNumbers().addTwoNumbers(node, node1);
	     
	     result.print(result);
	     
	 }
}
