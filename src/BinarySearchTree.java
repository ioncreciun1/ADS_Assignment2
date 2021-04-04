import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree
{
    public void insert(BinaryTreeNode element)
    {
        BinaryTreeNode node = getRoot();
        if(node == null)
        {
            setRoot(element);
        }
        else
        {

            BinaryTreeNode parent = null;
            while(node!=null)
            {
                parent = node;
                if(node.getElement()>element.getElement())
                {
                    node = node.getLeftChild();
                }
                else {
                    node =node.getRightChild();
                }

            }

            if(parent.getElement()>element.getElement())
                parent.addLeftChild(element);
            else
                parent.addRightChild(element);
        }
        increaseSize();
    }
    public void removeElement(BinaryTreeNode element)
    {
        BinaryTreeNode node = getRoot();
        while(node!=null)
        {
            BinaryTreeNode parent = node;

            if(node.getElement()>element.getElement())
                node= node.getLeftChild();
            else if(node.getElement()<element.getElement())
                node = node.getRightChild();

            if(node.getElement()==element.getElement())
            {
                if(node.getRightChild()==null && node.getLeftChild()==null)
                {
                    if(parent.getElement()>element.getElement())
                        parent.addLeftChild(null);
                    else
                        parent.addRightChild(null);
                }

                else if(node.getRightChild()!=null  && node.getLeftChild()==null)
                {
                    if(parent.getElement()>node.getElement())
                        parent.addLeftChild(node.getRightChild());
                    else
                        parent.addRightChild(node.getRightChild());
                }

              else if(node.getRightChild()==null  && node.getLeftChild()!=null )

                    if(parent.getElement()>node.getElement())
                        parent.addLeftChild(node.getLeftChild());
                    else
                        parent.addRightChild(node.getLeftChild());

                else
                    {

                        BinaryTreeNode succ =  findMinByNode(node.getRightChild());
                        int value = succ.getElement();
                        removeElement(succ);
                        node.setElement(value);

                    }
                node = null;
            }
        }
        if(getRoot().getElement()==element.getElement())
        {
            setRoot(null);
        }
    }

    private BinaryTreeNode findMinByNode(BinaryTreeNode node)
    {
        while(node.getLeftChild()!=null)
        {
            node = node.getLeftChild();
        }
        return node;
    }
    public  BinaryTreeNode findMin()
    {
        BinaryTreeNode node = getRoot();
        if(node == null)
            return null;
        while(node.getLeftChild()!=null)
        {
            node = node.getLeftChild();
        }

        return node;
    }
    public BinaryTreeNode findMax()
    {

        BinaryTreeNode node = getRoot();
        if(node == null)
            return null;
        while(node.getRightChild()!=null)
        {
            node = node.getRightChild();
        }

        return node;
    }
    public void rebalance()
    {
        ArrayList<BinaryTreeNode> order = inOrder();
        setRoot(balanceTree(order,0,order.size()-1));
    }
    private BinaryTreeNode balanceTree(ArrayList<BinaryTreeNode> nodes, int start, int end)
    {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        BinaryTreeNode node = nodes.get(mid);

        node.addLeftChild(balanceTree(nodes,start,mid-1));
        node.addRightChild(balanceTree(nodes,mid+1,end));
        return node;
    }
}
