import java.util.ArrayList;

public class BinaryTree
{
    private int size;
    private BinaryTreeNode root;

    public BinaryTree()
    {
        size = 0;
        root = null;
    }
    protected void increaseSize()
    {
        size++;
    }
    public int size()
    {
        return size;
    }

    public BinaryTreeNode getRoot()
    {
        return root;
    }

    protected void setRoot(BinaryTreeNode root)
    {
        this.root = root;
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    public boolean contains(int element)
    {
        BinaryTreeNode node = root;
        while(node!=null) {

            if (node.getElement() == element ) {
                return true;
            } else if (element > node.getElement())
            {
                node = node.getRightChild();
            }
            else
            {
                node= node.getLeftChild();
            }

        }
        return false;
    }

    private void inOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list)
    {
        if(node!=null)
        {
            inOrderTraversal(node.getLeftChild(),list);
            list.add(node);
            inOrderTraversal(node.getRightChild(),list);
        }
    }

    private void PreOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list)
    {
        if(node!=null)
        {
            list.add(node);
            PreOrderTraversal(node.getLeftChild(),list);
            PreOrderTraversal(node.getRightChild(),list);
        }
    }

    private void PostOrderTraversal(BinaryTreeNode node, ArrayList<BinaryTreeNode> list)
    {
        if(node!=null)
        {

            PostOrderTraversal(node.getLeftChild(),list);
            PostOrderTraversal(node.getRightChild(),list);
            list.add(node);
        }
    }

    public ArrayList<BinaryTreeNode> inOrder()
    {
        ArrayList<BinaryTreeNode> inOrder = new ArrayList<>();

        if(root==null)
        {
            return null;
        }

        inOrderTraversal(root,inOrder);

        return inOrder;
    }
    public ArrayList<BinaryTreeNode> preOrder()
    {
        ArrayList<BinaryTreeNode> preOrder = new ArrayList<>();
        if(root==null)
        {
            return null;
        }

        PreOrderTraversal(root,preOrder);
        return preOrder;
    }
    public ArrayList<BinaryTreeNode> postOrder()
    {
        ArrayList<BinaryTreeNode> postOrder = new ArrayList<>();

        if(root==null)
        {
            return null;
        }

        PostOrderTraversal(root,postOrder);

        return postOrder;
    }
    public ArrayList<BinaryTreeNode> levelOrder()
    {
        ArrayList<BinaryTreeNode> levelOrder = new ArrayList<>();
        if(root ==null)
            return null;
        else
        {
            int levelNo = getNodeHeight(getRoot());
            for(int i=0;i<levelNo+1;i++)
            {
            LevelOrderTraversal(root,levelOrder,i);
            }
            return levelOrder;
        }

    }
    private void LevelOrderTraversal(BinaryTreeNode node,ArrayList<BinaryTreeNode> levelOrder,int levelNo)
    {
        if(node == null)
        {
            return;
        }
        if(levelNo == 0)
        {
            levelOrder.add(node);
        }
        else {
            LevelOrderTraversal(node.getLeftChild(),levelOrder,levelNo-1);
            LevelOrderTraversal(node.getRightChild(),levelOrder,levelNo-1);
        }


    }
    protected int getNodeHeight(BinaryTreeNode node) {
        if (node == null)
        {
            return -1;
        }
        return Math.max(getNodeHeight(node.getLeftChild()),getNodeHeight(node.getRightChild())) + 1;
    }
    public int height()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
            {
                return getNodeHeight(root);
            }

    }
}
