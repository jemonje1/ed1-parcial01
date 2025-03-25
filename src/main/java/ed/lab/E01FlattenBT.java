package ed.lab;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null)
            return;

        LinkedList<TreeNode<Integer>> result = new LinkedList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        TreeNode<Integer> node=null;
        while (!stack.isEmpty()) {
            TreeNode<Integer> curr = stack.pop();
            if (node != null) {
                result.add(node);
                node.right = curr;
                node.left = null;
            }
            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);
            node = curr;
        }
    }
}
