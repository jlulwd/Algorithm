package easy.tree;

/**
 * @Author someone
 * @Classname MaximumDepthOfBinaryTree
 * @Description This Class is for excise
 * @Date 2020/6/3 下午3:17
 * @Created by someone
 * @Version 1.0
 */
public class MaximumDepthOfBinaryTree {

    private static int maxDepth(TreeNode root) {
        if(root==null)  {
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxDepth(createBinaryTree(nums, 0)));
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
