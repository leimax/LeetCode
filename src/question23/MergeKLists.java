package question23;

public class MergeKLists {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode head = mergeKLists(lists);
        while (head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len==0)
            return null;
        if (len==1)
            return lists[0];
        for (int i = 0; i < len-1; i++) {
            lists[i+1] = mergeTwoLink(lists[i],lists[i+1]);
            System.out.println(lists[i+1]);
        }
        return lists[len-1];
    }

    private static ListNode mergeTwoLink(ListNode list, ListNode list1) {
        ListNode p = list;    //初始化第一条链的指针
        ListNode q = list1;   //初始化第二条链的指针
        //ListNode head = new ListNode(list.val<list1.val?list.val:list1.val);   //初始化头指针
        ListNode head = new ListNode(0);   //随机初始化一个头,后期将该指针向后移一位即可
        ListNode node = head;           //用来遍历形成链的节点指针
        while (p!=null&&q!=null){
            if (p.val<q.val){
                node.next=p;
                node = node.next;
                p = p.next;
            }else {
                node.next = q;
                node = node.next;
                q = q.next;
            }
        }
        if (p!=null){
            node.next = p;
        }
        if (q!=null){
            node.next = q;
        }
        head = head.next;
        return head;
    }
}