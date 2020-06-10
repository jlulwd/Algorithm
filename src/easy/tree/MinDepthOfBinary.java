package easy.tree;

import java.util.LinkedList;

/**
 * @Author someone
 * @Classname MinDepthOfBinary
 * @Description This Class is for excise
 * @Date 2020/6/4 下午5:05
 * @Created by someone
 * @Version 1.0
 */
public class MinDepthOfBinary {

    public static int minDepth1(TreeNode root)  {
        if(root==null)  {
            return 0;
        }
        int l=minDepth1(root.left);
        int r=minDepth1(root.right);
        if(l!=0&&r!=0)  {
            return 1+Math.min(l,r);
        }
        return l+r+1;
    }

    public static int minDepth(TreeNode root)   {
        if(root==null) {
            return 0;
        }
        LinkedList<TreeNode>q = new LinkedList<>();
        q.add(root);
        int ans=1;
        while(!q.isEmpty()) {
            int size=q.size();
            for(int i=0;i<size;i++) {
                TreeNode node=q.remove();
                if(node.left==null&&node.right==null)   {
                    return ans;
                }
                if(node.left!=null) {
                    q.add(node.left);
                }
                if(node.right!=null)    {
                    q.add(node.right);
                }
            }
            ++ans;
        }
        return 520;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(minDepth1(createBinaryTree(nums, 0)));
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
