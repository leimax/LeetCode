package question114;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 给定一个二叉树，原地将它展开为一个单链表。
 例如，给定二叉树

 1
 / \
 2   5
 / \   \
 3   4   6
 将其展开为：

 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 */
public class Solution {
    public TreeNode flatten(TreeNode root) {
        if (root == null) return root;
        if (root.left == null && root.right == null) return root;
        //如果右子树为空左子树不为空
        if (root.left != null && root.right == null) {
            root.right = root.left;
            root.left = null;
        }
        //如果右子树不为空左子树为空对右子树进行递归
        if (root.left == null && root.right != null) {
            flatten(root.right);
            return root;
        }
        //如果左右子树都不为空左右子树分别递归 递归完把左子树加进到右子树中
        if (root.left != null && root.right != null) {
            flatten(root.left);
            flatten(root.right);
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.right = left;
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
            root.left = null;
        }

        System.out.println(root);
        return root;

    }
    public static void main(String[] str){
        TreeNode no = new  TreeNode(1);
        TreeNode no1 = new  TreeNode(2);
        no.left=no1;
        TreeNode no2 = new  TreeNode(3);

        TreeNode no6 = new  TreeNode(7);
        TreeNode no7 = new  TreeNode(8);
        no2.left=no6;
        no2.right=no7;

        no1.left=no2;
        TreeNode no3 = new  TreeNode(4);
        no1.right=no3;
        TreeNode no4 = new  TreeNode(5);
        no.right=no4;
        TreeNode no5 = new  TreeNode(6);
        no4.right=no5;

        Solution so = new Solution();

        TreeNode aa = so.flatten(no);
        //onesline(no);
        System.out.println("[aa]:"+aa);
    }

    //先将左子树拉直，再将右子树拉直，置空左子树，拼接右子树
    public static void onesline(TreeNode root) {
        if(root==null)
            return ;
        onesline(root.left);
        onesline(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right!=null) {
            root = root.right;
        }
        root.right = temp;
        System.out.println("");
    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}