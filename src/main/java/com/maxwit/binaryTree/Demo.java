package com.maxwit.binaryTree;

public class Demo {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8, null, null);
        BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7, null, null);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6, node8, null);
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5, null, null);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4, null, node7);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3, node5, node6);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2, node4, null);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1, node2, node3);

        BinaryTree tree = new BinaryTree();
        System.out.println("preOrder :");
        tree.preOrder(node1);
        System.out.println("inOrder :");
        tree.inOrder(node1);
        System.out.println("postOrder :");
        tree.postOrder(node1);
    }
}
