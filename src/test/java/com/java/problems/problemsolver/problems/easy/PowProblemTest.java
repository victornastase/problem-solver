package com.java.problems.problemsolver.problems.easy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowProblemTest {
    private static final int BASE_2 = 2;

    private static final int EXP_4 = 4;
    private static final int EXP_10 = 10;
    private static final int EXP_25 = 25;

    private static final int RESULT_2_4 = 16;
    private static final int RESULT_2_10 = 1024;
    private static final int RESULT_2_25 = 33554432;

    private PowProblem problem;

    @BeforeEach
    public void init() {
        this.problem = new PowProblem();
    }

    @Test
    public void naiveTest() {
        assertEquals(RESULT_2_4, problem.powNaiveSolution(BASE_2, EXP_4));
        assertEquals(RESULT_2_10, problem.powNaiveSolution(BASE_2, EXP_10));
        assertEquals(RESULT_2_25, problem.powNaiveSolution(BASE_2, EXP_25));
    }

    @Test
    public void enhancedTabTest() {
        assertEquals(RESULT_2_4, problem.powTabSolution(BASE_2, EXP_4));
        assertEquals(RESULT_2_10, problem.powTabSolution(BASE_2, EXP_10));
        assertEquals(RESULT_2_25, problem.powTabSolution(BASE_2, EXP_25));
    }

    @Test
    public void evenOddPowTest() {
        assertEquals(RESULT_2_4, problem.pow(BASE_2, EXP_4));
        assertEquals(RESULT_2_10, problem.pow(BASE_2, EXP_10));
        assertEquals(RESULT_2_25, problem.pow(BASE_2, EXP_25));
    }
}
