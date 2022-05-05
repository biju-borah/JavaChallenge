package Traversal;

public class Preorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int index = -1;

        Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node node = new Node(nodes[index]);
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }

        void traversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            traversal(root.left);
            traversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        binaryTree.traversal(root);
    }
}
