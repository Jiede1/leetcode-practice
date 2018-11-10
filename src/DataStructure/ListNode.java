package DataStructure;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	
	 /**
     * 创建测试数据
     *
     * @param data [XX,XX,XX]
     * @return {@link ListNode}
     */
	public ListNode createTestData(String data) {
		if(data.equals("[]")) return null;
		data = data.substring(1,data.length()-1);
		String[] array = data.split(",");
		ListNode listNode = new ListNode(Integer.valueOf(array[0]));
		ListNode p = listNode;
		for(int i=1;i<array.length;i++) {
			ListNode pListNode = new ListNode(Integer.valueOf(array[i]));
			listNode.next = pListNode;
			listNode = pListNode;
		}
		listNode.next = null;
		//p.print(p);
		return p;
	}
	public void print(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
        ListNode p = listNode.next;
        while (p != null) {
            str.append(",").append(String.valueOf(p.val));
            p = p.next;
        }
        System.out.println(str.append("]"));
    }
	public static void main(String[] args) {
		ListNode testD = new ListNode(0);
		ListNode pListNode = testD.createTestData("[1,12,3]");
		testD.print(pListNode);
		
	}
}
