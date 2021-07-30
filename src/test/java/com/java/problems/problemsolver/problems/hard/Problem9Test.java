package com.java.problems.problemsolver.problems.hard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem9Test {
    private static final int[] INPUT_ONE = new int[]{2, 4, 6, 2, 5};
    private static final int[] INPUT_TWO = new int[]{5, 1, 1, 5};

    private static final int RESULT_ONE = 13;
    private static final int RESULT_TWO = 10;

    private Problem9 problem;

    @BeforeEach
    public void init() {
        this.problem = new Problem9();
    }

    @Test
    public void testFirstApproach() {
        assertEquals(RESULT_ONE, problem.firstApproach(INPUT_ONE));
        assertEquals(RESULT_TWO, problem.firstApproach(INPUT_TWO));
    }
}
