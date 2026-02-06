package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {



	

	    static void bfs(TreeNode root) {

	        if (root == null) return;

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);

	        while (!queue.isEmpty()) {

	            TreeNode curr = queue.poll();
	            System.out.print(curr.val + " ");

	            if (curr.left != null) {
	                queue.add(curr.left);
	            }

	            if (curr.right != null) {
	                queue.add(curr.right);
	            }
	        }
	    }

	    public static void main(String[] args) {

	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.right = new TreeNode(6);

	        System.out.println("BFS (Level Order):");
	        bfs(root);
	    }
	}
