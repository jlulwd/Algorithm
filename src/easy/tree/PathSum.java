package easy.tree;

/**
 * @Author someone
 * @Classname PathSum
 * @Description This Class is for excise
 * @Date 2020/6/4 下午5:19
 * @Created by someone
 * @Version 1.0
 */
public class PathSum {

    public static boolean hasPathSum(TreeNode root, int sum)    {
        if(root==null)  {
            return false;
        }
        if(root.left==null&&root.right==null)   {
            return sum==root.val;
        }
        return hasPathSum(root.left, sum-root.val) ||hasPathSum(root.right, sum-root.val);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(hasPathSum(createBinaryTree(nums, 0),15));
    }

    public static TreeNode createBinaryTree(int []nums, int index) {
        TreeNode treeNode=null;
        while(index<nums.length) {
            treeNode=new TreeNode(nums[index]);
            treeNode.left=createBinaryTree(nums, 2*index+1);
            treeNode.right=createBinaryTree(nums, 2*index+2);
            return treeNode;
        }
        return treeNode;
    }
}
