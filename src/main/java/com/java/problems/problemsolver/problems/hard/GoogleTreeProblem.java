package com.java.problems.problemsolver.problems.hard;

import com.java.problems.problemsolver.problems.hard.structures.Node;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleTreeProblem {
    public int countUniversalSubtrees(List<Node> tree, Node root) {
        int total = 0;

        if(isUniversalTree(root)) {
            total++;
        }

        Node leftNode = root.getLeftChild();
        int left = 0;
        if(leftNode != null) {
            left = countUniversalSubtrees(tree, leftNode);
        }

        Node rightNode = root.getRightChild();
        int right = 0;
        if(rightNode != null) {
            right = countUniversalSubtrees(tree, rightNode);
        }

        return total + left + right;
    }
    
    public boolean isUniversalTree(Node root) {
        if(root == null)
            return false;

        if(hasChildren(root) && hasUnival(root, root.getValue()))
            return true;

        if(hasChildren(root) && !hasUnival(root, root.getValue()))
            return false;

        if(!hasChildren(root))
            return true;

        return false;
    }

    private boolean hasUnival(Node root, int value) {
        return value == root.getLeftChild().getValue() && value == root.getRightChild().getValue();
    }

    private boolean hasChildren(Node root) {
        return root.getLeftChild() != null && root.getRightChild() != null;
    }
}
