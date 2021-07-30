package com.java.problems.problemsolver.problems.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem4Test {
    private static final int[] INPUT_ONE = new int[]{3, 4, -1, 1};
    private static final int OUTPUT_ONE = 2;

    private static final int[] INPUT_TWO = new int[]{1, 2, 0};
    private static final int OUTPUT_TWO = 3;

    private Problem4 problem;

    @BeforeEach
    public void init() {
        this.problem = new Problem4();
    }

    @Test
    public void testSolutionInputOne() {
        assertEquals(OUTPUT_ONE, problem.linearTimeAndConstantSpace(INPUT_ONE));
    }

//    @Test
//    public void testSolutionInputTwo() {
//        assertEquals(OUTPUT_TWO, problem.linearTimeAndConstantSpace(INPUT_TWO));
//    }
}
