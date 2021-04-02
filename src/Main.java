public class Main {
    public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
        BinaryTreeNode node = new BinaryTreeNode();
        node.setElement(1);
        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(2);
        BinaryTreeNode node2 = new BinaryTreeNode();
        node2.setElement(3);
        BinaryTreeNode node3 = new BinaryTreeNode();
        node3.setElement(4);
        BinaryTreeNode node4 = new BinaryTreeNode();
        node4.setElement(5);
        BinaryTreeNode node5 = new BinaryTreeNode();
        node5.setElement(6);
        BinaryTreeNode node6 = new BinaryTreeNode();
        node6.setElement(7);
        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(8);

        BinaryTreeNode node8 = new BinaryTreeNode();
        node8.setElement(9);
        tree.insert(node);
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
       tree.insert(node5);
        tree.insert(node6);
       tree.insert(node7);
       //tree.insert(node8);
       BinaryTreePrint print = new BinaryTreePrint();
        print.printTree(tree.getRoot());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        tree.rebalance();
       // tree.leftRotation(tree.getRoot());
        //tree.leftRotation(tree.getRoot());
        print.printTree(tree.getRoot());

/*
        System.out.println(tree.height());
        for (var btn:tree.levelOrder()
        ) {
            System.out.print(" " + btn.getElement());

        }*/
/*
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(tree.findMax().getElement());
*/

    }
}
