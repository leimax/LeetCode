package tree;

import java.util.ArrayList;
import java.util.List;

public class OrderType {
    private static List<BinNode> list = new ArrayList<BinNode>();
    private static BinNode root;

    /**
     * 对该二叉树进行前序遍历 结果存储到list中 前序遍历
     */
    public static void preOrder(BinNode node) {
        list.add(node); // 先将根节点存入list
        // 如果左子树不为空继续往左找，在递归调用方法的时候一直会将子树的根存入list，这就做到了先遍历根节点
        if (node.getlChild() != null) {
            preOrder(node.getlChild());
        }
        // 无论走到哪一层，只要当前节点左子树为空，那么就可以在右子树上遍历，保证了根左右的遍历顺序
        if (node.getrChild() != null) {
            preOrder(node.getrChild());
        }
    }

    /**
     * 对该二叉树进行中序遍历 结果存储到list中
     */
    public static void inOrder(BinNode node) {
        if (node.getlChild() != null) {
            inOrder(node.getlChild());
        }
        list.add(node);
        if (node.getrChild() != null) {
            inOrder(node.getrChild());
        }

    }


    /**
     * 对该二叉树进行后序遍历 结果存储到list中
     */
    public static void postOrder(BinNode node) {
        if (node.getlChild() != null) {
            postOrder(node.getlChild());
        }
        if (node.getrChild() != null) {
            postOrder(node.getrChild());
        }
        list.add(node);
    }



    public static void main(String[] args) {
        init();
        // TODO Auto-generated method stub
        //preOrder(root);
        inOrder(root);
        //postOrder(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getElement() + " ");
        }
    }

    // 树的初始化:先从叶节点开始,由叶到根
    public static void init() {
        BinNode b = new BinNode("b", null, null);
        BinNode a = new BinNode("a", null, b);
        BinNode c = new BinNode("c", a, null);

        BinNode e = new BinNode("e", null, null);
        BinNode g = new BinNode("g", null, null);
        BinNode f = new BinNode("f", e, g);
        BinNode h = new BinNode("h", f, null);

        BinNode d = new BinNode("d", c, h);

        BinNode j = new BinNode("j", null, null);
        BinNode k = new BinNode("k", j, null);
        BinNode m = new BinNode("m", null, null);
        BinNode o = new BinNode("o", null, null);
        BinNode p = new BinNode("p", o, null);
        BinNode n = new BinNode("n", m, p);
        BinNode l = new BinNode("l", k, n);

        root = new BinNode("i", d, l);
    }





}