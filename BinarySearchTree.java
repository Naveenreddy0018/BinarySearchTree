public class BinarySearchTree {
    class Node{
        Node left,right;
        int data;
        public Node(int data) {
            this.data=data;
            left=right=null;
        }
    }
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	void insert(int data) {
		root=insertRecursive(root,data);
		
	}
	Node insertRecursive(Node root,int data ) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left=insertRecursive(root.left,data);
		}
		else if(data>root.data) {
			root.right=insertRecursive(root.right,data);
		}
		return root;
	}
	void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public boolean search(int val) {
		return searchRecursive(root, val);
	}

	private boolean searchRecursive(Node root, int val) {
		if(root == null) {
			return false;
		}
		if(root.data == val) {
			return true;
		}
		else {
			if(val < root.data) {
				return searchRecursive(root.left, val);
			}
			else {
				return searchRecursive(root.right, val);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
		// bst.postorder(bst.root);
		boolean res = bst.search(3);
		if(res) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
		// preorder-5,3,2,4,8,7,9

		
		
		

	}

}
