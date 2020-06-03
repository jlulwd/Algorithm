package easy.tree;

/**
 * @Author someone
 * @Classname SameTree
 * @Description This Class is for excise
 * @Date 2020/6/2 下午1:04
 * @Created by someone
 * @Version 1.0
 */
public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5,6};
        int [] nums2={1,2,3,5,5};
        TreeNode t1=createBinaryTreeByArray(nums1,0);
        printBinaryTree(t1);
        TreeNode t2=createBinaryTreeByArray(nums2,0);
        printBinaryTree(t2);
        System.out.println(isSameTree(t1,t2));
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

