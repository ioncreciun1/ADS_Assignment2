public class BinaryTreeNode {
    private int element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;
    public BinaryTreeNode()
    {

    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void addLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void addRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
