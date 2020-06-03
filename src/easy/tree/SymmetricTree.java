package easy.tree;

import java.util.LinkedList;

/**
 * @Author someone
 * @Classname SymmetricTree
 * @Description This Class is for excise
 * @Date 2020/6/3 下午2:26
 * @Created by someone
 * @Version 1.0
 */
public class SymmetricTree {

    private static boolean isSymmetricTree1(TreeNode root) {
        return root == null||helper(root.left,root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if(left==null||right==null) {
            return left == right;
        }
        if(left.val!=right.val) {
            return false;
        }
        return helper(left.left, right.right) && helper(left.right,right.left);
    }



    private static boolean isSymmetricTree2(TreeNode root) {
        if(root==null) {
            return true;
        }
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root.left);
        queue.add(root.right);
        TreeNode left, right;
        while(queue.size()>1)   {
            left=queue.pop();
            right=queue.pop();
            if(left==null&&right==null) {
                continue;
            }
            if(left==null||right==null) {
                return false;
            }
            if(left.val!=right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,2,3,4,4,3};
        TreeNode root=createBinaryTreeByArray(nums,0);
        System.out.println(isSymmetricTree2(root));
    }

    public static TreeNode createBinaryTreeByArray(int[] array, int index) {
        TreeNode treeNode = null;
        if (index < array.length) {
            int value = array[index];
            treeNode = new TreeNode(value);
            treeNode.left = createBinaryTreeByArray(array, 2 * index + 1);
            treeNode.right = createBinaryTreeByArray(array, 2 * index + 2);
            return treeNode;
        }
        return treeNode;
    }

    public static void printBinaryTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.val);
        printBinaryTree(treeNode.left);
        printBinaryTree(treeNode.right);
    }
}

