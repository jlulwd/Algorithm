package easy.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author someone
 * @Classname SortedArray2BST
 * @Description This Class is for excise
 * @Date 2020/6/3 下午4:40
 * @Created by someone
 * @Version 1.0
 */
public class SortedArray2BST {

    public static TreeNode sortedArray2BST(int[] nums)  {
        if(nums==null||nums.length==0) {
            return null;
        }
        return helper(nums,0, nums.length-1);
    }

    private static TreeNode helper(int[] nums, int left, int right) {
        if(left>right) {
            return null;
        }
        int mid=(left+right)>>>1;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=helper(nums,left,mid-1);
        node.right=helper(nums,mid+1,right);
        return node;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(levelOrderBottom2(sortedArray2BST(nums)).toString());
    }
    public static List<List<Integer>> levelOrderBottom2(TreeNode root)  {
        List<List<Integer>> list=new LinkedList<>();
        helper(list, root, 0);
        return list;
    }

    private static void helper(List<List<Integer>> list, TreeNode root, int level) {
        if(root==null) {
            return;
        }
        if(level>=list.size())  {
            list.add(0, new LinkedList<>());
        }
        helper(list, root.left, level+1);
        helper(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }
}
