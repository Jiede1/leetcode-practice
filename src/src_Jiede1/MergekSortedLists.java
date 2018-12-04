/**  
* Title: MergekSortedLists.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2018Äê12ÔÂ1ÈÕ  
* @version 1.0  
*/  


package src_Jiede1;


import java.util.Comparator;
import java.util.PriorityQueue;


import DataStructure.*;

public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==1) return lists[0];
		if(lists.length==0) return null;
		int len=lists.length;
		PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
		int i=0;
        while(len%2==0 && i<len) {
        	queue.add(mergeLists(lists[i], lists[i+1]));
        	i+=2;
        }
        while(len%2==1 && i<len) {
        	queue.add(mergeLists(lists[i], lists[i+1]));
        	i+=2;
        	if(i==len-1) {
        		queue.add(lists[i]);
        		break;
        	};
        }
        while(queue.size()!=1) {
        	ListNode p1=queue.poll();
        	ListNode p2=queue.poll();
        	queue.add(mergeLists(p1, p2));
        }
        return queue.peek();

    }
	public ListNode mergeLists(ListNode l1,ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode res=new ListNode(-1);
		ListNode head=res;
		while(l1!=null && l2!=null) {
			int value1=l1.val;
			int value2=l2.val;
			if(value1>value2) {
				res.next=l2;
				l2=l2.next;
			}
			else {
				res.next=l1;
				l1=l1.next;
			}
			res=res.next;
		}
		if(l1==null) {
			res.next=l2;
		}
		else if(l2==null) {
			res.next=l1;
		}
		return head.next;
	}
	public static void main(String[] args) {
		MergekSortedLists aLists=new MergekSortedLists();
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(5);
		l1.next.next.next=new ListNode(100);
		ListNode l2=new ListNode(1);
		l2.next=new ListNode(3);
		l2.next.next=new ListNode(4);
		ListNode l3=new ListNode(2);
		l3.next=new ListNode(6);
		/*
		ListNode bListNode=aLists.mergeLists(l1, l2);
		while(bListNode!=null) {
			System.out.print(bListNode.val+"->");
			bListNode=bListNode.next;
		}*/
		ListNode[] lists= {};
		ListNode cListNode = aLists.mergeKLists(lists);
		while(cListNode!=null) {
			System.out.print(cListNode.val+"->");
			cListNode=cListNode.next;
		}
	}
}
