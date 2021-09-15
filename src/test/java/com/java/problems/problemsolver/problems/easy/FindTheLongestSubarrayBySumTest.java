package com.java.problems.problemsolver.problems.easy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindTheLongestSubarrayBySumTest {
    public static final int[] INPUT_1 = new int[]{1, 2, 3, 7, 5};
    public static final int SUM_1 = 12;
    public static final int[] OUTPUT_1 = new int[] {2, 4};

    private FindTheLongestSubarrayBySum problem;

    @BeforeEach
    public void init() {
        problem = new FindTheLongestSubarrayBySum();
    }

    @Test
    public void bruteForceTest() {
        assertArrayEquals(OUTPUT_1, problem.bruteForceSolution(INPUT_1, SUM_1));
    }

    @Test
    public void slidingWindowTest() {
        assertArrayEquals(OUTPUT_1, problem.slidingWindowSolution(INPUT_1, SUM_1));
    }
}
