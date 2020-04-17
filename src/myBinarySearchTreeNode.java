class myBinarySearchTreeNode {
    int myValue;
    myBinarySearchTreeNode left;
    myBinarySearchTreeNode right;

    myBinarySearchTreeNode(int inValue) {
        //Constructor assigns the inValue to the new Node with null pointers.
        myValue = inValue;


    }

    myBinarySearchTreeNode(int[] A) {
        // Constructor Assigns the first index of Array as Root of Binary Tree
        myValue = A[0];
        // Rest of the Array gets inserted accordingly based of the Root.
        for (int i = 1; i < A.length; i++) {
            insert(A[i]);

        }


    }

    public void insert(int inValue) {
        // First check if the insert value is less than the root.
        if (inValue < myValue) {
            // And left is null insert the inValue as the new Node to left of the Root.
            if (left == null) {
                left = new myBinarySearchTreeNode(inValue);
                // If left is not null then recursively call until the left is pointing to null and create new Node with inValue
            } else {
                left.insert(inValue);
            }
            // Checking if inValue is Greater than Root
        } else if (inValue > myValue) {
            // Then check if Right is null. Create New Node to right of Root with inValue
            if (right == null) {
                right = new myBinarySearchTreeNode(inValue);
                // if right is not null recursively call until find null pointer and creates Node in Correct location.
            } else {
                right.insert(inValue);
            }

        }
    }

    // Calculates the Size of the Binary Tree.
    public int size() {
        // Initialize SumSize to zero this will keep track of adding Nodes of Binary Tree.
        int SumSize = 0;
        // If left pointer of Root is not null then Add sumSize to the Left and recursively call until pointer is null.
        if (left != null) {
            SumSize += left.size();
        }
        // If Right Pointer of Root is not null then Add SumSize to the right and Recursively call until pointer is null.
        if (right != null) {
            SumSize += right.size();
        }
        // Return sumSize After Traversing Left And Right SumSize has the Number of Nodes Plus the Root and returns Total
        // Nodes.
        return SumSize + 1;
    }


    public int height() {
        int L = 0;// Initialize variable to keep track of left
        int R = 0;// Initialize variable to keep track of right
        if (left != null) { // check if left pointer is not null

            L = left.height() + 1;// recursive call and adding to left
            // print Statements for debugging.
           //  System.out.print(L);
          //   System.out.println(" Space between right and lef");

        }
        if (right != null) {//Checking if right pointer is not null
            R = right.height() + 1;// recursive call and adding to right and keeping count
            //Print Statements for Debugging.
           //System.out.print(R);
          //System.out.println();
        }
        //System.out.print(1+Math.max(L,R));
        return Math.max(L, R);// getting the max of the two and returning either left or the Right


    }

    // Depth of the Tree depending on Node Key or Node that is being Searched.
    public int depth(int search) {

        // Checking if search is less than the root and ensuring left pointer is not null.
        if (search < myValue && left != null) {
            // Recursive call to the current node until search is found
            int noDe = left.depth(search);
            // if the search is not found and last Node points to null return -1;
            if (noDe == -1) {
                return -1;
            } else {
                // return the node plus the edges giving the depth where Search was found.
                return noDe + 1;
            }
        }
        // if Search is greater than the Root and Root is not null
        if (search > myValue && right != null) {
            // Recursive Call to the right subtree starting with Roots right Child.
            int noDe = right.depth(search);
            // if search is not found and las node is pointing to null return -1;
            if (noDe == -1) {
                return -1;
            }
            // If found return the Node plus the edges to determine the depth.
            else {
                return noDe + 1;
            }
        }
        // if Search value is the same as the Root Value Return 0. Tree Level will be 0.
        if (search == myValue) {
            return 0;
        }
        // if not found return -1.
        return -1;

    }

    // Utility function included so you can debug your solution.
    public void print() {
        print("");
    }

    private void print(String prefix) {
        System.out.println(prefix + myValue);
        prefix = prefix.replace('\u251C', '\u2502');
        prefix = prefix.replace('\u2514', ' ');
        if (left != null) left.print(prefix + "\u251C ");
        if (right != null) right.print(prefix + "\u2514 ");
    }

    // Second print method Provided by Antoine to debug as well.
    public void print2() {
        System.out.println("==========");
        System.out.println("Root: " + myValue);

        if (left != null)
            System.out.println("Left: " + left.myValue);
        else
            System.out.println("Left: none");

        if (right != null)
            System.out.println("Right: " + right.myValue);
        else
            System.out.println("Right: none");


        if (left != null)
            left.print2();
        if (right != null)
            right.print2();
    }

} 
