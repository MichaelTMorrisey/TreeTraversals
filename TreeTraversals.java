/*
This program written by Michael Morrisey
for CSCI 211 at CCP with Chuck Herbert
last updated 3/23/16

This package contains 3 classes: this executable file, a Tree class, and
a Node class.  This executable file tests the methods contained in the 
Tree class.  This file creates an int array, initializes a new Tree object
using that array, and then traverses the tree using each of the three traversal
algorithms.  The program then prints the max and min of the array. Finally
the tree is searched for a specific int.
 */
package treetraversals;

/**
 *
 * @author Michael.T.Morrisey
 */
public class TreeTraversals {

    
    public static void main(String[] args) 
    {
        //an int array from which to create a tree
        int[] myArray;
        Tree myTree;
        //a boolean to use when searching the tree, to indicate whether the
        //int being searched for has been found
        boolean found;
        //an int to search for
        int searchForThis;
        
        myArray = new int[]{72,64,108,2,3,99,244,12,1,500,664,665,667,8,9,7,12,4,73,75,88,87,6,5};
        myTree = new Tree(myArray);
        
        System.out.println("Now traversing the tree using the preorder algorithm"
                + " to print the data.");
        myTree.preorder(myTree.getRoot());
        System.out.println("\nNow traversing the tree using the inorder algorithm"
                + " to print the data.");
        myTree.inorder(myTree.getRoot());
        System.out.println("\nNow traversing the tree using the postorder algorithm"
                + " to print the data.");
        myTree.postorder(myTree.getRoot());
        
        System.out.println("\nThe max value = " + myTree.max());
        System.out.println("The min value = " + myTree.min());
        
        System.out.println("The tree is " + myTree.getHeight() + " levels high"
                + " and contains " + myTree.getSize() + " nodes.");
        
        
        //search for something that IS NOT in the array
        searchForThis = 27;
        found = myTree.search(searchForThis);
        if(found)
            System.out.println(searchForThis + " is in the tree.");
        else
            System.out.println(searchForThis + " is not in the tree.");
        
        //search for somethign that IS in the array
        searchForThis = 87;
        found = myTree.search(searchForThis);
        if(found)
            System.out.println(searchForThis + " is in the tree.");
        else
            System.out.println(searchForThis + " is not in the tree.");
        
        
    }//end main()
    

    
    
}//end class TreeTraversals
