package datastructures.trees.preorder_traversal;

import java.util.Stack;

public class Solution {
    void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    void preOrderStack(Node root) {
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()) {
            Node currentNode = nodeStack.pop();
            if(currentNode.right != null) {
                nodeStack.push(currentNode.right);
            }

            if(currentNode.left != null) {
                nodeStack.push(currentNode.left);
            }

            System.out.print(currentNode.data+" ");
        }
    }

    void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data + " ");
    }


    void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

}
