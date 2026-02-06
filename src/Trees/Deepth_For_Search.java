package Trees;

public class Deepth_For_Search {

	

	    static void dfsPreorder(TreeNode root) {
	        if (root == null) {
	            return;
	        }

	        System.out.print(root.val + " "); // visit root
	        dfsPreorder(root.left);           // go left
	        dfsPreorder(root.right);          // go right
	    }

	    public static void main(String[] args) {

	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.right = new TreeNode(6);

	        System.out.println("DFS (Preorder):");
	        dfsPreorder(root);
	    }
	}
