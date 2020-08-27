package question2;

/*
 *您将获得两个表示两个非负整数的非空链表。 这些数字以相反的顺序存储，
 * 并且它们的每个节点都包含一个数字。
 * 将两个数字相加，并将其作为链表返回。
 * 您可能会假设两个数字除了数字0本身以外都不包含任何前导零。
 * 例
 * 输入：（2-> 4-> 3）+（5-> 6-> 4）
 * 输出：7-> 0-> 8
 * 说明：342 + 465 = 807。
 *
 */
public class Solution {
    /**
     * 两次遍历
     * 第一次遍历：两个链表对应每个节点分别取和，若含有空节点则空节点取0，产生一个新链表。
     * 第二次遍历：对取完和的新链表遍历，判断当前的val是否大于等于10，大于或等于则其自身-10其next加1，若next为空则新建0节点。
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(l1.val + l2.val);
        l1 = l1.next;
        l2 = l2.next;
        ListNode temp = rs;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }

            int t = a + b;
            temp.next = new ListNode(t);
            temp = temp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        temp = rs;
        while (temp != null) {
            if (temp.val >= 10) {
                temp.val = temp.val - 10;
                if (temp.next == null) {
                    temp.next = new ListNode(0);
                }
                temp.next.val = temp.next.val + 1;
            }
            temp = temp.next;
        }
        return rs;
    }


    public static void main(String[] args){
        ListNode l111 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        l11.next= l111;
        ListNode l1 = new ListNode(3);
        l1.next = l11;


        ListNode l211 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        l21.next= l211;
        ListNode l2 = new ListNode(1);
        l2.next = l21;



        ListNode listNode = Solution.addTwoNumbers(l1, l2);
        System.out.println("[listNode]:"+listNode);



    }


}