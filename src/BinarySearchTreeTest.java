import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree tree;

    @BeforeEach
    void init()
    {
        tree = new BinarySearchTree();
    }

    @Test
    void insertOne()
    {
        tree.insert(new BinaryTreeNode(9));
        assertTrue(tree.contains(9));
    }

    @Test
    void insertMany()
    {
        tree.insert(new BinaryTreeNode(9));
        tree.insert(new BinaryTreeNode(7));
        tree.insert(new BinaryTreeNode(12));
        assertTrue(tree.contains(9));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(12));
    }

    @Test
    void RemoveOne()
    {
        tree.insert(new BinaryTreeNode(9));
        tree.removeElement(new BinaryTreeNode(9));
        assertFalse(tree.contains(9));
    }

    @Test
    void RemoveMany()
    {
        tree.insert(new BinaryTreeNode(9));
        tree.insert(new BinaryTreeNode(7));
        tree.insert(new BinaryTreeNode(12));
        tree.removeElement(new BinaryTreeNode(9));
        tree.removeElement(new BinaryTreeNode(7));
        tree.removeElement(new BinaryTreeNode(12));
        assertFalse(tree.contains(9));
        assertFalse(tree.contains(7));
        assertFalse(tree.contains(12));
    }
    @Test
    void findMinWhenOnlyRoot()
    {
        tree.insert(new BinaryTreeNode(9));
        assertEquals(9,tree.findMin().getElement());
    }

    @Test
    void findMinMultipleHeight()
    {
        tree.insert(new BinaryTreeNode(9));
        tree.insert(new BinaryTreeNode(5));
        tree.insert(new BinaryTreeNode(7));
        tree.insert(new BinaryTreeNode(3));
        assertEquals(3,tree.findMin().getElement());
    }

    @Test
    void findMaxWhenOnlyRoot()
    {
        tree.insert(new BinaryTreeNode(9));
        assertEquals(9,tree.findMax().getElement());
    }

    @Test
    void findMaxMultipleHeight()
    {
        tree.insert(new BinaryTreeNode(3));
        tree.insert(new BinaryTreeNode(7));
        tree.insert(new BinaryTreeNode(5));
        tree.insert(new BinaryTreeNode(8));
        assertEquals(8,tree.findMax().getElement());
    }
}