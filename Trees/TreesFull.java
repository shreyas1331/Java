package Trees;
import java.util.*;
//this contains
// ->bfs,
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int key) {
        data = key;
        left = right = null;
    }
}
public class TreesFull {
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void preorder(TreeNode root) {
        if (root != null) {
        	System.out.print(root.data + " ");
        	preorder(root.left);
        	preorder(root.right);
        }
    }
    public static void postorder(TreeNode root) {
        if (root != null) {
        	postorder(root.left);
        	postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void levelOrder(TreeNode root) {
    	Queue<TreeNode> q =new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		TreeNode cur=q.poll();
    		System.out.print(cur.data+ " ");
    		if(cur.left!=null) {
    			q.add(cur.left);
    		}
    		if(cur.right!=null) {
    			q.add(cur.right);
    		}
    	}
    }
    public static int height(TreeNode root) {
    	if(root==null) return 0;
    	return (Math.max(height(root.left), height(root.right))+1);
    }
    public static int diameter(TreeNode root,int[]ans){
		if(root==null)return 0;
		
		int left=diameter(root.left, ans);
		int right=diameter(root.right, ans);
		
		ans[0]=Math.max(ans[0],left+right);
		return Math.max(left,right) +1;
	} 
    public static int maxInTree(TreeNode root) {
    	if(root==null) return Integer.MIN_VALUE;
    	else
    		return Math.max(root.data, Math.max(maxInTree(root.left), maxInTree(root.right)));
    	
    }
    public static TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of ele");
        TreeNode root = null;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        inorder(root);        System.out.println();
        preorder(root);		  System.out.println();
        postorder(root);      System.out.println();
        levelOrder(root);     System.out.println();
        System.out.print(height(root));
        
        int[]ans={0};
		int dia=diameter(root,ans);
		System.out.println(dia+" "+ans[0]);
		
		System.out.println(maxInTree(root)+" max in tree");

    }
}
