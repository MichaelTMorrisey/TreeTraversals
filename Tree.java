/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetraversals;

/**
 *
 * @author Michael.T.Morrisey
 */
public class Tree 
{
    //each tree has a root, which is the top node
    private Node root;
    //each tree has a height property, which represents the number of levels
    private int height;
    //each tree has a size property, which reprepsents the total number
    //of nodes in the tree
    private int size;
    
    //******************************************************************
    //null constructor
    Tree()
    {
        root = null;
        height = 0;
        size = 0;
    }// end null constructor
    
    //******************************************************************
    //initializing constructor
    Tree(int[] myArr)
    {
        //a pointer to use to step through the tree and find where to add
        //the new node -- will be null when the proper place is found
        Node current;
        //a pointer to the parent of current
        Node previous;
        //an int to keep track of the # of levels
        int levels;
        
        //set levels to zero, to start
        levels = 0;
        
        //step through the array and add each int to the tree
        for (int element : myArr)
        {
            //a node to add to the tree
            Node myNode;
            //add the int to the new node
            myNode = new Node(element);
            
            
            //if there is no root, add this as the root
            if (size == 0)
            {
                root = myNode;
                levels = 1;
            }//end if()
            
            //otherwise, find the right place
            else
            {
                //set current to point to the root of the tree
                current = root;
                //set previous to also point to the root
                previous = root;
                
                //continue until current is null (aka until current points
                //to the spot where the new node should be added
                while (current != null)
                {
                    //update previous before changing current
                    previous = current;
                    
                    //if the int we want to add is less than or equal to the int in the 
                    //node current points to
                    if (element <= current.getData())
                    {
                        //then advance current to point to the left child
                        //of the current node
                        current = current.getLeft();
                        //increment levels each time we go down a level
                        levels++;
                    }//end if
                    else
                    {
                        //otherwise advance current to point to its right child 
                        current = current.getRight();
                        //increment levels each time we go down a level
                        levels++;
                    }//end else
                }//end while
                
                //now that current is null, previous points to the node before it,
                //so the node we are adding will be a child of previous.
                if (element <= previous.getData())
                    previous.setLeft(myNode);
                else previous.setRight(myNode);
            }//end else
            
            //if levels is now larger than height, then update height
            if (height < levels)
                height = levels;
            
            //increment size for each element in the array
            size++;
        }//end for()
        
    }//end initializing constructor
    //******************************************************************
    //accessor methods
    public Node getRoot()
    {
        return root;
    }//end getRoot()
    
    public int getSize()
    {
        return size;
    }//end getSize()
    
    public int getHeight()
    {
        return height;
    }//end getLevel()
    
    //*************************************************************************
    //three traversal methods: preorder(), inorder(), and postorder()

    
    //preorder() accepts a Node as a parameter, assumes that the node is a root,
    //and traverses the tree using the pre-order algorithm (node, left, right), 
    //to print each node.  First, this method prints the data in the current node.
    //then, this method calls itself recursively using the current node's left
    //child (if it is not null) and then again using the current node's right child
    public void preorder(Node myNode)
    {
        System.out.print(myNode.getData());
        if(myNode.getLeft()!=null)
            preorder(myNode.getLeft());
        if(myNode.getRight()!=null)
            preorder(myNode.getRight());
    }//end preorder()
    //************************************************************************

    //inorder() accepts a Node as a parameter, assumes that the node is a root,
    //and traverses the tree using the inorder algorithm (left, node, right), 
    //to print each node.  First, this method calls itself recursively using the current node's left
    //child (if it is not null).  Then, this method prints the data in the current node.
    //Finally, this method calls itself recursively again using the current node's right child
    public void inorder(Node myNode)
    {
        
        if(myNode.getLeft()!=null)
            inorder(myNode.getLeft());
        System.out.print(myNode.getData());
        if(myNode.getRight()!=null)
            inorder(myNode.getRight());
    }//end inorder()
    //************************************************************************
    
    //postorder() accepts a Node as a parameter, assumes that the node is a root,
    //and traverses the tree using the post-order algorithm (left, right, node), 
    //to print each node.  First, this method calls itself recursively using the
    //current node's left child (if it is not null).  Then, this method calls 
    //itself recursively again using the current node's right child.  Finally,
    //this method prints the data in the current node.
    public void postorder(Node myNode)
    {
        if(myNode.getLeft()!=null)
            postorder(myNode.getLeft());
        if(myNode.getRight()!=null)
            postorder(myNode.getRight());
        System.out.print(myNode.getData() + " ");
    }//end postorder()
    //************************************************************************
  
    //search() will tell us whether an integer passed as a parameter is in the tree
    public boolean search(int myInt)
    {
        boolean existence;
        existence = false;
        
        
        
    }//end search
    
}//end class Tree
