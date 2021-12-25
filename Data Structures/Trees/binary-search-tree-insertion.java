

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root, int data) {
        if(root == null){
            root = new Node(data);
        }
        else if(root.data > data){
            root.left = insert(root.left, data);
        }
        else if(root.data < data){
            root.right = insert(root.right, data);
        }
        return root;
    }

