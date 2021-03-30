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
        if(getRoot()!=null)
        {
            balance(getRoot());
        }

    }

    private void balance(BinaryTreeNode node)
    {
    if(node!=null)
    {
        balance(node.getLeftChild());
        balance(node.getRightChild());
        int leftBalance = getNodeHeight(node.getLeftChild());
        int rightBalance = getNodeHeight(node.getRightChild());
        if(Math.abs(leftBalance-rightBalance)>1)
        {
            if(leftBalance>rightBalance)
                rightRotation(node);
            else
                leftRotation(node);
        }
    }
    }

    public void leftRotation(BinaryTreeNode node)
    {
        BinaryTreeNode tempNode = null;
        if(node.getRightChild().getLeftChild()!=null)
        {
            tempNode = node.getRightChild().getLeftChild();
        }
        if(getRoot().getElement()==node.getElement())
        {
            setRoot(node.getRightChild());
        }
        node.getRightChild().addLeftChild(node);
        if(tempNode!=null)
            node.addRightChild(tempNode);

    }
    public void rightRotation(BinaryTreeNode node)
    {
        BinaryTreeNode tempNode = null;
        if(node.getLeftChild().getRightChild()!=null)
        {
            tempNode = node.getLeftChild().getRightChild();
        }
        if(getRoot().getElement()==node.getElement())
        {
            setRoot(node.getLeftChild());
        }
        node.getLeftChild().addRightChild(node);
        if(tempNode!=null)
            node.addLeftChild(tempNode);
    }
    
}
