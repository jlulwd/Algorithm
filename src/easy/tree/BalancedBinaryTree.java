package easy.tree;

/**
 * @Author someone
 * @Classname BalancedBinaryTree
 * @Description This Class is for excise
 * @Date 2020/6/3 下午5:18
 * @Created by someone
 * @Version 1.0
 */
public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root)    {
        return helper(root)!=-1;
    }

    private static int helper(TreeNode node) {
        if(node==null) {
            return 0;
        }
        int l=helper(node.left);
        if(l==-1)   {
            return -1;
        }
        int r=helper(node.right);
        if(r==-1)   {
            return -1;
        }
        if(Math.abs(l-r)>1) {
            return -1;
        }
        return 1+Math.max(l,r);
    }

    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5,6,7,8,9,10};
        System.out.println(isBalanced(createBinaryTreeByArray(nums1,0)));

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
}
