package com.java.problems.problemsolver.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import com.java.problems.problemsolver.problems.hard.structures.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GoogleTreeProblemTest {
    private static final int RESULT = 5;

    private List<Node> tree;
    private GoogleTreeProblem problem;

    @BeforeEach
    public void init(){
        this.problem = new GoogleTreeProblem();
    }

    @Test
    public void testUnivalFunction() {
        //unival node
        Node univalNode = new Node(0);
        Node univalRightLeaf = new Node(0);
        Node univalLeftLeaf = new Node(0);
        univalNode.setLeftChild(univalLeftLeaf);
        univalNode.setRightChild(univalRightLeaf);
        //non-unival node
        Node nonUnivalNode = new Node(1);
        Node nonUnivalRightLeaf = new Node(0);
        Node nonUnivalLeftLeaf = new Node(0);
        nonUnivalNode.setLeftChild(nonUnivalLeftLeaf);
        nonUnivalNode.setRightChild(nonUnivalRightLeaf);

        assertFalse(problem.isUniversalTree(nonUnivalNode));
        assertTrue(problem.isUniversalTree(new Node(1)));
        assertTrue(problem.isUniversalTree(univalNode));
        assertFalse(problem.isUniversalTree(null));
    }

    @Test
    public void subtreeCountTest() {
        tree = createTree();
        problem.countUniversalSubtrees(tree, tree.get(0));

        assertEquals(RESULT, problem.countUniversalSubtrees(tree, tree.get(0)));
    }

    private List<Node> createTree() {
        List<Node> tree = new ArrayList<>();

        Node root = new Node(0);
        Node leaf1 = new Node(1);
        Node leaf2 = new Node(0);

        root.setLeftChild(leaf1);
        root.setRightChild(leaf2);

        tree.add(root);
        tree.add(leaf1);

        Node leaf3 = new Node(1);
        leaf2.setLeftChild(leaf3);

        Node leaf4 = new Node(0);
        leaf2.setRightChild(leaf4);

        tree.add(leaf4);
        tree.add(leaf2);

        Node leaf5 = new Node(1);
        Node leaf6 = new Node(1);
        leaf3.setLeftChild(leaf5);
        leaf3.setRightChild(leaf6);

        tree.add(leaf3);
        tree.add(leaf5);
        tree.add(leaf6);

        return tree;
    }
}
