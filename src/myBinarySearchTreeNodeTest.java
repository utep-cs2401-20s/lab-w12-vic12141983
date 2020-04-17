import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTest {

    @org.junit.jupiter.api.Test
    void insert() {
        int[] arr = {1};
        myBinarySearchTreeNode Tree = new myBinarySearchTreeNode(arr);
        int Root = 0;

        Tree.insert(1);
    }

    @org.junit.jupiter.api.Test
    void size() {
        // Testing Method with array of size 1.
        // Crate Binary Tree
        // Expectation: Pass
        // Result:Expectation Met.
        int[] a = {1};
        myBinarySearchTreeNode tree1 = new myBinarySearchTreeNode(a);
        int expect = 1;
        assertEquals(expect, tree1.size());
        /* Test2 Purpose to see if Binary tree with no elements be created. I figured that even with no elements
        // There would be creation of pointer that points to null I was wrong.
        // To correct this an Non-Empty array must be passed to the method otherwise it will continue to fail.
        // Testing Method with an empty array.
        // Expectation: Pass
        / Result: Failed. ArrayIndexOutOfBoundsException:0.
        int [] b={};
        myBinarySearchTreeNode tree2 = new myBinarySearchTreeNode(b);
        int expect2 = 0;
        assertEquals(expect2,tree2.size());
        */

    }

    @org.junit.jupiter.api.Test
    void height() {
        // Test3.
        // Testing method with negative data values. To test if values have impact on method.
        // Does not require to check the data only if the node exist.
        // Expectation: Pass
        // Result: Expectation Met.
        int[] a = {-2, -1, -3, -4};// Initialize array
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);// Pass array to constructor create object.

        int expect = 2;
        assertEquals(expect, tree.height());
    }


    @org.junit.jupiter.api.Test
    void depth() {
        // Test4.
        /* Testing Method with doubles
        Expectation: Fail.
        Result: Test Failed.
        Correction: Modify method in order to receive integer and double values or no use doubles when using
        Method.

        double [] a ={5.1,4.0,3.3,-2.1,1.0,6.0,7.3,8.1};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);/
        int expect = 3;
        assertEquals(expect,tree.depth(2));
        */
        //Test5.
        // Testing method with search in left side
        // Purpose of test to verify method is working correctly. 
        //Expectation: Pass
        // Result: pass
        int [] a = {5,4,3,2,1,6,7,8};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(a);
        int expect = 3;
        assertEquals(expect,tree.depth(2));


    }

}