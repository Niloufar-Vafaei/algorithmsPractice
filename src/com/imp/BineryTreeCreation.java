package com.imp;

//Given the array nums,
// for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have
// to count the number of valid j's such that j != i and nums[j] < nums[i].
//Return the answer in an array.

/* Class containing left and right child of current
node and key value*/
//i just chenge the code that i can undrastand the push method
class Node {
    int key;
    Node left, right;
    int countLeft, countRight;

    public Node(int item) {
        key = item;
        left = right = null;
        countLeft = countRight = 0;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    private Node putRecursive(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (node.key > key) {
            node.countLeft++;
            node.left = putRecursive(node.left, key);
        } else {
            node.countRight++;
            node.right = putRecursive(node.right, key);
        }
        return node;
    }

    public void put(int key) {
        root = putRecursive(root, key);
    }

    private Node getRecursive(Node node, int key) {
        if (node == null)
            return null;

        if (node.key == key)
            return node;
        else if (node.key < key)
            return getRecursive(node.right, key);
        else if (node.key > key)
            return getRecursive(node.left, key);
        return node;
    }

    public int getNumberOfLessValue(int key) {
        Node n = getRecursive(root, key);
        if (n != null)
            return n.countLeft;
        else
            return 0;
    }

}

public class BineryTreeCreation {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < nums.length; i++) {
            bt.put(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = bt.getNumberOfLessValue(nums[i]);
        }
        return result;
    }
}

