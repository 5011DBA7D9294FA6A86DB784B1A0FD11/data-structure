package com.maxwit.binaryTree;

public class BinaryTree {
    public <T> void preOrder(BinaryTreeNode<T> tree) {
        if (tree != null) {
            System.out.println(tree.getData());
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }

    public <T> void inOrder(BinaryTreeNode<T> tree) {
        if (tree != null) {
            inOrder(tree.getLeft());
            System.out.println(tree.getData());
            inOrder(tree.getRight());
        }
    }

    public <T> void postOrder(BinaryTreeNode<T> tree) {
        if (tree != null) {
            postOrder(tree.getLeft());
            postOrder(tree.getRight());
            System.out.println(tree.getData());
        }
    }
}
