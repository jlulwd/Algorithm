package difficult.tree;

/**
 * @Author someone
 * @Classname TreeSerDer
 * @Description This Class is for excise
 * @Date 2020/6/16 下午12:26
 * @Created by someone
 * @Version 1.0
 */
public class TreeSerDer {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder str = new StringBuilder();
            dfs1(root, str);
            return str.toString();
        }

        public void dfs1(TreeNode root, StringBuilder str) {
            if (root == null) { //先序遍历，先处理根节点
                str.append("#,");
                return;
            }
            str.append(root.val).append(",");
            dfs1(root.left, str);//再递归遍历左子树
            dfs1(root.right, str);
        }

        int index = 0;//记录遍历到的string的下标

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            return dfs2(data);
        }

        public TreeNode dfs2(String data) {
            if (data.charAt(index) == '#') {
                index += 2;//跳过‘#’，和‘，’
                return null;
            }
            boolean is_minus = false;
            if (data.charAt(index) == '-') {
                is_minus = true;
                index++;//跳过减号
            }
            int t = 0;
            while (data.charAt(index) != ',') {
                t = t * 10 + data.charAt(index) - '0';
                index++;//算好一个数的每位数
            }
            index++;//跳过逗号
            if (is_minus) {
                t = -t;
            }
            TreeNode root = new TreeNode(t);
            root.left = dfs2(data);
            root.right = dfs2(data);
            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));


}
