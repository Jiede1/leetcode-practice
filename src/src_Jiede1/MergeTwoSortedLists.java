package src_Jiede1;
import java.util.List;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: MergeTwoSortedLists
 * @time: 2018/11/26$ 17:38$
 * @desc: 在此写上代码文件的功能描述
 **/
import DataStructure.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                temp.next=l2;
                l2=l2.next;
            }
            else {
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        while(l1==null && l2!=null){
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }
        while(l2==null&&l1!=null){
            temp.next=l1;
            l1=l1.next;
            temp=temp.next;
        }
        return head.next;
    }
}


