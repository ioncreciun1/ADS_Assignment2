
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinarySearchTree tree;
    @BeforeEach
    void setUp()
    {
        tree = new BinarySearchTree();
    }

    @Test
    void sizeZero()
    {
        assertEquals(0,tree.size());
    }

    @Test
    void sizeOne()
    {
        BinaryTreeNode node = new BinaryTreeNode(5);
        tree.insert(node);
        assertEquals(1,tree.size());
    }

    @Test
    void sizeMultiple()
    {
        BinaryTreeNode node = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(7);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        assertEquals(3,tree.size());
    }

    @Test
    void getEmptyRoot()
    {
        assertNull(tree.getRoot());
    }
    @Test
    void getRoot()
    {
        BinaryTreeNode node = new BinaryTreeNode(5);
        tree.insert(node);
        assertEquals(5,tree.getRoot().getElement());
    }

    @Test
    void TreeisEmpty()
    {
       // BinaryTreeNode node = new BinaryTreeNode(5);
      //  tree.insert(node);
        assertEquals(true,tree.isEmpty());
    }
    @Test
    void TreeIsNotEmpty()
    {
         BinaryTreeNode node = new BinaryTreeNode(5);
          tree.insert(node);
        assertEquals(false,tree.isEmpty());
    }

    @Test
    void TreeContains()
    {

        BinaryTreeNode node = new BinaryTreeNode(5);
        tree.insert(node);
        BinaryTreeNode node1 = new BinaryTreeNode(3);
        tree.insert(node1);
        BinaryTreeNode node2 = new BinaryTreeNode(1);
        tree.insert(node2);
        BinaryTreeNode node3 = new BinaryTreeNode(7);
        tree.insert(node3);
        assertTrue(tree.contains(3));
    }

    @Test
    void TreeNotContains()
    {

        BinaryTreeNode node = new BinaryTreeNode(5);
        tree.insert(node);
        BinaryTreeNode node1 = new BinaryTreeNode(3);
        tree.insert(node1);
        BinaryTreeNode node2 = new BinaryTreeNode(1);
        tree.insert(node2);
        BinaryTreeNode node3 = new BinaryTreeNode(7);
        tree.insert(node3);
        assertEquals(false,tree.contains(4));
    }
    @Test
    void TreeInOrderTraversalEmpty()
    {
        assertNull(tree.inOrder());
    }

    @Test
    void TreeInOrderTraversal()
    {
        ArrayList<BinaryTreeNode> inOrderTraversal = new ArrayList<>();
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(9);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(7);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setElement(12);
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setElement(5);
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setElement(8);
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setElement(11);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setElement(15);
        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(17);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node6);
        tree.insert(node7);
        inOrderTraversal.add(node3);
        inOrderTraversal.add(node1);
        inOrderTraversal.add(node4);
        inOrderTraversal.add(node);
        inOrderTraversal.add(node5);
        inOrderTraversal.add(node2);
        inOrderTraversal.add(node6);
        inOrderTraversal.add(node7);
        assertEquals(inOrderTraversal,tree.inOrder());
    }

    @Test
    void TreePreOrderTraversalEmpty()
    {
        assertNull(tree.preOrder());
    }

    @Test
    void TreePreOrderTraversal()
    {
        ArrayList<BinaryTreeNode> preOrderTraversal = new ArrayList<>();
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(9);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(7);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setElement(12);
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setElement(5);
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setElement(8);
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setElement(11);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setElement(15);
        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(17);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node6);
        tree.insert(node7);
        preOrderTraversal.add(node);
        preOrderTraversal.add(node1);
        preOrderTraversal.add(node3);
        preOrderTraversal.add(node4);
        preOrderTraversal.add(node2);
        preOrderTraversal.add(node5);
        preOrderTraversal.add(node6);
        preOrderTraversal.add(node7);
        assertEquals(preOrderTraversal,tree.preOrder());
    }
    @Test
    void TreePostOrderTraversalEmpty()
    {
        assertNull(tree.postOrder());
    }

    @Test
    void TreePostOrderTraversal()
    {
        ArrayList<BinaryTreeNode> postOrderTraversal = new ArrayList<>();
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(9);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(7);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setElement(12);
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setElement(5);
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setElement(8);
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setElement(11);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setElement(15);
        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(17);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node6);
        tree.insert(node7);
        postOrderTraversal.add(node3);
        postOrderTraversal.add(node4);
        postOrderTraversal.add(node1);
        postOrderTraversal.add(node5);
        postOrderTraversal.add(node7);
        postOrderTraversal.add(node6);
        postOrderTraversal.add(node2);
        postOrderTraversal.add(node);
        assertEquals(postOrderTraversal,tree.postOrder());
    }

    @Test
    void TreeLevelOrderTraversalEmpty()
    {
        assertNull(tree.levelOrder());
    }

    @Test
    void TreeLevelOrderTraversal()
    {
        ArrayList<BinaryTreeNode> levelOrderTraversal = new ArrayList<>();
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(9);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(7);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setElement(12);
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setElement(5);
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setElement(8);
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setElement(11);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setElement(15);
        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(17);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node6);
        tree.insert(node7);
        levelOrderTraversal.add(node);
        levelOrderTraversal.add(node1);
        levelOrderTraversal.add(node2);
        levelOrderTraversal.add(node3);
        levelOrderTraversal.add(node4);
        levelOrderTraversal.add(node5);
        levelOrderTraversal.add(node6);
        levelOrderTraversal.add(node7);
        assertEquals(levelOrderTraversal,tree.levelOrder());
    }

    @Test
    void getEmptyHeight()
    {
        assertEquals(-1,tree.height());
    }

    @Test
    void getZeroHeight()
    {
        tree.insert(new BinaryTreeNode(5));
        assertEquals(0,tree.height());
    }
    @Test
    void getOneHeight()
    {
        tree.insert(new BinaryTreeNode(5));
        tree.insert(new BinaryTreeNode(6));
        assertEquals(1,tree.height());
    }

    @Test
    void getMultipleHeight()
    {
        tree.insert(new BinaryTreeNode(5));
        tree.insert(new BinaryTreeNode(3));
        tree.insert(new BinaryTreeNode(4));
        tree.insert(new BinaryTreeNode(1));
        tree.insert(new BinaryTreeNode(8));
        tree.insert(new BinaryTreeNode(7));
        tree.insert(new BinaryTreeNode(9));
        assertEquals(2,tree.height());
    }
}