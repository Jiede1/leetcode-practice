package src_Jiede1;

/**
 * @author: Jiede1
 * @contact: 3081881935@qq.com
 * @file: ReverseNodesinkGroup
 * @time: 2018/12/5$ 19:29$
 * @desc: 在此写上代码文件的功能描述
 **/
import DataStructure.ListNode;

import java.util.List;

public class ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode root = new ListNode(-1);

        root.next = head;

        ListNode res = root;

        ListNode temp = head;

        int i = 0;

        while(temp != null){

            i++;

            temp = temp.next;

        }  //i的最终结果就是链表中所有节点的总个数

        while(i >= k){

            for(int j = 0 ; j < k-1; j++){  //按上面分析中讲的思路进行反转链表的操作

                ListNode node = root.next;  //如果以k个结点为一组进行反转，就要进行k-1次翻转操作
                System.out.println(node.val);

                System.out.println(node.val+","+head.val+","+root.val);

                root.next = head.next;         //比如k=3，就是两次操作：将2翻转到1前面+将3翻转到1前面

                head.next = root.next.next;

                root.next.next = node;
                System.out.println(node.val+","+head.val+","+root.val);

            }  //for循环里面是一次翻转操作

            root = head;

            head = head.next;   //以k为一组，就要将head移动到已经反转过的结点后面继续以k个结点为一组进行反转

            i-=k;                       //此时一共i个结点减去已经反转过的k个结点得到剩余节点个数

        }

        return res.next;

    }
    public  static  void main(String[] args){
        ReverseNodesinkGroup a=new ReverseNodesinkGroup();
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next= new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        a.reverseKGroup(l,3);
    }
}
