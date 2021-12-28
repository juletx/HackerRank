

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if (root == null){
            return -1;
        }
        int leftHeight = height(root.left);
        int rigthHeigtht = height(root.right);
        int max = (leftHeight > rigthHeigtht) ? leftHeight : rigthHeigtht;
        return 1 + max;
    }

