

	public static int getHeight(Node root){
        if (root == null){
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rigthHeigtht = getHeight(root.right);
        int max = (leftHeight > rigthHeigtht) ? leftHeight : rigthHeigtht;
        return 1 + max;
    }

