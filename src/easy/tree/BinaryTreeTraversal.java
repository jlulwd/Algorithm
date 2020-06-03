package easy.tree;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author someone
 * @Classname BinaryTreeTraversal
 * @Description This Class is for excise
 * @Date 2020/6/3 下午3:39
 * @Created by someone
 * @Version 1.0
 */
public class BinaryTreeTraversal {

    public static List<List<Integer>> levelOrderBottom1(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> list = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                sub.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(0, sub);
        }
        return list;
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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println((levelOrderBottom2(createBinaryTreeByArray(nums, 0))).toString());

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
