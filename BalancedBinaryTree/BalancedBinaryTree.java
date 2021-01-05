import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    private static class NodeDepthPair {

        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static boolean isBalanced(BinaryTreeNode treeRoot) {

        if (treeRoot == null) {
            return true;
        }

        List<Integer> depths = new ArrayList<Integer>();

        Deque<NodeDepthPair> nodes = new ArrayDeque<NodeDepthPair>();
        nodes.push(new NodeDepthPair(treeRoot, 0));

        while (!nodes.isEmpty()) {

            NodeDepthPair nodeDepthPair = nodes.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            if (node.left == null && node.right == null) {

                if (!depths.contains(depth)) {
                    depths.add(depth);

                    if (depths.size() > 2 || (depths.size() == 2
                            && Math.abs(depths.get(0) - depths.get(1)) > 1)) {
                        return false;
                    }
                }

            } else {
                if (node.left != null) {
                    nodes.push(new NodeDepthPair(node.left, depth + 1));
                }
                if (node.right != null) {
                    nodes.push(new NodeDepthPair(node.right, depth + 1));
                }
            }
        }

        return true;
    }
}