package question2;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
    //打印节点内容
    public void displayLink(){
        System.out.println("{" + val + "}");
    }

}