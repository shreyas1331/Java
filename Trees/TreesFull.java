package Trees;

import java.util.Scanner;

//this contains
// ->
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
            System.out.println(root.data + " ");
            inorder(root.right);
        }
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
        TreeNode root = null;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        inorder(root);

    }
}
