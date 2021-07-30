package com.java.problems.problemsolver.problems.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem2Test {
    private static final int[] INPUT_ONE = new int[]{1, 2, 3, 4, 5};
    private static final int[] OUTPUT_ONE = new int[]{120, 60, 40, 30, 24};
    private static final int[] REVERSED_INPUT_ONE = new int[] {5, 4, 3, 2, 1};

    private static final int[] INPUT_TWO = new int[]{3, 2, 1};
    private static final int[] OUTPUT_TWO = new int[]{2, 3, 6};

    private Problem2 problem;

    @BeforeEach
    public void init() {
        this.problem = new Problem2();
    }

    @Test
    public void testReverseArray() {
        assertArrayEquals(REVERSED_INPUT_ONE, problem.reverseArray(INPUT_ONE));
    }

    @Test
    public void testDivisionMethod() {
        assertArrayEquals(OUTPUT_ONE, problem.divisionMethod(INPUT_ONE));
        assertArrayEquals(OUTPUT_TWO, problem.divisionMethod(INPUT_TWO));
    }

    @Test
    public void testPrefixSuffixMethod() {
        assertArrayEquals(OUTPUT_ONE, problem.prefixSuffixMethod(INPUT_ONE));
        assertArrayEquals(OUTPUT_TWO, problem.prefixSuffixMethod(INPUT_TWO));
    }
}
