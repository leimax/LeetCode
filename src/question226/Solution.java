package question226;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode startNode = head; //记录m-1的点
        ListNode preNode = head;        //记录当前点的前一个点
        ListNode nextNode = head; //记录当前点的下一个点
        ListNode node = head;
        int index = 1;
        if(m==1){       //第一个点开始翻转
            while(index <= n){
//                node = node.next;
                nextNode = node.next;       //记录下一个点
                if(index !=1){      //不是第一个点就交换指针
                    node.next = preNode;
                    preNode = node;
                }
                node = nextNode;
                index++;
            }
            startNode.next = node;
            return preNode;
        }else{      //后面点开始翻转
            ListNode temp = null;
            while(index <=n){
                if(index == m-1) {      //记录翻转点前一个点
                    startNode = node;
                    temp = node.next;
                }
                nextNode = node.next;       //记录下一个点
                if(index !=1 && index > m){      //不是第一个点就交换指针
                    node.next = preNode;
                }
                preNode = node;
                node = nextNode;
                index++;
            }
            startNode.next = preNode;
            temp.next = node;
            return head;
        }
    }
    public static void main(String[] str){
        ListNode no = new  ListNode(1);
        ListNode no1 = new  ListNode(2);
        no.next=no1;
        ListNode no2 = new  ListNode(3);
        no1.next=no2;
        ListNode no3 = new  ListNode(4);
        no2.next=no3;
        ListNode no4 = new  ListNode(5);
        no3.next=no4;

        ListNode newnode = reverseBetween(no,2,3);
        System.out.println(newnode);
    }
}




class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}