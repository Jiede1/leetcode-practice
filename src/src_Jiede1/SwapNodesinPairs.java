package src_Jiede1;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: SwapNodesinPairs
 * @time: 2018/12/4$ 20:57$
 * @desc: 参考博客 https://blog.csdn.net/ma_chen_qq/article/details/80112607
 **/
import DataStructure.ListNode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode Head=new ListNode(-1);
        Head.next=head;

        ListNode left=Head;
        ListNode mid=head;
        ListNode right=mid.next;
        while(mid!=null && mid.next!=null){
            mid.next=right.next;     //交换节点的过程
            right.next=mid;
            left.next=right;

            left=mid;                //移动节点的过程
            mid=left.next;

            if(mid!=null)//注意细节：首先要保证mid不为null，才能将mid.next赋值给right。
                right=mid.next;
        }
        return Head.next;
    }
}

