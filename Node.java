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
public class Node 
{
    //each Node contains a pointer to the left child and to the right child
    private Node leftChild;
    private Node rightChild;
    
    //each node contains integer data
    private int data;
    
    //*********************************************************************
    //null constructor
    Node()
    {
        leftChild = null;
        rightChild = null;
    }//end Node() null constructor
    
    //initializing constructor
    Node(int myData)
    {
        leftChild = null;
        rightChild = null;
        data = myData;
    }//end Node() initializing constructor
    //*********************************************************************
    public void setLeft(Node myLeft)
    {
        leftChild = myLeft;
    }//end setLeft()
    
    public void setRight(Node myRight)
    {
        rightChild = myRight;
    }//end setRight()
    
    public void setData(int myData)
    {
        data = myData;
    }//end setData()
    
    public Node getLeft()
    {
        return leftChild;
    }//end getLeft()
    
    public Node getRight()
    {
        return rightChild;
    }//end getRight()
    
    public int getData()
    {
        return data;
    }//end getData()
    
    @Override
    public String toString()
    {
        String result;
        result = "Data = " + data;
        return result;
    }//end toString()
    
   
    
}//end class Node
