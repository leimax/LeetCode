package tree;

public class BinNode {
    private Object element;
    private BinNode lChild;// 定义指向左子树的指针
    private BinNode rChild;// 定义指向右子树的指针

    public BinNode(Object element, BinNode lChild, BinNode rChild) {
        this.element = element;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public Object getElement() {
        return element;
    }

    public BinNode setElement(Object element) {
        this.element = element;
        return this;
    }

    public BinNode getlChild() {
        return lChild;
    }

    public BinNode setlChild(BinNode lChild) {
        this.lChild = lChild;
        return this;
    }

    public BinNode getrChild() {
        return rChild;
    }

    public BinNode setrChild(BinNode rChild) {
        this.rChild = rChild;
        return this;
    }
}