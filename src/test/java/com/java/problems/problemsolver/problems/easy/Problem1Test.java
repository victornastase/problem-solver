package com.java.problems.problemsolver.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem1Test {
    private static final int[] INPUT_OK = new int[]{10, 15, 3, 7};
    private static final int[] INPUT_NOT_OK = new int[]{1, 4, 2, 5, 8};
    private static final int K = 17;

    private Problem1 problem;

    @BeforeEach
    public void init() {
        this.problem = new Problem1();
    }

    @Test
    public void testBrutForce() {
        assertTrue(problem.brutForceSolution(INPUT_OK, K));
        assertFalse(problem.brutForceSolution(INPUT_NOT_OK, K));
    }

    @Test
    public void testSetSolution() {
        assertTrue(problem.usingASet(INPUT_OK, K));
        assertFalse(problem.usingASet(INPUT_NOT_OK, K));
    }
}
