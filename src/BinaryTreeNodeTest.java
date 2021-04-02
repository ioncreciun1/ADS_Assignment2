import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest {



    @Test
    void setElement() {
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(5);
        assertEquals(5,node.getElement());
    }

    @Test
    void getLeftChild() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        node.addLeftChild(new BinaryTreeNode(3));
        assertEquals(3,node.getLeftChild().getElement());
    }
    @Test
    void addRightChild() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        node.addRightChild(new BinaryTreeNode(7));
        assertEquals(7,node.getRightChild().getElement());
    }
}