package question2;

/*
 *�������������ʾ�����Ǹ������ķǿ����� ��Щ�������෴��˳��洢��
 * �������ǵ�ÿ���ڵ㶼����һ�����֡�
 * ������������ӣ���������Ϊ�����ء�
 * �����ܻ�����������ֳ�������0�������ⶼ�������κ�ǰ���㡣
 * ��
 * ���룺��2-> 4-> 3��+��5-> 6-> 4��
 * �����7-> 0-> 8
 * ˵����342 + 465 = 807��
 *
 */
public class Solution {
    /**
     * ���α���
     * ��һ�α��������������Ӧÿ���ڵ�ֱ�ȡ�ͣ������пսڵ���սڵ�ȡ0������һ��������
     * �ڶ��α�������ȡ��͵�������������жϵ�ǰ��val�Ƿ���ڵ���10�����ڻ������������-10��next��1����nextΪ�����½�0�ڵ㡣
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